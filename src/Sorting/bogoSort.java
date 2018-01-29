package Sorting;

public class bogoSort {
	/***
	 * Fisher Yates
	 * 
	 * @param nums:
	 *            an array of integers
	 */
	private static void shuffle(int[] nums) {
		for (int i = nums.length - 1; i >= 0; --i) {
			int j = (int) (Math.random() * i);
			swap(nums, i, j);
		}

	}

	private static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	private static void showArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] arr = { 4, 12, -3, 4 };

		int loopCounter = 0;

		while (!isSorted(arr)) {
			++loopCounter;
			shuffle(arr);
		}

		showArray(arr);
		System.out.println("Number of steps: " + loopCounter);

		// if (isSorted(arr)) {
		// System.out.println("Array sorted");
		// } else {
		// System.out.println("Array not sorted");
		// }

	}

}
