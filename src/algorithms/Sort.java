  package algorithms;

public class Sort {

	public static void bubbleSort(int [] dataSet){
		// outer loop loops until a Swap does not occur
		boolean swapped;
		System.out.print("\nOriginal array:\n"); //debug
		printArr(dataSet); // debug
		do {
			// inner loop iterates through array values
			swapped = false;
			for (int i = 0; i < dataSet.length-1; i++) {
				// compare value and the next value, swap the greater one to right if necessary
				if (dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					printArr(dataSet); //debug
					// set flag, swap occurred
					swapped = true;
				}
			}
		} while (swapped);
	}
	
	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
