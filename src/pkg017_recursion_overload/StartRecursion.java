package pkg017_recursion_overload;

/**
 * 
 * @author compsci
 */

public class StartRecursion {
	
/**
 * Calls classes to be ran and sets their preliminary values
 * @param args 
 */	
    public static void main(String [] args) {
				int n = 10;
				recurse(n);
				n = 0;
				recurseUp(n);
				int startValue=0;
				int stopValue=50;
				recurseEvens(startValue, stopValue, n);
				
				System.out.println();
				
				startValue=10;
				stopValue=30;
				recurseEvens(startValue, stopValue);
	}

/**
 * Starts at predetermined value of n and reduces by 1 and prints value until it is equal to or under 0
 * 
 * @param n 
 */	
    private static void recurse(int n) {
		System.out.println("We have done recurse " + n + " times");
				n--;
				if (n>= 0) {
						recurse(n);
				}
				
				
				System.out.println();			
	}

/**
 * Starts at predetermined value of n and increased by 1 and prints value until it is equal to or over 10
 * @param n 
 */
	private static void recurseUp(int n) {
		System.out.println("We have done recurseUp " + n + " times");
				n++;
				if (n<= 10) {
						recurseUp(n);
				}	
				
	}
	/**
	 * Display even numbers from startValue inclusive
	 * to stopValue exclusive
	 * 
	 * @param startValue
	 * @param stopValue
	 */
	private static void recurseEvens(int startValue, int stopValue) {
		
		if (startValue % 2 != 0) {
			recurseEvens(startValue + 1, stopValue);
		} else if (startValue < stopValue) {
			System.out.println(startValue);
			recurseEvens(startValue + 2, stopValue);
		} else {
			System.out.println("finished");
		}
		
		
		
		
	}
	/**
	 * Display even numbers from startValue inclusive
	 * to stopvalue exclusive
	 * @param startValue
	 * @param stopValue
	 * @param n
	 */
	private static void recurseEvens(int startValue, int stopValue, int n) {
		
		n = startValue + n;
		
		System.out.println("recurseEvens value is " + n);
		n += 2;
		
		if(n < stopValue) {
			recurseEvens(startValue, stopValue, n);
		}
		
		
		
		
	}
	
	
	
	
} // end to class
