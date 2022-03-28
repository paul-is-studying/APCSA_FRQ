package spr_b1;

import java.util.Arrays;

// Requires: Customer.java
public class _39_CustomerMain {

    public static void main(String[] args) {

        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Anderson", 1002);
        Customer c3 = new Customer("Smith", 1003);

        // (a) : should be 0, positive int, negative int
        System.out.println("==(a)==================");
        System.out.println(c1 + ":" + c1 + " = " + c1.compareCustomer(c1));
        System.out.println(c1 + ":" + c2 + " = " + c1.compareCustomer(c2));
        System.out.println(c1 + ":" + c3 + " = " + c1.compareCustomer(c3));

        // (b) :
        Customer[] list1 = {
                new Customer("Arthur", 4920),
                new Customer("Burton", 3911),
                new Customer("Burton", 4944),
                new Customer("Franz", 1692),
                new Customer("Horton", 9221),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Nguyen", 4339),
        };

        Customer[] list2 = {
                new Customer("Aaron", 1729),
                new Customer("Baker", 2921),
                new Customer("Burton", 3911),
                new Customer("Dillard", 6552),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Noble", 3335),
        };

        Customer[] result = new Customer[6];

        prefixMerge(list1, list2, result);

        System.out.println("==(b)==================");
        System.out.println(Arrays.toString(result));


    }

    // fills result with customers merged from the
    // beginning of list1 and list2;
    // result contains no duplicates and is sorted in
    // ascending order by customer
    // precondition: result.length > 0;
    // list1.length >= result.length;
    // list1 contains no duplicates;
    // list2.length >= result.length;
    // list2 contains no duplicates;
    // list1 and list2 are sorted in
    // ascending order by customer
    // postcondition: list1, list2 are not modified
    public static void prefixMerge(Customer[] list1,
                                   Customer[] list2,
                                   Customer[] result) {
        // to be implemented in (b)


    }


}
