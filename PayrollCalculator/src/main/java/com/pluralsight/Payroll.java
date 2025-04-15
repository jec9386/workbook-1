package com.pluralsight;


import java.util.Scanner;

public class Payroll {

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
