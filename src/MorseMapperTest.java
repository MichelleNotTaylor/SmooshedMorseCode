

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MorseMapperTest {
	MorseMapper morseMapper = new MorseMapper();
	
	@Test
	void shouldReturnCorrectMorseForString() {
		assertEquals(morseMapper.convertToMorse("MORSE CODE"), "-- --- .-. ... . -.-. --- -.. . ");
		assertEquals(morseMapper.convertToMorse("Morse Code"), "-- --- .-. ... . -.-. --- -.. . ");
		assertEquals(morseMapper.convertToMorse("morse     code"), "-- --- .-. ... . -.-. --- -.. . ");
	}
	
	@Test
	void shouldNotFindUnmappedValues() {
		assertEquals(morseMapper.convertToMorse("!@#$%123"), "");
	}

	@Test
	void shouldReturnMappedValuesForCharacters() {
		assertEquals(morseMapper.convertToMorse("A"), ".- ");
		assertEquals(morseMapper.convertToMorse("B"), "-... ");
		assertEquals(morseMapper.convertToMorse("C"), "-.-. ");
		assertEquals(morseMapper.convertToMorse("D"), "-.. ");
		assertEquals(morseMapper.convertToMorse("E"), ". ");
		assertEquals(morseMapper.convertToMorse("F"), "..-. ");
		assertEquals(morseMapper.convertToMorse("G"), "--. ");
		assertEquals(morseMapper.convertToMorse("H"), ".... ");
		assertEquals(morseMapper.convertToMorse("I"), ".. ");
		assertEquals(morseMapper.convertToMorse("J"), ".--- ");
		assertEquals(morseMapper.convertToMorse("K"), "-.- ");
		assertEquals(morseMapper.convertToMorse("L"), ".-.. ");
		assertEquals(morseMapper.convertToMorse("M"), "-- ");
		assertEquals(morseMapper.convertToMorse("N"), "-. ");
		assertEquals(morseMapper.convertToMorse("O"), "--- ");
		assertEquals(morseMapper.convertToMorse("P"), ".--. ");
		assertEquals(morseMapper.convertToMorse("Q"), "--.- ");
		assertEquals(morseMapper.convertToMorse("R"), ".-. ");
		assertEquals(morseMapper.convertToMorse("S"), "... ");
		assertEquals(morseMapper.convertToMorse("T"), "- ");
		assertEquals(morseMapper.convertToMorse("U"), "..- ");
		assertEquals(morseMapper.convertToMorse("V"), "...- ");
		assertEquals(morseMapper.convertToMorse("W"), ".-- ");
		assertEquals(morseMapper.convertToMorse("X"), "-..- ");
		assertEquals(morseMapper.convertToMorse("X"), "-..- ");
		assertEquals(morseMapper.convertToMorse("Z"), "--.. ");
	}

}
