package Sorting;

import java.util.concurrent.CountDownLatch;

public class sleepSort {

	public static void sleepSortAndPrint(int[] nums) {
		CountDownLatch countLatch = new CountDownLatch(nums.length);

		for (Integer num : nums) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					countLatch.countDown();
					try {
						countLatch.await();
						Thread.sleep(num * 100);
						System.out.print(num + " ");
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}).start();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 50, 60, 14, 12, 3, 4, 65, 25 };
		sleepSortAndPrint(arr);
	}

}
