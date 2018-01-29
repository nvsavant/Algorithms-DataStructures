package subStringSearch;

public class bruteForce {

	public static int search(String text, String pattern) {
		int lengthOfText = text.length();
		int lenghtOfPattern = pattern.length();

		for (int i = 0; i < lengthOfText - lenghtOfPattern + 1; i++) {
			for (int j = 0; j < lenghtOfPattern; ++j) {
				if (pattern.charAt(j) != text.charAt(i + j)) {
					break;
				}
				if (j == pattern.length() - 1) {
					return i;
				}
			}
		}

		return lengthOfText;
	}

	public static void main(String[] args) {
//		String text = "test is a test nikheel";
//		String pattern = "test";
		
		String text = "DDDDDDDDDDDDDDDS";
		String pattern = "DDDS";

		int returnValue = search(text, pattern);

		if (returnValue == text.length()) {
			System.out.println("String not found");
		} else {
			System.out.println("String found at index " + Integer.toString(returnValue));
		}

	}

}
