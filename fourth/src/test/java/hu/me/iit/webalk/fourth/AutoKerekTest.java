package hu.me.iit.webalk.fourth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hu.me.iit.webalk.fourth.Impl.AutoKerek;

class AutoKerekTest {

	@Test
	void toStringTest() {
		//GIVEN
		final String EXPECTED_KEREK = "Kerék típusa: noname, adatai: 190/15 R 90";
		Kerek kerek = new AutoKerek();
		
		//WHEN
		String result_kerek = kerek.toString();
		
		//THEN
		assertEquals(EXPECTED_KEREK, result_kerek);
	}
	
	@Test
	void toStringParameterTest() {
		//GIVEN
		final String TYPE = "name";
		final int[] NUMBERS = {205, 20, 95};
		final String EXPECTED_KEREK = "Kerék típusa: name, adatai: "+NUMBERS[0]+"/"+NUMBERS[1]+" R "+NUMBERS[2];
		Kerek kerek;
		
		//WHEN
		kerek = new AutoKerek(TYPE, NUMBERS[0], NUMBERS[1], NUMBERS[2]);
		String result_kerek = kerek.toString();
		
		//THEN
		assertEquals(EXPECTED_KEREK, result_kerek);
	}

}
