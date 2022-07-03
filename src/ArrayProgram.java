
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

		System.out.println("Elements of given array: ");

		// Loop through the array by incrementing value of i

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
	}

}
