package spr_b1;

public class Time {

    private final int hr;
    private final int min;

    public Time(int h, int m, String ampm) {
        if (ampm.equals("pm") && h != 12) {
            hr = h + 12;
            min = m;
        } else {
            hr = h;
            min = m;
        }
    }

    public int getHour() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public String toString() {
        return hr + ":" + min;
    }

    /**
     * @return difference, in minutes, between this time and other;
     * difference is negative if other is earlier than this time
     */
    public int minutesUntil(Time other) {
        // implementation not shown
        // t1 : hr, min
        // t2 : other.getHour, other.getMinutes
        int t1 = hr * 60 + min;
        int t2 = other.getHour() * 60 + other.getMinutes();
        return t2 - t1;
    }


}
