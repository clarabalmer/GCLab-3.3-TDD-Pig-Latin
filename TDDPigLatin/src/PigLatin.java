public class PigLatin {
	
	//translates sentences into Pig Latin
	public static String translate(String str) {
		if (str.length() == 0) {
			return "";
		}
		//split into 1-word chunks
		String[] wordsToTranslate = str.split(" ");
		String result = "";
		//translate each and return with spaces added back in
		for (int i = 0; i < wordsToTranslate.length; i++) {
			if (i > 0) {
				result += " ";
			}
			result += translateWord(wordsToTranslate[i]);
		}
		return result;
	}
	//translate one word into Pig Latin
	public static String translateWord(String str) {
		//don't change special char words
		if (containsSpecial(str)) {
			return str;
		}
		//remove and store any end punctuation
		String endPunct = "";
		while (endsWithPunctuation(str)) {
			endPunct = str.charAt(str.length() - 1) + endPunct;
			str = str.substring(0, str.length() - 1);
		}
		//remove and store any starting punctuation
		String startPunct = "";
		while (startsWithPunctuation(str)) {
			startPunct = startPunct + str.charAt(0);
			str = str.substring(1);
		}
		//if middle punctuation exists, translate by word, adding middle punctuation back in
		if (middlePunctuationIndex(str) > -1) {
			int i = middlePunctuationIndex(str);
			return translateWord(str.substring(0,i)) + str.charAt(i) + translateWord(str.substring(i + 1));
		}
		//determine which translation rules to use based on starting vowel/consonant, and start/end punctuation back in
		if (checkVowel(str.charAt(0))) {
			return startPunct + translateVowelWord(str) + endPunct;
		} else {
			return startPunct + translateConsonantWord(str) + endPunct;
		}
	}
	//check for special characters
	public static boolean containsSpecial(String str) {
		char[] special = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '@', '#', '$', '%', '^'};
		for (int i = 0; i < str.length(); i++) {
			for (char character : special) {
				if (str.charAt(i) == character) {
					return true;
				}
			}
		}
		return false;
	}
	//check for end punctuation
	public static boolean endsWithPunctuation(String str) {
		char[] endPunctuation = {'!', ',', '.', '-', '?', '"', ':', ';', '\'', ')', '*'};
		for (char character : endPunctuation) {
			if (str.charAt(str.length() - 1) == character) {
				return true;
			}
		}
		return false;
	}
	//check for starting punctuation
	public static boolean startsWithPunctuation(String str) {
		char[] startPunctuation = {'"', '-', '\'', '(', '.', '*', '/'};
		for (char character : startPunctuation) {
			if (str.charAt(0) == character) {
				return true;
			}
		}
		return false;
	}
	//check for middle punctuation, return first index
	public static int middlePunctuationIndex(String str) {
		char[] middlePunctuation = {'/', '-', '&'};
		for (int i = 0; i < str.length(); i++) {
			for (char character : middlePunctuation) {
				if (str.charAt(i) == character) {
					return i;
				}
			}
		}
		return -1;
	}
	//determine if char is a vowel (either case)
	public static boolean checkVowel(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'
			 || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
			return true;
		}
		return false;
	}
	//translation of word starting with a vowel
	public static String translateVowelWord(String str) {
		return str + "way";
	}
	//translation of word starting with a consonant
	public static String translateConsonantWord(String str) {
		int index = -1;
		for (int i = 1; i < str.length(); i++) {
			if (checkVowel(str.charAt(i))) {
				index = i;
				break;
			}
		}
		if (index > 0) {
			return str.substring(index) + str.substring(0,index) + "ay";
		} else {
			return str;
		}
	}
}
