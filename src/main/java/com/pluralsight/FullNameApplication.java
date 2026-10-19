package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName  = scan.nextLine();
        firstName.trim();
        System.out.print("Middle name: ");
        String middleName  = scan.nextLine();
        middleName.trim();
        System.out.print("Last name: ");
        String lastName  = scan.nextLine();
        lastName.trim();
        System.out.print("Suffix: ");
        String suffix  = scan.nextLine();
        suffix.trim();


        System.out.println("Full name: " + firstName + "\t" + middleName + " "  + lastName + ", "  + suffix);

    }
}
