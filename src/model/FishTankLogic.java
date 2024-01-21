/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Jan 21, 2024
 */
package model;

/**
 * Class that handles logic of Fish Tank reports
 */
public class FishTankLogic {
	
	//Method that returns a string of the temperature status
	public String tempStats(int temp) {
		String status = "";
		
		if (temp > 78) {
			status = "Temperature is too warm";
		}
		else if(temp < 70) {
			status = "Temperature is too cold";
		}
		else {
			status = "Temperature is just right";
		}
		
		return status;
	}
	
	//Method that returns a string of the ammonia status
	public String ammoniaStats(double am) {
		String stats = "";
		
		if(am >= 0.5) {
			stats = "Ammonia is too high";
		}
		else {
			stats = "Ammonia is at safe levels";
		}
		
		return stats;
	}
	
	//Method that returns a string of the PH status
	public String phStats(double ph) {
		String stats = "";
		
		if(ph > 7.5) {
			stats = "PH is too high";
		}
		else if(ph < 7) {
			stats = "PH is too low";
		}
		else {
			stats = "PH is just right";
		}
		
		return stats;
	}
	
	//Method that returns all the statuses in a single report
	public String fistTankReport(FishTank fishtank) {
		String stats = "";
		String tempStat = tempStats(fishtank.getTemp());
		String ammStat = ammoniaStats(fishtank.getAmmonia());
		String phStat = phStats(fishtank.getPh());
		stats = "Fishtank Status: " + tempStat + ", " + ammStat + ", " + phStat + ".";
		return stats;
	}
}
