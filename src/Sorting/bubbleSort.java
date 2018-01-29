package Sorting;

public class bubbleSort {

	private static void showArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] arr = { -3, 4, 88, 1, 3 };

		System.out.println("Before sorting");
		showArray(arr);

		BubbleSort(arr);

		System.out.println("After sorting");
		showArray(arr);
	}

	private static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
			}
			// showArray(arr);
		}

	}

	private static void swap(int[] nums, int j, int i) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
