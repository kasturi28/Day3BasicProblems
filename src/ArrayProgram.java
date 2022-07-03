
public class ArrayProgram {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * initializing the array
		 */
		int[] arr = new int[] { 1, 2, 3, 4, 5, 1, 5, 2, 1, 3, 2, 2 };
		int temp = 0;

		System.out.println("Elements of given array: ");

		// Loop through the array by incrementing value of i

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Array fr will store frequencies of element

		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		// Displays the frequency of each element present in array
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");

		// Initialize max with first element of array.
		int max = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);
		System.out.println();

		// Initialize min with first element of array.
		int min = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with min
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println("Smallest element present in given array: " + min);
		System.out.println();

		System.out.println("Elements of given array present on even position: ");
		// Loop through the array by incrementing value of i by 2
		// Here, i will start from 1 as first even positioned element is present at
		// position 1.
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Elements of given array present on odd position: ");
		// Loop through the array by incrementing value of i by 2
		// Here, i will start from 1 as first even positioned element is present at
		// position 1.
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Sort the array in ascending order
		System.out.println("Array in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
