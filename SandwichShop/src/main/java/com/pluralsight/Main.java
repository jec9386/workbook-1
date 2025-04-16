package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt for size of sandwich
        System.out.print("What size sandwich do you want?: ");
        String size = scanner.nextLine();

        double price = 0.0;

        //if else statement for sizes
        if (size.equalsIgnoreCase("regular")) {
            price = 5.45;
        } else if (size.equalsIgnoreCase("large")) {
            price = 8.95;
        } else {
            System.out.println("Invalid size entered.");
            System.exit(0);
        }

        //prompt for age
        System.out.print("What is your age?: ");
        int age = scanner.nextInt();

        //if else for student and seniors discount

        if (age <= 17){
            System.out.println("Discounted price: $" + String.format("%.2f", price / 1.10));
        }
        else if (age >= 65){
            System.out.println("Discounted price: $" + String.format("%.2f", price / 1.20));
        }else {
            System.out.println("No Discount: $" + String.format("%.2f", price));
        }


    }
}