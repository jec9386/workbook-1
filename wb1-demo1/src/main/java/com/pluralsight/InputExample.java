package com.pluralsight;


//Import scanner package and put it in our package
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args){
        // Scanner(blueprint/class)-can read user input
        // create a new object from scanner. variable name is scanner.
        // Ststem.in- that reads input from our keyboard.
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is the first number? ");
        //call nextDouble() method on existing scanner object. Store return value into our variable number 1.
        //nextDouble() method built in method from the Scanner class. Wait for user to type a fouble and press enter- store that number.
        double number1 = scanner.nextDouble();

        System.out.print("What is the second number? ");
        double number2 = scanner.nextDouble();

        double product = number1 * number2;

        System.out.printf("The product of %.1f and %.1f is %.1f\n", number1, number2, product);

        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);



    }
}
