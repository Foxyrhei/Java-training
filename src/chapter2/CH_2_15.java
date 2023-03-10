package chapter2;/*
Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division).
Use the techniques
shown in Fig. 2.7
* */

import java.util.Scanner;

public class CH_2_15 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        int sum = number1 + number2; // add numbers, then store total in sum
        int product = number1 * number2; // product numbers, then store result in product
        int difference = number1 - number2; // difference numbers, then store result in difference
        double division = (double) number1 / number2; // division numbers, then store result in division

        System.out.printf("Sum is %d%n", sum); // display sum
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Division is %.2f%n", division);
    }
}
