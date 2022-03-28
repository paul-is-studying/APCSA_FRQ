package test1;

public class CodeWordChecker implements StringChecker {
    private String not;
    private int min,max;

    public CodeWordChecker(String not, int min, int max) {
        this.not = not;
        this.min = min;
        this.max = max;
    }

    public CodeWordChecker(int i, int min, String str) {
        not = str;
        this.min = 6;
        max = 20;
    }

    public boolean isValid(String str) {
        if(str.length() < min || str.length() > max){
            return false;
        }
        if(str.indexOf(not) != -1){
            return false;
        }
        return true;

        //return s.length() >= min && s.length() <= max && !s.contains(not);
    }
}
