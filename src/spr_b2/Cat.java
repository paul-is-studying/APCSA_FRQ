package spr_b2;

// (a)
public class Cat extends Pet{
//    private String myName;
//
//    public Cat (String name) {
//        myName = name;
//    }
//
//    public String getName() {
//        return myName;
//    }
//
//    public String speak(){
//        return "Meow";
//    }
//
    //1. same name as Class
    //2. no return type
    //3. public

    public Cat(String str){
        super(str);
    }
    public String speak(){
        return "Meow";
    }
}
