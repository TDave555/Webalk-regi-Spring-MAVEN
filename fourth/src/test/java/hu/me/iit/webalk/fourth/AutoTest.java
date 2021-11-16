package hu.me.iit.webalk.fourth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hu.me.iit.webalk.fourth.Impl.AutoKerek;
import hu.me.iit.webalk.fourth.Impl.BelsoEgesuMotor;

class AutoTest {

	@Test
	void toStringTest() {
		//GIVEN
		final String EXPECTED_WHEEL = "Kerék típusa: noname, adatai: 190/15 R 90";
		final String EXPECTED_MOTOR = "Motor űrtartalma: 1000 lóereje: 50";
		final String EXPECTED_TYPE = "Opel Corsa";
		final String EXPECTED = "Az autó típusa: "+EXPECTED_TYPE+
				 				"\nAz autó motorja: "+EXPECTED_MOTOR+
				 				"\nAz autó kereke: "+EXPECTED_WHEEL;
		Auto auto;
		
		//WHEN
		auto = new Auto(new BelsoEgesuMotor(), make4wheel(), EXPECTED_TYPE);
		String result = auto.toString();
		
		//THEN
		assertEquals(EXPECTED, result);
	}
	
	private Kerek[] make4wheel() {
		Kerek kerekek[] = new Kerek[4]; 
		
		for (int i = 0; i < kerekek.length; i++) {
			kerekek[i] = new AutoKerek();
		}
		return kerekek;
	}

}
