import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticTest{

	@Test
	void testResultForAboveSeventyPercentDeliverySuccess(){
		Logistics payment = new Logistics();
		assertEquals(45000, payment.pay(80));
	}

	@Test
	void testResultForLessThanFiftyPercentDeliverySuccess(){
		Logistics payment = new Logistics();
		assertEquals(11400, payment.pay(40));
	}

	@Test
	void testResultForBetweenFiftyAndFiftyNinePercentDeliverySuccess(){
		Logistics payment = new Logistics();
		assertEquals(15800, payment.pay(54));
	}

	@Test
	void testResultForAboveBetweenSixtyAndSixtyNinePercentDeliverySuccess(){
		Logistics payment = new Logistics();
		assertEquals(21000, payment.pay(64));
	}
}