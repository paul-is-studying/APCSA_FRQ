package test2;

public class StepTracker {
    private int steps, days, adays, lim;
    public StepTracker(int n){
        steps = 0;
        days = 0;
        adays = 0;
        lim = n;
    }
    public int activeDays(){
        return adays;
    }
    public void addDailySteps(int n){
        steps += n;
        days++;
        if(n>=lim){
            adays++;
        }
    }
    public double averageSteps(){
        if (days == 0) {
            return 0;
        }
        return (double)steps/days;
    }

	
}
