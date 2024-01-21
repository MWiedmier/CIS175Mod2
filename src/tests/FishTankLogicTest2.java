/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Jan 21, 2024
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.FishTank;
import model.FishTankLogic;

/**
 * Test Case where Tank Values are too high
 */
public class FishTankLogicTest2 {
	FishTank ft = new FishTank(80, 8, 1);
	FishTankLogic ftLogic = new FishTankLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testtooHighTemp() {
		ft.setTemp(80);
		String report = ftLogic.tempStats(ft.getTemp());
		assertEquals("Temperature is too warm", report);
	}
	
	@Test
	public void testTooHighAmm() {
		String report = ftLogic.ammoniaStats(ft.getAmmonia());
		assertEquals("Ammonia is too high", report);
	}
	
	@Test
	public void testTooHighPH() {
		String report = ftLogic.phStats(ft.getPh());
		assertEquals("PH is too high", report);
	}
	
	@Test
	public void testTooHighFishTankReport() {
		String report = ftLogic.fistTankReport(ft);
		assertEquals("Fishtank Status: Temperature is too warm, Ammonia is too high, PH is too high.", report);
	}

}
