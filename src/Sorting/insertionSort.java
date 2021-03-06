package Sorting;

public class insertionSort {
	
	private static void swap(int[] nums, int j, int i) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private static void showArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}


	public static void main(String[] args) {
		int[] arr = { -333, 4, -88, 1, 3 };

		System.out.println("Before sorting");
		showArray(arr);

		InsertionSort(arr);

		System.out.println("After sorting");
		showArray(arr);

	}

	private static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[j+1]) {
					break;
				}
				swap(arr,j,j+1);
			}
		}
	}

}
