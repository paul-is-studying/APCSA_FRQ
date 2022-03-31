package spr_b4;

public class BatteryCharger {
	
	/** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
	private int[] rateTable = {
			50, 60, 160, 60, 80, 100, 100, 120,
			150, 150, 150, 200, 40, 240, 220, 220,
			200, 200, 180, 180, 140, 100, 80, 60
	};
	
	/** Determines the total cost to charge the battery starting at the beginning of startHour.
	* @param startHour the hour at which the charge period begins
	* Precondition: 0 ¡Â startHour ¡Â 23
	* @param chargeTime the number of hours the battery needs to be charged
	* Precondition: chargeTime > 0
	* @return the total cost to charge the battery
	*/
	public int getChargingCost(int startHour, int chargeTime) {
		// to be implemented in part (a) 
	
		return 0;
	}

	
	/** Determines start time to charge the battery at the lowest cost for the given charge time.
	* @param chargeTime the number of hours the battery needs to be charged
	* Precondition: chargeTime > 0
	* @return an optimal start time, with 0 ¡Â returned value ¡Â 23
	*/
	public int getChargeStartTime(int chargeTime){ 
		// to be implemented in part (b) 

		return 0;
	}
	// There may be instance variables, constructors, and methods that are not shown.
}