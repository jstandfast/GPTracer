import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;
public class Test3 {
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];
	public static SortedMap<Integer,Integer> map=new TreeMap<>();
	public static void main(String[] args) {
		String sourceFileName="Test3.java";
		String specificScopeName="main";
		for(int i=1;i<=total;i++)
			totalArray[i-1]=i;
		printDetails(sourceFileName,specificScopeName,12,"Variable Declaration","rnd","Random",null,null,null,null);
		Random rnd = new Random(seed);
		printDetails(sourceFileName,specificScopeName,14,"Variable Declaration","rndIndex","int",null,null,null,null);
		printDetails(sourceFileName,specificScopeName,14,"Variable Declaration","temp","int",null,null,null,null);
		for (int i = 0; i < totalArray.length; i++) {
			printDetails(sourceFileName,specificScopeName,16,"Expression evaluation","rnd.nextInt(totalArray.length)","int",null,null,null,null);
			int rndIndex = rnd.nextInt(totalArray.length);
			printDetails(sourceFileName,specificScopeName,17,"Variable Assignment","temp","int",null,null,"totalArray[rndIndex]="+totalArray[rndIndex]+",totalArray[i]="+totalArray[i]+",temp="+temp);
			int temp = totalArray[rndIndex];
			printDetails(sourceFileName,specificScopeName,18,"Variable Assignment","totalArray[rndIndex]","int",null,null,"totalArray[rndIndex]="+totalArray[rndIndex]+",totalArray[i]="+totalArray[i]+",temp="+temp);
			totalArray[rndIndex] = totalArray[i];
			printDetails(sourceFileName,specificScopeName,19,"Variable Assignment","totalArray[i]","int",null,null,"totalArray[rndIndex]="+totalArray[rndIndex]+",totalArray[i]="+totalArray[i]+",temp="+temp);
			totalArray[i] = temp;
		}
		for (int i = 0; i < totalArray.length; i++) {
			printDetails(sourceFileName,specificScopeName,22,"Function Call","map.put(totalArray[i],totalArray[i])","void","put",new String[]{"int","int"},new Object[]{totalArray[i],totalArray[i]},null);
			map.put(totalArray[i],totalArray[i]);
		}
		for (int i = 0; i < totalArray.length; i++) {
			printDetails(sourceFileName,specificScopeName,25,"Variable Assignment","totalArray[i]","int",null,null,"map.get(i+1)="+map.get(i+1));
			totalArray[i] = map.get(i+1);
		}
	}
	private static void printDetails(String sourceFileName,String specificScopeName,int lineNumber,String eventType,String varName,String varType,String[] funcParamTypes,Object[] funcParamValues,String resultingEffect) {
		String log="";
		log+="Source File Name: "+sourceFileName+" | ";
		if(specificScopeName!=null) 
			log+="Specific Scope Name: "+specificScopeName+" | ";
		log+="Line Number: "+lineNumber+" | ";
		log+="Event Type: "+eventType+" | ";
		if(varName!=null) 
			log+="Variable Name: "+varName+" | ";
		if(varType!=null) 
			log+="Variable Type: "+varType+" | ";
		if(funcParamTypes!=null && funcParamValues!=null) {
			log+="Function Parameters: ";
			for(int i=0;i<funcParamTypes.length;i++) {
				if(i==0) log+="(";
				log+=funcParamTypes[i]+"="+funcParamValues[i];
				if(i!=funcParamTypes.length-1) log+=",";
				else log+=")";
			}
			log+=" | ";
		}
		if(resultingEffect!=null) 
			log+="Resulting Effect: "+resultingEffect+" | ";
		System.out.println(log);
	}
}