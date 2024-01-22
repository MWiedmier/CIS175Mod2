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
 * Test Case where Tank Values are too low
 */
public class FishTankLogicTest3 {
	FishTank ft = new FishTank();
	FishTankLogic ftLogic = new FishTankLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTooLowTemp() {
		ft.setTemp(60);
		String report = ftLogic.tempStats(ft.getTemp());
		assertEquals("Temperature is too cold", report);
	}
	
	@Test
	public void testJustRightAmm() {
		String report = ftLogic.ammoniaStats(ft.getAmmonia());
		assertEquals("Ammonia is at safe levels", report);
	}
	
	@Test
	public void testTooLowPH() {
		String report = ftLogic.phStats(ft.getPh());
		assertTrue(report.equals("PH is too low"));
	}
	
	@Test
	public void testTooLowFishTankReport() {
		String report = ftLogic.fistTankReport(ft);
		assertEquals("Fishtank Status: Temperature is too cold, Ammonia is at safe levels, PH is too low.", report);
	}
}