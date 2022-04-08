package Banas;

import java.util.*;
import java.util.stream.IntStream;


public class HelloWorld {

    static Scanner sc = new Scanner(System.in);
    final double SHORTPI = 3.14159;
    public static void main(String[] args) {
        System.out.println("Hello World");

        int var1 = 100;
        int v2, v3;

        boolean happy = true;
        char a = 'a';
        float fNum = 1.11F;
        float fAnother = 2.22F;
        float fAnotheranother = 3.33F;
        float fAnotheranotheranother = 4.44F;
        float fAnotheranotheranotheranother = 5.55F;

        // ---- CONDITIONALS ----
        // Relational Operators : == != > < >= <=
        // Logical Operators : ! && ||
        int age = 12;
        if ((age >= 5) && (age <= 6)){
            System.out.println("Go to Kindergarten");
        } else if ((age >= 7) && (age <= 13)){
            System.out.println("Go to Middle School");
        } else if ((age >= 14) && (age <= 18)){
            System.out.println("Go to High School");
        } else {
            System.out.println("Stay Home");
        }
         
    }
}
