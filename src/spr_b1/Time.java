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

        return 0;
    }


}
