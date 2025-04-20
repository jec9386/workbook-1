


























//old code- going to redo it

/*package com.pluralsight;

import java.util.Scanner;
//Make  class for add on so I can freely create objects in Main
public class Main {
    //static make universal so my other method can use it.
    public static double totalCost = 0;
    //Tell java where to start.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduction and basic starting cost
        double rentalCostPerDay = 29.99;
        System.out.printf("Welcome to Jerry's Rental!\nTo start you off the basic cost to rent a vehicle is %.2f per day.\nWould you like to rent a car?\n Input number 1(Yes!) or 2(No.): ",rentalCostPerDay);
        int userChoice = scanner.nextInt();
        scanner.nextLine(); //This was added because we are transitioning from a int to a line. We don't want the automatic /n to be inputted before use inputs their response.
        switch(userChoice){
            case 1:
                System.out.printf("Starting rental process, base cost $%.2f.\n", rentalCostPerDay);
                break;
            case 2:
                System.out.println("No worries,maybe next time!");
                break;
            default:
                System.out.println("Invalid input.");
                System.exit(0);
        }


        //prompt a pick up date.
        System.out.print("When is your pickup date?\n Format- (month/day/year)(00/00/0000): ");
        String pickUpDate = scanner.nextLine();

        //prompt # of vehicle days.
        System.out.print("How many days will you rent the vehicle(Enter a #): ");
        int daysOfRental = scanner.nextInt();
        scanner.nextLine();
        //print rental cost, ask if they want to look at important add ons.
        double initialRentalCost = daysOfRental * rentalCostPerDay;
        totalCost += initialRentalCost;
        System.out.printf("The cost to rent vehicle for %d days is %.2f.\nWould you like to look at a list of important add ons?\n Input number 1(Yes!) or 2(No.): ",daysOfRental,initialRentalCost);
        int optionsChoice = scanner.nextInt();

        //show add ons options and have them select which ones they want,loop through.
        AddOn[] addOns = {
                new AddOn("Electronic toll tag", 3.95),
                new AddOn("GPS Navigation", 9.99),
                new AddOn("Roadside Assistance", 7.49)
         };


        for (AddOn addOn : addOns){
            addOn.display();
            System.out.print("Would you like to add this option? Input number 1(Yes!) or 2(No.): ");
            int addOnChoice = scanner.nextInt();

            if(addOnChoice == 1){
                totalCost += addOn.pricePerDay * daysOfRental;
                System.out.printf("%s added! New total: $%.2f\n", addOn.name, totalCost);
                System.out.printf("\n");
            } else if (addOnChoice == 2) {
                System.out.printf("%s skipped.\n", addOn.name);
                System.out.printf("\n");
            } else {
                System.out.println("Invalid input. Skipping this add on.");
                System.out.printf("\n");
            }
            }

        System.out.printf("Thank you for renting at Jerry's Rental. Pick up date is %s. Your rental period is for %d days. Total cost is $%.2f.\nEnjoy your ride! ",pickUpDate,daysOfRental, totalCost);

        }
    static class AddOn{
        //create instance variables.
        String name;
        double pricePerDay;

        public AddOn(String name, double pricePerDay){
            this.name = name;
            this.pricePerDay = pricePerDay;
        }

        //Method to display the add-ons
        public void display(){
            System.out.printf("Price for %s is $%.2f/day\n", name, pricePerDay);
        }


    }









    }
*/