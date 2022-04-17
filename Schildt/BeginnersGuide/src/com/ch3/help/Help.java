package com.ch3.help;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Choose one: ");

        char choice;

        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                break;
            default:
                System.out.println("Selection not found.");
        }

    }
}
