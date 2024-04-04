package application;

import entities.Customer;

public class App {

    public static void main(String[] args) {

        String a = "Jorge";
        String b = "Jorge";
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a.equals(b));

        Customer c1 = new Customer("Maria", "maria@gmail.com");
        Customer c2 = new Customer("Maria", "jorge@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);
        System.out.println(a==b);
    }
}
