import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;
import java.time.LocalDateTime;
import java.lang.*;


public class Test3 {
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
	    LocalDateTime startDateTime = LocalDateTime.now();  //start time of program execution
		System.out.println("Run #1\nSource file name: Test3.java\nDate: " + startDateTime.toLocalDate() + " Time: " + startDateTime.toLocalTime() + "\n");
		
        System.out.println("Entering for loop for variable declaration ...\n");
		for(int i=0; i<total; i++) { //variable declaration
			int num = i + 1;
			totalArray[i] = num;
			
			System.out.println("Test3.java - main - line 26 : Variable declaration: [int num] [Value: "+num+"] [Scope: For loop] [Data type: int] [Modifiers: None]");
		}
		
        System.out.println("\nEntering random number generator ...\n");
		Random rnd = new Random(seed);
		
        System.out.println("Entering for loop for number shuffling ...\n");
		for(int i=0; i<totalArray.length; i++) {  //for loop
			int rndIndex = rnd.nextInt(totalArray.length);
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
			System.out.println("Test3.java - main - line 39 : Expression evaluation: ["+(i+1)+" of "+total+ "] [Type: Math.random()]");
			System.out.println("Test3.java - main - line 41 : Variable assignment: [temp] [Value: "+totalArray[rndIndex]+"] [Scope: For loop] [Data type: int] [Modifiers: None]");
			System.out.println("Test3.java - main - line 42 : Variable assignment: [totalArray["+rndIndex+"]] [Value: "+temp+"] [Scope: For loop] [Data type: int] [Modifiers: None]");
			System.out.println("Test3.java - main - line 43 : Variable assignment: [totalArray["+i+"]] [Value: "+totalArray[i]+"] [Scope: For loop] [Data type: int] [Modifiers: None]");
		}
		SortedMap<Integer, Integer> map  = new TreeMap<>();
		
        System.out.println("Entering for loop for mapping the shuffled numbers ...\n");
		for(int i=0; i<totalArray.length; i++) {  //for loop
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Test3.java - main - line 50 : Function call: [map.put()] [Parameters: totalArray[i],totalArray[i]] [Return type: void]");
		}

		for(int i=0; i<totalArray.length; i++) {  //for loop
			totalArray[i] = map.get(i+1);
			
			System.out.println("Test3.java - main - line 55 : Variable assignment: [totalArray["+i+"]] [Value: "+totalArray[i]+"] [Scope: For loop] [Data type: int] [Modifiers: None]");
		}
        LocalDateTime endDateTime = LocalDateTime.now(); //end time of program execution
        
        long elapsedTimeInNanoSec = (long) (java.time.Duration.between(startDateTime, endDateTime).toNanos()); //elapsed time in nanoseconds
        double elapsedTimeInMilliSec = (double) elapsedTimeInNanoSec / 1000000; //elapsed time in milliseconds
        double userTimeInMilliSec = (double) ManagementFactory.getThreadMXBean().getCurrentThreadUserTime() / 1000000; //user time in milliseconds
        double systemTimeInMilliSec = (double) ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime() / 1000000 - userTimeInMilliSec; //system time in milliseconds
        System.out.println("\nProgram execution completed in " + elapsedTimeInMilliSec + " milliseconds.");
        System.out.println("User time: " + userTimeInMilliSec + " milliseconds.");
        System.out.println("System time: " + systemTimeInMilliSec + " milliseconds.");
	}
}