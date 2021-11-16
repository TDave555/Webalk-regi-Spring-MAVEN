package hu.me.iit.webalk.fourth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hu.me.iit.webalk.fourth.Impl.BelsoEgesuMotor;

class BelsoEgesuMotorTest {

	@Test
	void toStringTest() {
		//GIVEN
		final String EXPECTED_MOTOR = "Motor űrtartalma: 1000 lóereje: 50";
		Motor motor = new BelsoEgesuMotor();
		
		//WHEN
		String result_motor = motor.toString();
		
		//THEN
		assertEquals(EXPECTED_MOTOR, result_motor);
	}
	
	@Test
	void toStringParameterTest() {
		//GIVEN
		final int[] NUMBERS = {1400, 85};
		final String EXPECTED_MOTOR = "Motor űrtartalma: "+NUMBERS[0]+" lóereje: "+NUMBERS[1];
		Motor motor;
		
		//WHEN
		motor = new BelsoEgesuMotor(NUMBERS[0], NUMBERS[1]);
		String result_motor = motor.toString();
		
		//THEN
		assertEquals(EXPECTED_MOTOR, result_motor);
	}
	

}
