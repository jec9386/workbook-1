package com.pluralsight;

import java.util.Scanner;

importy java.util.*;

public class InputExample {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first number?");
        double number1 = scanner.nextDouble;

        System.out.println("What is the second number!");
        double number2 = scanner.nextDouble();

        double product = number1 * number2;

        System.out.printf("The product of %f and %f is %f", number1, number2, product);

        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);



    }
}
