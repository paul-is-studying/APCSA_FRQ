package spr_b1;

public class Customer {

    private final String name;
    private final int id;

    // constructs a Customer with given name and ID number
    public Customer(String name, int idNum) {
        // implementation not shown
        this.name = name;
        this.id = idNum;
    }

    // returns the customer's name
    public String getName() {
        // implementation not shown
        return name;
    }

    // returns the customer's id
    public int getID() {
        // implementation not shown
        return id;
    }

    // returns 0 when this customer is equal to other;
    // a positive integer when this customer is greater than other;
    // a negative integer when this customer is less than other
    public int compareCustomer(Customer other) {
        // to be implemented in part (a)

        return 0;
    }

    // There may be fields, constructors, and methods that are not shown.
    public String toString() {
        return name + "(" + id + ")";
    }
}