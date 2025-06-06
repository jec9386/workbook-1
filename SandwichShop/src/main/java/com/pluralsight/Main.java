package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt for size of sandwich
        System.out.print("What size sandwich do you want?\nRegular($5.45)\nLarge($8.95)\n Please select (regular/large): ");
        String size = scanner.nextLine();

        double subTotal = 0.0;

        //if else statement for sizes
        if (size.equalsIgnoreCase("regular")) {
            subTotal = 5.45;
        } else if (size.equalsIgnoreCase("large")) {
            subTotal = 8.95;
        } else {
            System.out.println("Invalid size entered.");
            System.exit(0);
        }


        //Prompt user for the loaded or no
        System.out.printf("Do you want loaded fries(double everything)? Regular Sandwich(+$1.00) and LargeSandwich(+$1.75)\n(Yes/No)?: ");
        String loaded = scanner.nextLine();
        if(loaded.equalsIgnoreCase("Yes")){
            if (size.equalsIgnoreCase("regular")){
                subTotal += 1.00;
            }
            else{
                subTotal += 1.75;
            }
            System.out.println("Sandwich is loaded!");
            }else{
                System.out.println("Sandwich is not loaded.");
            }

/*
        //Prompt user for size and add the cost to price
        if(input.equalsIgnoreCase("yes")) {
            System.out.print("What size sandwich did you order Regular(+$1.00) or Large(+1.75)?: ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Regular")) {
                price += 1.00;
            }
            else if (response.equalsIgnoreCase("Large")) {
                price += 1.75;
            }
            else {
                System.out.println("Invalid size entered.");
                System.exit(0);
            }
            System.out.println("Double everything added!");

        }
        else if (input.equalsIgnoreCase("no")) {
            System.out.println("No loaded fries.");

        }
        else{
            System.out.println("Wrong selection.");
            System.exit(0);
        }

*/





        //prompt for age
        System.out.print("Enter age to see if you qualify for a discount?: ");
        int age = scanner.nextInt();

        //if else for student and seniors discount
        double discountPercent;
        String discountType;

        if (age <= 17){
            discountPercent = 0.10;
            discountType = "Student";
            //System.out.println("Discounted price: $" + String.format("%.2f", price * .90));
        }
        else if (age >= 65){
            discountPercent = 0.20;
            discountType = "Senior";
            //System.out.println("Discounted price: $" + String.format("%.2f", price * .80));
        }else {
            discountPercent = 0;
            discountType = "";
            //System.out.println("Sorry no discount final price is: $" + String.format("%.2f", price));
        }

        double total = subTotal * (1 - discountPercent);


        //display the final price
        if(discountType.equalsIgnoreCase("")){
            System.out.printf("Final price is $%.2f", total);
        }
        else {
            System.out.printf("You qualify for a %f %.2f discount. Final price is $%.2f", discountPercent, discountType, total );
        }

    }
}