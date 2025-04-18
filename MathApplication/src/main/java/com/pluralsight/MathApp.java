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
        System.out.println("Determine who's salary is greater.");
        double bobSalary = 70000;
        double garySalary = 85000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The higher salary is " + highestSalary);

        //Questions 2
        System.out.println("Which care price is cheaper?");
        double carPrice = 70000;
        double truckPrice = 85000;
        double cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper car is " + cheapestPrice);

        //Question 3
        //need to define circleRadius above if you want to use printf
        double circleRadius = 7.25;
        // need \n so that the cursor will start on a new line.
        System.out.printf("What is the radius of a circleRadius of %f.\n",circleRadius);
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        // this uses basic concatanation "+"
        System.out.println("Area of circle A is " + circleArea);

        //Question 4
        double num1 = 5.0;
        System.out.printf("What is the square root of %f.\n",num1);
        double squareRoot = Math.sqrt(num1);
        System.out.println("The square root of num1 is " + squareRoot);

        //Question 5
        System.out.println("What is the difference between these 2 lines?");
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the 2 points is " + distance);



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
