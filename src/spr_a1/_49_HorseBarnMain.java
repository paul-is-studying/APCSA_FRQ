package spr_a1;

public class _49_HorseBarnMain {

	public static void main(String[] args) {
		HorseBarn hb = new HorseBarn(7);
		hb.addHorse(0, "Trigger", 1340);
		hb.addHorse(2, "Silver", 1210);
		hb.addHorse(3, "Lady", 1575);
		hb.addHorse(5, "Patches", 1350);
		hb.addHorse(6, "Duke", 1410);
		hb.print();
		
		// (a) should return: 0, 2, -1
		System.out.println(hb.findHorseSpace("Trigger"));
		System.out.println(hb.findHorseSpace("Silver"));
		System.out.println(hb.findHorseSpace("Coco"));
		
		// (b)
		HorseBarn hb2 = new HorseBarn(7);
		hb2.addHorse(0, "Trigger", 1340);
		hb2.addHorse(2, "Silver", 1210);
		hb2.addHorse(5, "Patches", 1350);
		hb2.addHorse(6, "Duke", 1410);
		hb2.print();
		hb2.consolidate();
		System.out.println("Consolidated: ");
		hb2.print();
	}

}
