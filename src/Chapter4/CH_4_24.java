package Chapter4;
/*
(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs.
For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
 */

import java.util.Scanner;

public class CH_4_24 {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            // prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 1) {
                passes = passes + 1;
                studentCounter++;
            }
            if (result == 2) {
                failures = failures + 1;
                studentCounter++;
            }
        }

        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }

}
