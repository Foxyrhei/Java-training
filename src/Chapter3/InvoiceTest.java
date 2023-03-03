package Chapter3;
/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance variables—
a part number (type String),
a part description (type String),
a quantity of the item being purchased (type int) and
a price per item (double).

Your class should have a constructor that initializes the four instance variables.
Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should
 be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
 */

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//    Double InvoiceAmount;

        System.out.println("Enter part number: "); // prompt
        String partnumber = input.next(); // obtain user input

        System.out.println("Enter part description: "); // prompt
        String description = input.next(); // obtain user input

        System.out.println("Enter quantity: "); // prompt
        Integer quantity = input.nextInt(); // obtain user input

        System.out.println("Enter Price per item: "); // prompt
        Double price = input.nextDouble(); // obtain user input

        Invoice testInvoice = new Invoice(partnumber, description, quantity, price);

        System.out.println(testInvoice.getInvoiceAmount());

        testInvoice.setQuantity(10);
        System.out.println(testInvoice.getInvoiceAmount());

        System.out.println(testInvoice.getQuantity() * testInvoice.getPrice());
    }
}
