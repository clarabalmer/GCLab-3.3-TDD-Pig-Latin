//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PigLatinTests {
	

	
	
	@Test
	void testTranslateExtended1() {
		String expected = "an'tcay";
		String actual = PigLatin.translate("can't");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended2() {
		String expected = "1984";
		String actual = PigLatin.translate("1984");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended3() {
		String expected = "hello@grandcircus.co";
		String actual = PigLatin.translate("hello@grandcircus.co");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended4() {
		String expected = "elloHay erethay"; //changed for extended challenge
		String actual = PigLatin.translate("Hello there");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended5() {
		String expected = "Itway ookslay ikelay ainray"; //changed for extended challenge
		String actual = PigLatin.translate("It looks like rain");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended6() {
		String expected = "my emailway isway hello@grandcircus.co";
		String actual = PigLatin.translate("my email is hello@grandcircus.co");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended7() {
		String expected = "unctuationpay, aymay ebay away oblempray";
		String actual = PigLatin.translate("punctuation, may be a problem");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended8() {
		String expected = "Iway inkthay, Iway avehay- ellway, ixedfay! ethay? unctuationpay oblempray."; //changed for extended challenge
		String actual = PigLatin.translate("I think, I have- well, fixed! the? punctuation problem.");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended9() {
		String expected = "\"elloHay erethay,\" aidsay ethay anmay."; //changed for extended challenge
		String actual = PigLatin.translate("\"Hello there,\" said the man.");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended10() {
		String expected = "illWay itway orkway... ikelay isthay?"; //changed for extended challenge
		String actual = PigLatin.translate("Will it work... like this?");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended11() {
		String expected = "isthay/atthay";
		String actual = PigLatin.translate("this/that");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended12() {
		String expected = "asterMay omleyBray-atcherThay";
		String actual = PigLatin.translate("Master Bromley-Thatcher");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended13() {
		String expected = "applesway/ananasbay/errieschay/umquatskay/avocadosway/ustn'tmay";
		String actual = PigLatin.translate("apples/bananas/cherries/kumquats/avocados/mustn't");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended14() {
		String expected = "uperSay-alicay-agifray-isticlay-expiway-aliway-ociousday";
		String actual = PigLatin.translate("Super-cali-fragi-listic-expi-ali-docious");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended15() {
		String expected = "(et'sLay eesay ifway isthay orksway.)";
		String actual = PigLatin.translate("(Let's see if this works.)");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended16() {
		String expected = "isthay&atthay";
		String actual = PigLatin.translate("this&that");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended17() {
		String expected = "/isthay";
		String actual = PigLatin.translate("/this");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslateExtended18() {
		String expected = "*ellohay";
		String actual = PigLatin.translate("*hello");
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	void testContainsEndPunct1() {
		boolean expected = true;
		boolean actual = PigLatin.endsWithPunctuation("hello,");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testContainsEndPunct2() {
		boolean expected = true;
		boolean actual = PigLatin.endsWithPunctuation("Oh no.");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testContainsEndPunct3() {
		boolean expected = false;
		boolean actual = PigLatin.endsWithPunctuation("munchkin");
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	void testContainsSpecial1() {
		boolean expected = false;
		boolean actual = PigLatin.containsSpecial("hello");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testContainsSpecial2() {
		boolean expected = true;
		boolean actual = PigLatin.containsSpecial("fjdkslfj@fdjskl");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testContainsSpecial3() {
		boolean expected = false;
		boolean actual = PigLatin.containsSpecial("");
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
		String expected = "Away"; //changed for extended challenge
		String actual = PigLatin.translate("A");
		Assert.assertEquals(expected, actual);
	}
	@Test
	void testTranslate3() {
		String expected = "Aberforthway"; //changed for extended challenge
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
		String actual = PigLatin.translate("igloo");
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
		String expected = "uyenNgay"; //changed to keeping case for extended challenge
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
		String expected = "iraffegay";
		String actual = PigLatin.translateConsonantWord("giraffe");
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
		String expected = "elseway";
		String actual = PigLatin.translateVowelWord("else");
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


