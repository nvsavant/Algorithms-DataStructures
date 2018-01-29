package arrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			nums.add(i);
		}

		for (Integer a : nums) {
			System.out.println(a);
		}

	}

}
