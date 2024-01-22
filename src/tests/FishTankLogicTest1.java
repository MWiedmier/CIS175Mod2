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
 * Test Case where Tank Values are just right
 */
public class FishTankLogicTest1 {
	FishTank ft = new FishTank(72, 7.2, 0);
	FishTankLogic ftLogic = new FishTankLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testJustRightTemp() {
		String report = ftLogic.tempStats(ft.getTemp());
		assertEquals("Temperature is just right", report);
	}
	
	@Test
	public void testJustRightAmm() {
		String report = ftLogic.ammoniaStats(ft.getAmmonia());
		assertEquals("Ammonia is at safe levels", report);
	}
	
	@Test
	public void testJustRightPH() {
		String report = ftLogic.phStats(ft.getPh());
		assertTrue(report.equals("PH is just right"));
	}
	
	@Test
	public void testJustRightFishTankReport() {
		String report = ftLogic.fistTankReport(ft);
		assertEquals("Fishtank Status: Temperature is just right, Ammonia is at safe levels, PH is just right.", report);
	}
	
	@Test
	public void testFishTankToString() {
		assertNotNull(ft.toString());
	}

}
