package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double basePay = 29.99;

        double rentCar = promptRentCar();
        //if promptRentCar() returns anything but 1, print text and exit code.
        if (rentCar != 1) {
            System.out.println("Okay, see you next time!");
            return;
        }

        //ask user for the date they'd pick up the car. Store response as a string.
        String pickUpDate = promptPickUpDate();

        //ask user for the amount of days they'd like to rent the car for. Store answer as a number into days.
        double days = promptDaysUse();

        //call 3 methods 1 after the other to ask user if they want these optional add ons. each method returns a 1 for yes and a 2 for no. Cast result into int even though method returns a double. In the future can just define these methods as a int.
        int electronicTag = (int) electronicTag();
        int gps = (int) gps();
        int roadSideAssistance = (int) roadSideAssistance();

        //ask for age.
        double age = promptForAge();

        //call a method that passes all add on choices and the number of days. Figure out total cost for add ons and the rental days.
        double optionTotal = optionsCalculator(electronicTag, gps, roadSideAssistance, days);

        //final caluclation and returns the full price.
        double totalCost = calculateTotal(basePay, days, optionTotal, age);

        // Display summary- print reciept for user.
        System.out.println("\n====== Rental Summary ======");
        System.out.printf("Pickup Date: %s\n", pickUpDate);
        System.out.printf("Days Booked: %.0f\n", days);
        System.out.printf("Base Rate: $%.2f/day\n", basePay);
        System.out.printf("Electronic Toll Tag: %s\n", electronicTag == 1 ? "Yes" : "No");
        System.out.printf("GPS: %s\n", gps == 1 ? "Yes" : "No");
        System.out.printf("Roadside Assistance: %s\n", roadSideAssistance == 1 ? "Yes" : "No");
        System.out.printf("Driver Age: %.0f\n", age);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("=============================");
    }

    public static double promptRentCar() {
        System.out.print("Welcome to Jerry's Rental! Would you like to rent a car for $29.99/day?\nEnter Number 1(Yes!) or 2(No.): ");
        return scanner.nextDouble();
    }

    public static String promptPickUpDate() {
        System.out.print("What date would you like to pick it up?\nFormat(xx/xx/xxxx): ");
        scanner.nextLine();  // Clear newline
        return scanner.nextLine();
    }

    public static double promptDaysUse() {
        System.out.print("How many days will you like to use the vehicle: ");
        return scanner.nextDouble();
    }

    public static double electronicTag() {
        System.out.println("Optional - add on electronic toll tag at $3.95/day?\nEnter number 1(Yes!) or 2(No!): ");
        return scanner.nextDouble();
    }

    public static double gps() {
        System.out.println("Optional - add on GPS at $2.95/day?\nEnter number 1(Yes!) or 2(No!): ");
        return scanner.nextDouble();
    }

    public static double roadSideAssistance() {
        System.out.println("Optional - add on roadside assistance at $3.95/day?\nEnter number 1(Yes!) or 2(No!): ");
        return scanner.nextDouble();
    }

    public static double promptForAge() {
        System.out.println("Please enter your age (age below 25 will have a 30% surcharge): ");
        return scanner.nextDouble();
    }

    public static double optionsCalculator(int electronicTag, int gps, int roadSideAssistance, double days) {
        double optionTotal = 0;
        if (electronicTag == 1) optionTotal += 3.95 * days;
        if (gps == 1) optionTotal += 2.95 * days;
        if (roadSideAssistance == 1) optionTotal += 3.95 * days;
        return optionTotal;
    }

    public static double calculateTotal(double basePay, double days, double optionTotal, double age) {
        if (age < 25) {
           basePay += basePay * 0.3;  // 30% surcharge
        }
        double total = basePay * days + optionTotal;
        return total;
    }
}






































/*
package com.pluralsight;


import java.sql.SQLOutput;
import java.util.Scanner;

public class RentalCarCalculator {

    //create a new static(belong to the class) object.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double basePay = 29.99;
        //Get the known values. + call
        double rentCar = promptRentCar();
        String pickUpDate = promptPickUpDate();
        double days = promptDaysUse();
        double electronicTag = electronicTag();
        double gps = gps();
        double roadSideAssistance = roadSideAssistance();
        double age = promptForAge();
        double optionTotal = optionsCalculator();
        double totalCost =

        //Display results
        System.out.println("");
    }

        //create method for prompt car.
        public static double promptRentCar(){
            System.out.print("Welcome to Jerry's Rental! Would you like to rent a car for $29.99/day?\nEnter Number 1(Yes!) or 2(No.): ");
            return scanner.nextInt();

        }

        //create method for pickUpDate.
        public static String promptPickUpDate(){
            System.out.print("What date would you like to pick it up?/nFormat(xx/xx/xxx): ");
            scanner.nextLine();
            return scanner.nextLine();
        }

        //create a method for days.
        public static double promptDaysUse(){
            System.out.print("How many days will you like to use the vehicle: ");
            return scanner.nextDouble();
        }

        //Asks if the user wants to include an electronic toll tag for an additional fee
        public static double electronicTag() {
            System.out.print("Optional- add on electronic toll tag at $3.95/day?\nEnter number 1(Yes!)or 2(No!): ");
            return scanner.nextDouble();
        }

        //Asks if the user wants to include a gps for an additional fee
        public static double gps() {
            System.out.println("Optional- add on GPS at $2.95/day?\nEnter number 1(Yes!)or 2(No!): ");
            return scanner.nextDouble();
        }

        //Asks if the user wants to include roadside assistance for an additional fee
        public static double roadSideAssistance() {
            System.out.println("Optional -add on roadside assistance at $3.95/day?\nEnter number 1(Yes!)or 2(No!): ");
            return scanner.nextDouble()
        }

        //Prompts user to enter their age
        public static double promptForAge(basePay) {
            System.out.println("Please enter your age (age below 25y/o will have 30% surcharge: ");
            double age = scanner.nextDouble();
            if (age < 25){
                basePay += (basePay + basePay * 0.3);
            }else{
                basePay;
            }
        }


        //options calculator

        public static double optionsCalculator(double electronicTag, double gps, double roadSideAssistance,double days){
            double optionTotal = 0;
            if(electronicTag == 1){
                double += 3.95 * days;
            }else{
                double += 0;
            }
            if(gps == 1){
                double += 2.95 * days;
            }else{
                double += 0;
            }
            if(roadSideAssistance == 1){
                double += 3.95 * days;
            }else{
                double += 0;
            }
            return  optionTotal;
        }

        public static double totalCost()

}

*/

/*

//I like this idea but I don't know how to do at this momemnt.
public static double promptOptions(){
    System.out.println("Optional add ons:\n(1) electronic toll tag at $3.95/day?\n(2) GPS at $3.95/day\n(3)roadside assistance at $3.95/day\nInput number for add on ");
}
*/
