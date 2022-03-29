package spr_b1;

public class Flight {

    private final Time dep;
    private final Time arr;

    // constructor
    public Flight(Time d, Time a) {
        dep = d;
        arr = a;
    }

    // toString
    public String toString() {
        return "Dep: " + dep + " ~ Arr: " + arr;
    }

    /**
     * @return time at which the flight departs
     */
    public Time getDepartureTime() {
        return dep;/* implementation not shown */
    }

    /**
     * @return time at which the flight arrives
     */

    public Time getArrivalTime() {
        return arr;/* implementation not shown */
    }
    // There may be instance variables, constructors, and methods that are not shown.
}
