package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class stringOperation {

	public String revertString(String str) {
		int lengthOfString = str.length();

		StringBuilder reverseString = new StringBuilder();

		for (int i = lengthOfString - 1; i >= 0; i--) {
			reverseString.append(str.charAt(i));
		}
		return reverseString.toString();
	}

	public List<String> getSuffixes(String text) {
		int lengthOfString = text.length();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < lengthOfString; i++) {
			list.add(text.substring(i));
		}

		return list;
	}

	public List<String> getPrefixes(String text) {
		int lengthOfString = text.length();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < lengthOfString; i++) {
			list.add(text.substring(0, i + 1));
		}

		return list;
	}

	public String longestCommonPrefix(String text1, String text2) {
		int commonLength = Math.min(text1.length(), text2.length());
		for (int index = 0; index < commonLength; index++) {
			if (text1.charAt(index) != text2.charAt(index))
				return text1.substring(0, index);
		}
		return text1.substring(0, commonLength);
	}

	public String longestRepeatedString(String text) {
		int lengthOfString = text.length();

		List<String> suffixList = getSuffixes(text);
		Collections.sort(suffixList);

		String result = "";

		for (int i = 0; i < lengthOfString - 1; i++) {
			String tmpString = longestCommonPrefix(suffixList.get(i), suffixList.get(i + 1));
			if (tmpString.length() > result.length())
				result = tmpString;
		}
		return result;
	}

}
