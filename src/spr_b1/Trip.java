package spr_b1;

import java.util.ArrayList;

public class Trip {
    private final ArrayList<Flight> flights;

    // constructor
    public Trip() {
        flights = new ArrayList<Flight>();
    }

    // adds flights
    public void addTrip(Flight f) {
        flights.add(f);
    }

    // toString override
    public String toString() {
        String ret = "";
        ret += "\n== Begin Trip ==";
        for (Flight f : flights) {
            ret += "\n";
            ret += f.toString();
        }
        ret += "\n== End Trip ==";
        return ret;
    }

    // stores the flights (if any) in chronological order

    /**
     * @return the number of minutes from the departure of the first flight to
     * the arrival of the last flight if there are one or more flights
     * in the trip; 0, if there are no flights in the trip
     */
    public int getDuration() {
        // to be implemented in part (a)
        if(flights.size()==0){
            return 0;
            // 0 if there are no flights in the trip.
        }else{
            Time arrivalValue = flights.get(flights.size()-1).getArrivalTime();
            Time departureValue = flights.get(0).getDepartureTime();
            return arrivalValue.minutesUntil(departureValue);
            // arrivalTime - departureTime, assuming arrivalTime is always bigger than departureTime.
        }
    }

    /**
     * Precondition: the departure time for each flight is later than the
     * arrival time of its preceding flight
     *
     * @return the smallest number of minutes between the arrival of a flight
     * and the departure of the flight immediately after it, if there
     * are two or more flights in the trip; -1, if there are fewer than
     * two flights in the trip
     */
    public int getShortestLayover() {
        // to be implemented in part (b)

        // .minutesUntil returns as "int"
        int compareValue, minValue;
        Time firstValue, secondValue;

        // Initialize minValue, error if not. Why?
        minValue = Integer.MAX_VALUE;

        if(flights.size() < 3){
            return -1;
        }else{
            for(int i = 1; i < flights.size() ; i++){
                firstValue = flights.get(i+1).getArrivalTime();
                secondValue = flights.get(i).getArrivalTime();
                compareValue = firstValue.minutesUntil(secondValue);
                if (compareValue <= minValue){
                    minValue =  compareValue;
                }
            }
        }
        return minValue;
    }

}
