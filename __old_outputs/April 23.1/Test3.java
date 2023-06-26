import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
	    //Run #1
	    System.out.println("File Name: Test3.java\nDate/Time: 10/14/2021 2:30pm");
	    long startTime = System.currentTimeMillis();
	    long startUserTime = System.nanoTime();
	    
	    //Creating the Total Array
		for(int i=0; i<total; i++) {
			int num = i + 1;
			totalArray[i] = num;
            System.out.println("Scope: Global Scope, Line #: " + (i+15) + ", Event: Variable Assignment, Variable Name: num, Variable Scope: for-loop, Variable Data Type: int, Initial Value: " + num + ", Modified Value: " + num);
            System.out.println("Scope: Global Scope, Line #: " + (i+15) + ", Event: Variable Assignment, Variable Name: totalArray, Variable Scope: global, Variable Data Type: int[], Initial Value: " + totalArray[i] + ", Modified Value: " + totalArray[i]);
		}
		Random rnd = new Random(seed);
        //Shuffling the Total Array randomly
		for(int i=0; i<totalArray.length; i++) {
            int rndIndex = rnd.nextInt(totalArray.length); //Which index to swap with
            int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
            System.out.println("Scope: Global Scope, Line #: " + (i+20) + ", Event: Variable Assignment, Variable Name: rndIndex, Variable Scope: for-loop, Variable Data Type: int, Initial Value: " + rndIndex + ", Modified Value: " + rndIndex);
            System.out.println("Scope: Global Scope, Line #: " + (i+20) + ", Event: Variable Declaration, Variable Name: temp, Variable Scope: for-loop, Variable Data Type: int, Initial Value: " + temp);
            System.out.println("Scope: Global Scope, Line #: " + (i+20) + ", Event: Variable Assignment, Variable Name: totalArray, Variable Scope: global, Variable Data Type: int[], Initial Value: " + totalArray[rndIndex] + ", Modified Value: " + totalArray[rndIndex]);
            System.out.println("Scope: Global Scope, Line #: " + (i+20) + ", Event: Variable Assignment, Variable Name: totalArray, Variable Scope: global, Variable Data Type: int[], Initial Value: " + totalArray[i] + ", Modified Value: " + totalArray[i]);
		}
		SortedMap<Integer, Integer> map  = new TreeMap<>();
        //Storing the shuffled Array in a TreeMap
		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
            System.out.println("Scope: Global Scope, Line #: " + (i+27) + ", Event: Function Call, Function Name: put, Function Return Type: void, Function Parameters: totalArray[i], totalArray[i], Resulting Effect: adds key-value pairs to map, Cost: <method call time> ms");
		}
        //Retrieving the shuffled Array back from the TreeMap and overwriting the Total Array 
		for(int i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
            System.out.println("Scope: Global Scope, Line #: " + (i+32) + ", Event: Variable Assignment, Variable Name: totalArray, Variable Scope: global, Variable Data Type: int[], Modified Value: " + totalArray[i]);
            System.out.println("Scope: Global Scope, Line #: " + (i+32) + ", Event: Function Call, Function Name: get, Function Return Type: Integer, Function Parameters: i+1, Resulting Effect: retrieves value from map, Cost: <method call time> ms");
        }
        
        long endTime = System.currentTimeMillis();
        long endUserTime = System.nanoTime();
        //Printing the system time and user time of the entire run
        System.out.println("System time taken: " + (endTime - startTime) + "ms");
        System.out.println("User time taken: " + (endUserTime - startUserTime) + "ns");
	}
}