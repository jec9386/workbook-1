package com.pluralsight;


import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Get the known values.
        System.out.print("Please enter the employee name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter hours worked this period: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Please enter base payrate: $ ");
        double payRate = scanner.nextDouble();


        //Calculate the unknown
        double grossPay = hoursWorked * payRate;

        //Display the results
        System.out.printf("%S worked hours at a rate of %f and made $%f",name,hoursWorked,payRate);
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