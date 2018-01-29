package Sorting;

public class selectionSort {

	private static void showArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] arr = { -333, -40, -88, 1, 3 };

		System.out.println("Before sorting");
		showArray(arr);

		SelectionSort(arr);

		System.out.println("After sorting");
		showArray(arr);
	}

	private static void swap(int[] nums, int j, int i) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(arr, i, min);
			}
//			showArray(arr);
		}
	}
}
