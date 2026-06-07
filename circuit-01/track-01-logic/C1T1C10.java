// Circuit 1 | Track 1 | Concept 10 — printf and Final Keyword
// Problem: Build a Formatted Report Printer
// Q: Why does final exist in Java? What problem does it solve?
//    Connect to AI model constants.
// A: final declares constants that never change once assigned.
//    It prevents accidental modification of fixed values.
//    In AI, learning rate and epsilon are final constants
//    that stay fixed throughout training.
// Research Bridge: final constants → Hyperparameters in AI training

class C1T1C10 {
    public static void main(String[] args) {

        final double TAX_RATE   = 0.18;
        final double DISCOUNT   = 0.10;
        final String STORE_NAME = "A.S. Tech Store";

        String product1 = "Java Book";
        double price1   = 500.00;
        int quantity1   = 2;

        String product2 = "Python Course";
        double price2   = 1500.00;
        int quantity2   = 1;

        String product3 = "USB Cable";
        double price3   = 200.00;
        int quantity3   = 3;

        double total1    = price1 * quantity1;
        double total2    = price2 * quantity2;
        double total3    = price3 * quantity3;
        double subTotal  = total1 + total2 + total3;
        double discount  = subTotal * DISCOUNT;
        double tax       = (subTotal - discount) * TAX_RATE;
        double grandTotal = subTotal - discount + tax;

        System.out.println("=".repeat(40));
        System.out.printf("%28s%n", STORE_NAME);
        System.out.println("=".repeat(40));
        System.out.printf("%-20s %8s %5s%n", "Product", "Price", "Qty");
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %8.2f %5d%n", product1, price1, quantity1);
        System.out.printf("%-20s %8.2f %5d%n", product2, price2, quantity2);
        System.out.printf("%-20s %8.2f %5d%n", product3, price3, quantity3);
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %8.2f%n", "Subtotal:",     subTotal);
        System.out.printf("%-20s %8.2f%n", "Discount(10%):", discount);
        System.out.printf("%-20s %8.2f%n", "Tax(18%):",     tax);
        System.out.printf("%-20s %8.2f%n", "Total:",        grandTotal);
        System.out.println("=".repeat(40));
    }
}