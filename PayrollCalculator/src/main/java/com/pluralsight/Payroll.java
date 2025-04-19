package com.pluralsight;


import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Create Input for employee name.
        System.out.print("Please enter the employee name: ");
        String name = scanner.nextLine();
        // Create Input for employee to enter hours worked this period.
        System.out.print("Please enter hours worked this period: ");
        float hoursWorked = scanner.nextFloat();
        // Input for there base pay rate.
        System.out.print("Please enter base payrate: $ ");
        double payRate = scanner.nextDouble();


        //40 hours is the normal work hours.
        double regularHours = 40;

        //Calculate the basePay for this period. multiply hoursWorked with payRate.
        double basePay = hoursWorked * payRate;

        //overtime + overtimePay
        double overtimeHours = hoursWorked- regularHours;
        double overtimePay = overtimeHours * payRate * 1.5;

        double totalPay;
        //if they worked overtime
        if(hoursWorked >= 40){
            totalPay = basePay + overtimePay;
            System.out.printf("%S worked %.1f hours at a rate of %.2f/hr,and has %.1f hours overtime pay.\nTotal period pay is: $%.2f",name,hoursWorked,payRate,overtimeHours,basePay);

        } else {
            totalPay = basePay;
            System.out.printf("%S worked %.1f hours at a rate of $%.2f/hr.\nTotal period pay is $%.2f.", name, hoursWorked,payRate,basePay);
        }


        //Display the results. You want name, hours worked, and how much they made.

    }
}

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter employee name: ");
        String nameA = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter overtime: ");
        double overTimePay = scanner.nextDouble();

        if (hoursWorked > 40){
            overTimePay *= 1.5;
        }
        else{
            overTimePay = 0;
        }


        double grossPay = hoursWorked * payRate + overTimePay;
        System.out.println(nameA + " pay is $" + grossPay);



    }

}
*/