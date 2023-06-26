import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		System.out.println("File name: Test3.java");
		int i;
		System.out.println("Scope: main function");
		System.out.println("Event: variable declaration. Variable name: total; Data type: int; Initial value: 100;");
		System.out.println("Event: variable declaration. Variable name: seed; Data type: long;  Initial value: 1234567896189L;");
		System.out.println("Event: variable declaration. Variable name: totalArray; Data type: int[];");
		for(i=0; i<total; i++) {
			int num = i + 1;
			totalArray[i] = num;
			System.out.println("Scope: main function. Event: variable assignment. Variable name: totalArray[" + i + "]; Value after assignment: " + totalArray[i] + ";");
		}

		Random rnd = new Random(seed);
		System.out.println("Scope: main function. Event: variable declaration. Data type: Random;");
		for(i=0; i<totalArray.length; i++) {
			System.out.println("Scope: main function. Event: expression eval. Expression: int rndIndex = rnd.nextInt(totalArray.length);");
			int rndIndex = rnd.nextInt(totalArray.length);
			System.out.println("Scope: main function. Event: variable declaration. Variable name: temp; Data type: int; Value after assignment: " + totalArray[rndIndex] + ";");
			System.out.println("Scope: main function. Event: variable assignment. Variable name: totalArray[" + rndIndex + "]; Value after assignment: " + totalArray[i] + ";");
			int temp = totalArray[rndIndex];
			System.out.println("Scope: main function. Event: variable assignment. Variable name: totalArray[" + i + "]; Value after assignment: " + temp + ";");
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		System.out.println("Scope: main function. Event: variable declaration. Data type: TreeMap;");
		for(i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Scope: main function. Event: function call. Function name: put. Return type: void. Parameters: (" + totalArray[i] + ", " + totalArray[i] + ");");
		}

		for(i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
			System.out.println("Scope: main function. Event: variable assignment. Variable name: totalArray[" + i + "]; Value after assignment: " + totalArray[i] + ";");
		}
	}
}