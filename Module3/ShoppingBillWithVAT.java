import java.util.Scanner;

public class ShoppingBillWithVAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double productPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = productPrice * quantity;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal);
        System.out.println("VAT: PHP " + vat);
        System.out.println("Total: PHP " + total);

        input.close();
    }
}
