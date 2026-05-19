// Circuit 1 | Track 1 | Concept 4 — Switches and Logical Operators
// Problem: Build a Simple Calculator Menu
// Q: How does switch work internally? Is it faster than if-else? Why?
// A: Switch builds a jump table at compile time for integer types.
//    Instead of checking each condition sequentially like if-else,
//    it jumps directly to the matching case using the value as an index.
//    For String types, it uses hashCode() to jump, then equals() to confirm.
//    This makes switch faster than if-else for fixed value comparisons.
// Research Bridge: Switch jump table → Neural network routing mechanisms
//                  (Mixture of Experts — each expert is a "case")

import java.util.Scanner;

class C1T1C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = sc.nextInt();

        System.out.println("Enter the second number: ");
        int y = sc.nextInt();

        System.out.println("---- Operations ----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            // Simple switch syntax (classic):
            // case 1: System.out.println(x+"+"+y+"="+(x+y)); break;

            // Enhanced switch syntax (Java 14+):
            case 1 -> System.out.println(x + " + " + y + " = " + (x + y));
            case 2 -> System.out.println(x + " - " + y + " = " + (x - y));
            case 3 -> System.out.println(x + " * " + y + " = " + (x * y));
            case 4 -> {
                if(y != 0) {
                    System.out.println(x + " / " + y + " = " + ((double)x / y));
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }
            default -> System.out.println("Invalid option");
        }
        sc.close();
    }
}
