package com.pluralsight;

public class MathApp {

    public static void main(String[] args){
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1
        double bobSalary = 70000;
        double garySalary = 85000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //Questions 2
        System.out.println(" ");
        double carPrice = 70000;
        double truckPrice = 85000;
        double cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest car is " + cheapestPrice);

        //Question 3
        System.out.println(" ");
        double circleRadius = 7.25;

        System.out.println("Area of circle A is " + Math.PI * Math.pow(circleRadius, 2));

        //Question 4
        System.out.println(" ");
        double num1 = 5.0;
        System.out.println("The square root of num1 is " + Math.sqrt(num1));

        //Question 5
        System.out.println(" ");
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The absolute between the 2 points is " + distance);



        //Question 6
        System.out.println(" ");
        double num2 = -3.8;
        System.out.println("The absolute value of -3.8 is " + Math.abs(num2));



        //Question 7
        System.out.println(" ");
        double randomNumber = Math.random();  // Random number between 0.0 and 1.0
        System.out.println(randomNumber);







    }

}
