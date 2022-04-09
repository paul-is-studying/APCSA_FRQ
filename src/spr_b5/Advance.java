package spr_b5;

public class Advance extends Ticket{
    private int numDays;
    public Advance(int n){
        super();
        numDays = n;
    }
    public double getPrice(){
        if (numDays>=10){
            return 30;
        }else{
            return 40;
        }
    }
}
