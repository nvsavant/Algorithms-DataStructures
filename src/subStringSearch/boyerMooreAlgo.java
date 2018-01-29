package subStringSearch;

import java.util.Hashtable;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class boyerMooreAlgo {

	private static Hashtable<Character, Integer> badMatchTable;

	private static void preComputeShifts(String pattern) {
		badMatchTable = new Hashtable<>(pattern.length());
		for (int i = 0; i < pattern.length(); i++) {
			badMatchTable.put(pattern.charAt(i), Math.max(1, pattern.length() - i - 1));
		}
	}

	private static int boyerMooreSearch(String text, String pattern) {
		preComputeShifts(pattern);
		int lengthOfText = text.length();
		int lengthOfPattern = pattern.length();
		int numOfSkips;

		for (int i = 0; i < lengthOfText - lengthOfPattern + 1; i += numOfSkips) {
			numOfSkips = 0;
			for (int j = lengthOfPattern - 1; j >= 0; j--) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					if (badMatchTable.get(text.charAt(i + j)) == null) {
						numOfSkips = lengthOfPattern;
						break;
					} else {
						numOfSkips = badMatchTable.get(text.charAt(i + j));
						break;
					}
				}
				if (numOfSkips == 0) {
					return i;
				}
			}
		}
		return text.length();
	}

	public static void main(String[] args) {
		String text = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDS";
		String pattern = "DDDDDDDDDDDDDDDDDDDS";

		int returnValue = boyerMooreSearch(text, pattern);

		if (returnValue == text.length()) {
			System.out.println("String not found");
		} else {
			System.out.println("String found at index " + Integer.toString(returnValue));
		}

	}

}
