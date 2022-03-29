package spr_b2;

// (a)
public class Cat extends Pet{
    private String myName;

    public Cat (String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public String speak(){
        return "Meow";
    }

}
