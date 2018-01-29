package strings;

import java.util.List;

public class App {
	public static void main(String[] args) {
		String str = "House";

		stringOperation operations = new stringOperation();
		// System.out.println(operations.revertString(str));

//		List<String> suffixList = operations.getSuffixes(str);
//		System.out.println("Suffices:");
//		for (String item : suffixList) {
//			System.out.println(item);
//		}
//		
//		List<String> prefixList = operations.getPrefixes(str);
//		System.out.println("Prefices:");
//		for (String item : prefixList) {
//			System.out.println(item);
//		}

		
		
//		System.out.println(operations.longestCommonPrefix("Hello", "Hellook"));
		
		System.out.println(operations.longestRepeatedString("HellodahkdaHello"));

	}
}
