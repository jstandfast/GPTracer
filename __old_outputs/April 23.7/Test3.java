import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		
		String classScope = "Top Level Scope";
		System.out.println("Source File Name: Test3.java");
		System.out.println("Current Scope: " + classScope + "\n");
		
		for(int i=0; i<total; i++) {
			int num = i + 1;
			totalArray[i] = num;
			System.out.println("Line 18: Variable Assignment. Variable Name: totalArray, Initial Value: " + 
			                   totalArray[i] + ", Modified Value: " + totalArray[i] + ", Scope: " + classScope + 
			                   ", Data Type: int, Modifiers: None, Resulting Effect: None");
		}

		Random rnd = new Random(seed);
		String rndObjScope = "Random Object Scope";
		System.out.println("\nCurrent Scope: " + rndObjScope + "\n");
		
		for(int i=0; i<totalArray.length; i++) {
			int rndIndex = rnd.nextInt(totalArray.length);
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
			
			System.out.println("Line 30: Variable Declaration. Variable Name: rndIndex, Initial Value: " + rndIndex + 
			                   ", Scope: " + rndObjScope + ", Data Type: int, Modifiers: None, Resulting Effect: None");
			System.out.println("Line 31: Variable Assignment. Variable Name: temp, Initial Value: " + temp + 
			                   ", Modified Value: " + temp + ", Scope: " + rndObjScope + ", Data Type: int, Modifiers: None, Resulting Effect: None");
			System.out.println("Line 32: Variable Assignment. Variable Name: totalArray[rndIndex], Initial Value: " + 
			                   totalArray[rndIndex] + ", Modified Value: " + totalArray[rndIndex] + ", Scope: " + classScope + 
			                   ", Data Type: int, Modifiers: None, Resulting Effect: None");			
			System.out.println("Line 33: Variable Assignment. Variable Name: totalArray[i], Initial Value: " + 
			                   totalArray[i] + ", Modified Value: " + totalArray[i] + ", Scope: " + classScope + 
			                   ", Data Type: int, Modifiers: None, Resulting Effect: None\n");
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		String mapObjScope = "Sorted Map Object Scope";
		System.out.println("Current Scope: " + mapObjScope + "\n");
		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Line 42: Function Call. Function Name: put, Function Return Type: void, Function Parameters: " + 
			                   "key = " + totalArray[i] + ", value = " + totalArray[i] + ", Scope: " + mapObjScope + ", Resulting Effect: Updates key-value mapping in the 'map' object");
		}

		for(int i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
			System.out.println("Line 49: Variable Assignment. Variable Name: totalArray[i], Initial Value: " + 
			                   totalArray[i] + ", Modified Value: " + totalArray[i] + ", Scope: " + classScope + 
			                   ", Data Type: int, Modifiers: None, Resulting Effect: None\n");
		}
	}
}