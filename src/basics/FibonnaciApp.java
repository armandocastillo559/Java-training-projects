package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		//System.out.println(fib(5));
		
		// Incremental Sum is defined by the Sum of all numbers including and previous to a number
		// incSum(0) = 0 + 0 = 0
		// incSum(1) = 1 + 1 = 2
		// incSum(2) = 1 + 2 = 3
		// incSum(3) = 1 + 2 + 3 = 6
		// incSum(4) = 1 + 2 + 3 + 4 = 10
		//System.out.println(incSum(0));
		
		// Factorial is defined by the product of all positive numbers including and previous to a number
		// Fact(0) = 0 * 0 = 0
		// Fact(1) = 1 * 1 = 1
		// Fact(2) = 2 * 1 = 2
		// Fact(3) = 3 * 2 * 1 = 6
		// Fact(4) = 4 * 3 * 2 * 1 = 12
		//System.out.println(fact(5));
				
		// Amin() is defined as the minimum value in an array
		// Amax() is defined as the maximum value in an array
		// Aavg() is defnied as the average of all values in an array
		
		double[] values = {10.4, 0.55, 9442.12, 9442.13};
		System.out.println("Minimum number is = " + Amin(values));
		System.out.println("Maximum number is = " + Amax(values));
		System.out.println("Average number is = " + Aavg(values));
	}
	
	// Array Functions
	public static double Amin(double[] n) {
		double answer = n[0];
		for (int i = 0;i < n.length;i++) {
			if (n[i] < answer) {
				answer = n[i];
			}
			//System.out.println(n[i]);
		}
		return answer;
	}
	
	public static double Amax(double[] n) {
		double answer = n[0];
		for (int i = 0;i < n.length;i++) {
			if (n[i] > answer) {
				answer = n[i];
			}
			//System.out.println(n[i]);
		}
		return answer;
	}
	
	public static double Aavg(double[] n) {
		double sum = 0;
		for (int i = 0;i < n.length;i++) {
			sum = sum + n[i];
			//System.out.println(n[i]);
		}
		return sum / n.length;
	}
	
	
	
	
	// Fibonnaci Function
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}
		return ((fib(n-1)) + (fib(n-2)));
	}
	
	// IncrementalSum Function: Sum of numbers 1 to n
	public static int incSum(int n) {
		int answer = 0;
		for (int i = 0; i <= n ; i++) {
			//System.out.print("i is " + i);
			//System.out.println(" and n is " + n);
			answer = answer +    i;
		}
		return answer;
	}
		
	// Factorial Function: Product of positive numbers 1 to n
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return fact(n-1) * n;
	}

}




