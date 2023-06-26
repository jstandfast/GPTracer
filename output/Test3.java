import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
	
	public static final int total = 100;
	public static final long seed = 1234567896189L;
	public static int[] totalArray = new int[total];

	public static void main(String[] args) {
		System.out.println("Source file: Test3.java");
		System.out.println("Event: Entering main function");
		System.out.println("Line #: 17");
		for(int i=0; i<total; i++) {
			int num = i + 1;
			totalArray[i] = num;
			System.out.println("Event: Setting value " + num + " to totalArray index " + i);
			System.out.println("Line #: 23");
		}

		Random rnd = new Random(seed);
		System.out.println("Event: Creating new Random object with seed value " + seed);
		System.out.println("Line #: 27");
		for(int i=0; i<totalArray.length; i++) {
			int rndIndex = rnd.nextInt(totalArray.length);
			System.out.println("Event: Generating random index number " + rndIndex + " with Random object");
			System.out.println("Line #: 31");
			int temp = totalArray[rndIndex];
			totalArray[rndIndex] = totalArray[i];
			totalArray[i] = temp;
			System.out.println("Event: Swapping value " + temp + " at index " + rndIndex + " with value "
                 + totalArray[i] + " at index " + i + " in totalArray");
			System.out.println("Line #: 36");
		}

		SortedMap<Integer, Integer> map  = new TreeMap<>();
		System.out.println("Event: Creating new TreeMap object");
		System.out.println("Line #: 42");
		for(int i=0; i<totalArray.length; i++) {
			map.put(totalArray[i],totalArray[i]);
			System.out.println("Event: Inserting key " + totalArray[i] + " and value " + totalArray[i] +
                              " into TreeMap object");
			System.out.println("Line #: 46");
		}

		for(int i=0; i<totalArray.length; i++) {
			totalArray[i] = map.get(i+1);
			System.out.println("Event: Setting value of totalArray index " + i + " to value at key " + (i+1) +
                               " in TreeMap object");
			System.out.println("Line #: 52");
		}
		System.out.println("Event: Exiting main function");
		System.out.println("Line #: 54");
		System.out.println("Run #1 successful");
	}
}