import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		
		System.out.println("File Name: Test3.java");
		System.out.println("Scope: main");
		System.out.println("Event: Variable Declaration");
		System.out.println("Line Number: 9");
		System.out.println("Details: Declared integer constant named 'total' with a value of 100.");
		for(int i=0; i<total; i++) {
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Variable Declaration");
			System.out.println("Line Number: 13");
			System.out.println("Details: Declared integer variable named 'num' and initialized it with value of i+1.");
			int num = i + 1;
			totalArray[i] = num;
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Array Element Assignment");
			System.out.println("Line Number: 15");
			System.out.println("Details: Assigned " + num + " to " + "totalArray[" + i + "].");
		}

		Random rnd = new Random(seed);
		
		System.out.println("File Name: Test3.java");
		System.out.println("Scope: main");
		System.out.println("Event: Variable Declaration");
		System.out.println("Line Number: 18");
		System.out.println("Details: Declared an instance of Random class named 'rnd' with a seed value of 1234567896189L.");
		for(int i=0; i<totalArray.length; i++) {
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Variable Assignment");
			System.out.println("Line Number: 22");
			System.out.println("Details: Assigned a randomly generated integer to 'rndIndex'");
			int rndIndex = rnd.nextInt(totalArray.length);
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Array Element Assignment");
			System.out.println("Line Number: 25");
			System.out.println("Details: Reassigned value of 'temp' to 'totalArray[" + rndIndex + "]'.");
			totalArray[i] = temp;
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Array Element Assignment");
			System.out.println("Line Number: 26");
			System.out.println("Details: Reassigned value of 'temp' to 'totalArray[" + i + "]'.");
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		
		System.out.println("File Name: Test3.java");
		System.out.println("Scope: main");
		System.out.println("Event: Variable Declaration");
		System.out.println("Line Number: 29");
		System.out.println("Details: Declared an instance of SortedMap interface named 'map'.");
		for(int i=0; i<totalArray.length; i++) {
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Method Call");
			System.out.println("Line Number: 32");
			System.out.println("Details: Called put method to insert a key-value pair in 'map'");
			map.put(totalArray[i],totalArray[i]);
		}

		for(int i=0; i<totalArray.length; i++) {
			
			System.out.println("File Name: Test3.java");
			System.out.println("Scope: main");
			System.out.println("Event: Array Element Assignment");
			System.out.println("Line Number: 36");
			System.out.println("Details: Reassigned value of 'map.get(i+1)' to 'totalArray[" + i + "]'.");
			totalArray[i] = map.get(i+1);
		}
	}
	
	System.out.println("File Name: Test3.java");
	System.out.println("Scope: main");
	System.out.println("Event: Program Finish");
	System.out.println("Line Number: 40");
	System.out.println("Details: Program executed successfully.");
}