import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;


public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		
		System.out.println("File name: Test3.java");
		System.out.println("Scope: main()");
		System.out.println("Line 20: Variable declaration. total = " + total + ", data type = integer, const modifier = final");
		System.out.println("Line 21: Variable declaration. seed = " + seed +", data type = long, const modifier = final");
		System.out.println("Line 22: Variable declaration. totalArray = new int[total], data type = integer array");

		System.out.println("Line 25: For loop. Variable i declared and initialized to 0. Condition: i < total. Increment expression: i++");
		for(int i=0; i<total; i++) {
			System.out.println("Line 27: Variable declaration. num = " + (i + 1) + ", type: integer");
			System.out.println("Line 29: Array element assignment. Array: totalArray. Index: " + i + ", New Value: " + (i+1));
			int num = i + 1;
			totalArray[i] = num;
		}

		Random rnd = new Random(seed);
		System.out.println("Line 33: Variable declaration. rnd is an object of class Random with seed " + seed);
		System.out.println("Line 36: For loop. Variable i declared and initialized to 0. Condition: i < totalArray.length. Increment expression: i++");
		for(int i=0; i<totalArray.length; i++) {
			System.out.println("Line 38: Variable declaration. rndIndex = " + rnd.nextInt(totalArray.length) + ", type: integer");
			int rndIndex = rnd.nextInt(totalArray.length);
			System.out.println("Line 39: Variable declaration. temp = totalArray[" + rndIndex + "] = " + totalArray[rndIndex]);
			int temp = totalArray[rndIndex];
			System.out.println("Line 40: Array element assignment. Array: totalArray. Index: " + rndIndex + ", New Value: " + totalArray[i]);
			totalArray[rndIndex] = totalArray[i];
			System.out.println("Line 41: Array element assignment. Array: totalArray. Index: " + i + ", New Value: " + temp);
			totalArray[i] = temp;
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		System.out.println("Line 46: Variable declaration. map is an object of class TreeMap.");

		System.out.println("Line 49: For loop. Variable i declared and initialized to 0. Condition: i < totalArray.length. Increment expression: i++");

		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Line 51: Function call. Function: map.put, Return type: void. Parameters: Key: " + totalArray[i] + ", Value: " + totalArray[i]);
		}

		System.out.println("Line 54: For loop. Variable i declared and initialized to 0. Condition: i < totalArray.length. Increment expression: i++");
		for(int i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
			System.out.println("Line 56: Array element assignment. Array: totalArray. Index: " + i + ", New Value: " + map.get(i + 1));
		}
		System.out.println("Program Details: ");
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Current Date: "+sdf1.format(d));
		System.out.println("Current Time: "+sdf2.format(d));
		System.out.println("Real time of the entire execution: "); //Add relevant information here
		System.out.println("CPU time (in milliseconds) for which the processor was running the application: "); //Add relevant information here
		System.out.println("User time (in milliseconds) spent in user-mode: "); //Add relevant information here 
		System.out.println("System time (in milliseconds) spent in kernel-mode: "); //Add relevant information here
	}
}