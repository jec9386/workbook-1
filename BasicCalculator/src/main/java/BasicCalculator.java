import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: " );
        float firstNumber = input.nextFloat();

        System.out.println("Enter the second number: " );
        float secondNumber = input.nextFloat();


        float product = firstNumber * secondNumber;



        System.out.println("Possible calculations:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide");
        System.out.println("Please select an option: M");
        System.out.println(firstNumber + " * " + secondNumber + "= " + product);

    }
}
