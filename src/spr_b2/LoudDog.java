package spr_b2;

// (b)
public class LoudDog extends Pet {
    private String myName;

    public LoudDog(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public String speak() {
        return "dog-sound " + "dog-sound";
    }
}