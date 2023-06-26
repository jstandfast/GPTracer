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
        System.out.println("Event: Starting Test"); //Adding print statements to show the starting time of the program
        long startTime = System.currentTimeMillis();
        long startUserTime = System.nanoTime();
		
		for(int i=0; i<total; i++) {   
            System.out.println("Line 20--Event: Variable Declaration/Assignment, Variable Name: num, Variable data Type: int, Variable Scope: inner for loop");		
			int num = i + 1; //added print statements to show the value of each element in the array
            System.out.println("Line 21--Event: Variable Assignment, Variable Name: totalArray, Value: " + num + ", Variable Scope: global");	
			totalArray[i] = num;
		}

		Random rnd = new Random(seed); // Added print statement to show the seed value used for generating a series of seemingly random numbers
        System.out.println("Line 28--Event: Variable Declaration/Assignment, Variable Name: rnd, Variable Scope: main");
        System.out.println("Line 31--Event: Function Call, Function Name: nextInt() , Function Return Type: int, Function Parameters: " + totalArray.length + ", Function Scope: inner for loop");	
		for(int i=0; i<totalArray.length; i++) {
            System.out.println("Line 33-36--Event: Variable Assignment, Variable Name: temp, Value: " + totalArray[i] + ", Variable Scope: inner for loop");
			int rndIndex = rnd.nextInt(totalArray.length); // printing which iteration of the loop is being executed. 
            System.out.println("Line 34-35--Event: Variable Assignment, Variable Name: rndIndex, Value: " + rndIndex + ", Variable Scope: inner for loop");	
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>(); //printing event of the SortedMap object creation 
        System.out.println("Line 41--Event: Variable Declaration/Assignment, Variable Name: map, Variable Scope: main");
        System.out.println("Line 44-46--Event: Function Call, Function Name: put() , Function Return Type: void, Function Parameters: " + totalArray[i] + ", " + totalArray[i] + ", Function Scope: inner for loop");
		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
		}

		for(int i=0; i<totalArray.length; i++) {
            System.out.println("Line 50-51--Event: Variable Assignment, Variable Name: totalArray, Value: " + map.get(i+1) + ", Variable Scope: global");
			totalArray[i] = map.get(i+1);
		}
        System.out.println("Scope: main");
        System.out.println("Event: Ending Test"); //Adding print statements to show the end time of the program and the entire runtime details
        long endTime = System.currentTimeMillis();
        long endUserTime = System.nanoTime();
        long totalTime = endTime - startTime;
        long totalUserTime = endUserTime - startUserTime;
        System.out.println("Total Time Taken: " + (totalTime) + " ms");
        System.out.println("Total User Time Taken: "+totalUserTime + " ns");
        System.out.println("System Time Taken: "+(totalTime-totalUserTime) + " ms");
	}
}