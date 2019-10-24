import java.util.HashMap;

public class MorseMapper {
	public HashMap<Character, String> morseMap = new HashMap<Character, String>();

	public MorseMapper() {
		super();
		mapMorseValues(morseMap);
	}
	
	public String convertToMorse(String alphaString) {
		StringBuffer stringBuffer = new StringBuffer();
		
		for(char alphaCharacter : alphaString.toUpperCase().toCharArray()) {
			if(morseMap.containsKey(alphaCharacter)) {
				stringBuffer.append(morseMap.get(alphaCharacter));
			}
		}
		
		return stringBuffer.toString();
	}
	
	public void mapMorseValues(HashMap<Character, String> map) {
		map.put('A', ".- ");
		map.put('B', "-... ");
		map.put('C', "-.-. ");
		map.put('D', "-.. ");
		map.put('E', ". ");
		map.put('F', "..-. ");
		map.put('G', "--. ");
		map.put('H', ".... ");
		map.put('I', ".. ");
		map.put('J', ".--- ");
		map.put('K', "-.- ");
		map.put('L', ".-.. ");
		map.put('M', "-- ");
		map.put('N', "-. ");
		map.put('O', "--- ");
		map.put('P', ".--. ");
		map.put('Q', "--.- ");
		map.put('R', ".-. ");
		map.put('S', "... ");
		map.put('T', "- ");
		map.put('U', "..- ");
		map.put('V', "...- ");
		map.put('W', ".-- ");
		map.put('X', "-..- ");
		map.put('Y', "-.-- ");
		map.put('Z', "--.. ");
	}
	
	public HashMap<Character, String> getMorseMap() {
		return morseMap;
	}

}
