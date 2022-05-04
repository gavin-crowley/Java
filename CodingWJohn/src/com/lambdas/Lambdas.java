package com.lambdas;

public class Lambdas {
    public static void main(String[] args) {

//        Cat myCat = new Cat();
//        myCat.print();
//        printThing(myCat);
//        printThing(() -> System.out.println("Meow2"));

        // can save as a variable
//        Printable lambdaPrintable = () -> System.out.println("Meow2");
        Printable lambdaPrintable = (s) -> System.out.println("Meow2 " + s);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
