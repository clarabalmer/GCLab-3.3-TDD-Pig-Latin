//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PigLatinTests {
	
	public static void hi() {
		System.out.println();
	}
	
	@Test
	void test() {
		String expected = "";
		String actual = PigLatin.translate("");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate1() {
		String expected = "";
		String actual = PigLatin.translate("");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate2() {
		String expected = "away";
		String actual = PigLatin.translate("A");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate3() {
		String expected = "aberforthway";
		String actual = PigLatin.translate("Aberforth");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate4() {
		String expected = "estimateway";
		String actual = PigLatin.translate("estimate");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate5() {
		String expected = "iglooway";
		String actual = PigLatin.translate("Igloo");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate6() {
		String expected = "operaway";
		String actual = PigLatin.translate("opera");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate7() {
		String expected = "umbrellaway";
		String actual = PigLatin.translate("umbrella");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate8() {
		String expected = "argebay";
		String actual = PigLatin.translate("barge");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate9() {
		String expected = "olloquialcay";
		String actual = PigLatin.translate("colloquial");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate10() {
		String expected = "ebrazay";
		String actual = PigLatin.translate("zebra");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate11() {
		String expected = "arkshay";
		String actual = PigLatin.translate("shark");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate12() {
		String expected = "uyenngay";
		String actual = PigLatin.translate("Nguyen");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate13() {
		String expected = "easontray";
		String actual = PigLatin.translate("treason");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate14() {
		String expected = "appyscray";
		String actual = PigLatin.translate("scrappy");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate15() {
		String expected = "ingstray";
		String actual = PigLatin.translate("string");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate16() {
		String expected = "oxphlay";
		String actual = PigLatin.translate("phlox");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate17() {
		String expected = "emeelschlay";
		String actual = PigLatin.translate("schlemeel");
		Assert.assertEquals(expected, actual);
	}
	
	
	
	@Test
	void testTranslateConsonant1() {
		String expected = "arkpay";
		String actual = PigLatin.translateConsonantWord("park");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateConsonant2() {
		String expected = "unchbay";
		String actual = PigLatin.translateConsonantWord("bunch");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateConsonant3() {
		String expected = "oolschay";
		String actual = PigLatin.translateConsonantWord("school");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateConsonant4() {
		String expected = "gym";
		String actual = PigLatin.translateConsonantWord("gym");
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	void testTranslateVowel1() {
		String expected = "appleway";
		String actual = PigLatin.translateVowelWord("apple");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateVowel2() {
		String expected = "errandway";
		String actual = PigLatin.translateVowelWord("errand");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateVowel3() {
		String expected = "icicleway";
		String actual = PigLatin.translateVowelWord("icicle");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateVowel4() {
		String expected = "opticway";
		String actual = PigLatin.translateVowelWord("optic");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateVowel5() {
		String expected = "urbanway";
		String actual = PigLatin.translateVowelWord("urban");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void testVowel1() {
		boolean expected = true;
		boolean actual = PigLatin.checkVowel('a');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel2() {
		boolean expected = true;
		boolean actual = PigLatin.checkVowel('e');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel3() {
		boolean expected = true;
		boolean actual = PigLatin.checkVowel('i');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel4() {
		boolean expected = true;
		boolean actual = PigLatin.checkVowel('o');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel5() {
		boolean expected = true;
		boolean actual = PigLatin.checkVowel('u');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel6() {
		boolean expected = false;
		boolean actual = PigLatin.checkVowel('x');
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testVowel7() {
		boolean expected = false;
		boolean actual = PigLatin.checkVowel('%');
		Assert.assertEquals(expected, actual);
	}
}


