/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Jan 21, 2024
 */
package model;

/**
 * FishTank class to get and set object of fish tank and water statuses
 */
public class FishTank {
	private int temp;
	private double ph;
	private double ammonia;
	
	//Constructors
	/**
	 * No arg constructor
	 */
	public FishTank() {
		super();
	}
	
	/**
	 * @param temp
	 * @param ph
	 * @param ammonia
	 */
	public FishTank(int temp, double ph, double ammonia) {
		super();
		this.temp = temp;
		this.ph = ph;
		this.ammonia = ammonia;
	}
	
	//Getters and Setters
	/**
	 * @return the temp
	 */
	public int getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(int temp) {
		this.temp = temp;
	}
	/**
	 * @return the ph
	 */
	public double getPh() {
		return ph;
	}
	/**
	 * @param ph the ph to set
	 */
	public void setPh(double ph) {
		this.ph = ph;
	}
	/**
	 * @return the ammonia
	 */
	public double getAmmonia() {
		return ammonia;
	}
	/**
	 * @param ammonia the ammonia to set
	 */
	public void setAmmonia(double ammonia) {
		this.ammonia = ammonia;
	}
	
	//Methods
	@Override
	public String toString() {
		return "FishTank [temp=" + temp + ", ph=" + ph + ", ammonia=" + ammonia + "]";
	}
}
