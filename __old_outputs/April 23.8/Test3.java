import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		System.out.println("Source Code file name: Test3.java\n");
		System.out.println("Entering main function at line 15...\n");
		for(int i=0; i<total; i++) {
			System.out.println("Current Scope: main\nLine number: 19\tevent: Variable declaration - total, of type 'int', with value: " + total); 
			System.out.println("Current Scope: main\nLine number: 20\tevent: Variable declaration - seed, of type 'long', with value: " + seed); 
			System.out.println("Current Scope: main\nLine number: 21\tevent: Variable declaration - totalArray, an array of type 'int', of size " + totalArray.length); 
			int num = i + 1;
			totalArray[i] = num;
			System.out.println("Current Scope: main\nLine number: 24\tevent: Assignment - totalArray[" + i + "] = " + num);
		}

		Random rnd = new Random(seed);
		System.out.println("Current Scope: main\nLine number: 28\tevent: Variable declaration - rnd, of type 'Random'"); 
		for(int i=0; i<totalArray.length; i++) {
			int rndIndex = rnd.nextInt(totalArray.length);
			System.out.println("Current Scope: main\nLine number: 31\tevent: Function call - rnd.nextInt(" + totalArray.length + ") with return type 'int', storing result in rndIndex"); 
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			System.out.println("Current Scope: main\nLine number: 34\tevent: Assignment - totalArray[" + rndIndex + "] = " + totalArray[i]); 
			totalArray[i] = temp;
			System.out.println("Current Scope: main\nLine number: 35\tevent: Assignment - totalArray[" + i + "] = " + temp); 
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		System.out.println("Current Scope: main\nLine number: 39\tevent: Variable declaration - map, of type 'SortedMap<Integer, Integer>'"); 
		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Current Scope: main\nLine number: 42\tevent: Function call - map.put(" + totalArray[i] + ", " + totalArray[i] + ") of return type 'void', storing result in map"); 
		}

		for(int i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
			System.out.println("Current Scope: main\nLine number: 47\tevent: Assignment - totalArray[" + i + "] = " + "map.get(" + (i+1) + ")"); 
		}
		System.out.println("Exiting main function...");
	}
}