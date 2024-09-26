public class Problem_02 {

	public static void main(String[] args) {
		
	     int nValues = 50;

	        // Outer loop: Iterate through numbers from 2 to nValues
	        outerLoop:
	        for (int i = 2; i <= nValues; i++) {
	            // Only check divisors up to the square root of i
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                // If i is divisible by j, it is not prime; skip to the next number using labeled continue
	                if (i % j == 0) {
	                    continue outerLoop;  // Skip the rest of this loop iteration and move to the next i
	                }
	            }
	            // If no divisors were found, the number is prime
	            System.out.println(i);
	        }

	}

}
