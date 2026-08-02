import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaWahalaTest {

	@Test 
	void testNumberOfBoxesForOdogwuPizzaType(){
		PizzaWahala box = new PizzaWahala();
		assertEquals(4,box.noOfBox(45,"Odogwu"));
	}

	@Test 
	void testNumberOfBoxesForBigBoysPizzaType(){
		PizzaWahala box = new PizzaWahala();
		assertEquals(6,box.noOfBox(45,"Big Boys"));
	}

	@Test 
	void testNumberOfBoxesForSmallMoneyPizzaType(){
		PizzaWahala box = new PizzaWahala();
		assertEquals(8,box.noOfBox(45,"Small Money"));
	}

	@Test 
	void testNumberOfBoxesForSapaSizePizzaType(){
		PizzaWahala box = new PizzaWahala();
		assertEquals(12,box.noOfBox(45,"SaPa size"));
	}

	@Test 
	void testNumberOfSlicesLeftInOdogwuPizzaType(){
		PizzaWahala slice = new PizzaWahala();
		assertEquals(3,slice.noOfSlice(45,"Odogwu"));
	}

	@Test 
	void testNumberOfSlicesLeftInBigBoysPizzaType(){
		PizzaWahala slice = new PizzaWahala();
		assertEquals(3,slice.noOfSlice(45,"Big Boys"));
	}

	@Test 
	void testNumberOfSlicesLeftInSmallMoneyPizzaType(){
		PizzaWahala slice = new PizzaWahala();
		assertEquals(3,slice.noOfSlice(45,"Small Money"));
	}

	@Test 
	void testNumberOfSlicesLeftInSapaSizeuPizzaType(){
		PizzaWahala slice = new PizzaWahala();
		assertEquals(3,slice.noOfSlice(45,"sapa size"));
	}

	@Test 
	void testPriceOfOdogwuPizzaType(){
		PizzaWahala price = new PizzaWahala();
		assertEquals(20800,price.priceOfBox(45,"Odogwu"));
	}

	@Test 
	void testPriceOfBigBoysPizzaType(){
		PizzaWahala price = new PizzaWahala();
		assertEquals(24000,price.priceOfBox(45,"big boys"));
	}

	@Test 
	void testPriceOfOSmallMoneyPizzaType(){
		PizzaWahala price = new PizzaWahala();
		assertEquals(23200,price.priceOfBox(45,"small money"));
	}

	@Test 
	void testPriceOfSapaSizePizzaType(){
		PizzaWahala price = new PizzaWahala();
		assertEquals(30000,price.priceOfBox(45,"sapa size"));
	}
}