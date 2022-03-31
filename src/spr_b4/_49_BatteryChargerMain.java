package spr_b4;

// Requires: BatteryCharger.java
public class _49_BatteryChargerMain {

	public static void main(String[] args) {

		BatteryCharger bc = new BatteryCharger();
		int start, duration;
		
		// (a)
		System.out.println("(a)");
		start = 12;
		duration = 1;
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		start = 0;
		duration = 2;
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		start = 22;
		duration = 7;
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		start = 22;
		duration = 30;
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		
		// (b)
		System.out.println("(b)");
		duration = 1;
		start = bc.getChargeStartTime(duration);
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		duration = 2;
		start = bc.getChargeStartTime(duration);
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		duration = 7;
		start = bc.getChargeStartTime(duration);
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		duration = 30;
		start = bc.getChargeStartTime(duration);
		System.out.println(start+"~"+(start+duration-1)+": "+bc.getChargingCost(start, duration));
		
	}

}
