public class PigLatin {

	public static void main(String[] args) {
		//System.out.println(translate("chk"));
		//multiple words
		//special chars
		PigLatinTests.hi();
		//
	}
	
	public static String translate(String str) {
		str = str.toLowerCase();
		if (str.length() == 0) {
			return "";
		}
		
		if (checkVowel(str.charAt(0))) {
			return translateVowelWord(str);
		} else {
			return translateConsonantWord(str);
		}
	}
	
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
	
	public static String translateVowelWord(String str) {
		return str + "way";
	}
	
	public static boolean checkVowel(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			return true;
		}
		return false;
	}
	
	

}
