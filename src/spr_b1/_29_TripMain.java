package spr_b1;

// requires: Flight.java, Time.java, Trip.java
public class _29_TripMain {

    public static void main(String[] args) {

        // test the Time class...
        Time t1 = new Time(11, 30, "am");
        Time t2 = new Time(12, 15, "pm");

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Length t1~t2:" + t1.minutesUntil(t2));
        System.out.println("Length t2~t1:" + t2.minutesUntil(t1));

        Flight f1 = new Flight(t1, t2);
        System.out.println(f1);

        // try out the trip class

        Trip t = new Trip();
        t.addTrip(f1);    // 1st flight ( from above )
        Flight f2 = new Flight(new Time(1, 15, "pm"), new Time(3, 45, "pm")); // 2nd flight
        t.addTrip(f2);
        t.addTrip(new Flight(new Time(4, 0, "pm"), new Time(6, 45, "pm"))); // 3rd flight
        t.addTrip(new Flight(new Time(10, 15, "pm"), new Time(11, 0, "pm"))); // 4th flight
        System.out.println(t);

        // (a)
        System.out.println("Duration of Trip: " + t.getDuration());

        // (b)
        System.out.println("Shortest Layover: " + t.getShortestLayover());


        // other examples
        Trip trip2 = new Trip(); // has no flights
        System.out.println("Duration of trip: " + trip2.getDuration());
        System.out.println("Shortest Layover: " + trip2.getShortestLayover());

        Trip trip3 = new Trip(); // has one flight, but no layovers
        trip3.addTrip(f1);
        System.out.println("Duration of trip: " + trip3.getDuration());
        System.out.println("Shortest Layover: " + trip3.getShortestLayover());

        Trip trip4 = new Trip(); // has one flight, but no layovers
        trip4.addTrip(f1);
        trip4.addTrip(f2);
        System.out.println("Duration of trip: " + trip4.getDuration());
        System.out.println("Shortest Layover: " + trip4.getShortestLayover());

    }

}
