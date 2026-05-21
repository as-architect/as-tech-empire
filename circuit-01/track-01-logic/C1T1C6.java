// Circuit 1 | Track 1 | Concept 6 — While Loop, For Loop, Nested Loops
// Problem: Build a Number Pattern Analyzer
// Q: Why does a for loop initialize, check condition, and update in one line?
//    What problem does this solve compared to while loop?
// A: for loop puts initialization, condition, and update in one line:
//    for(initialization; condition; update) — making loop logic visible at a place, where chances of error is reduced.
//    In while loop, these three are scattered — easy to forget the update
//    and accidentally create an infinite loop.
//    for loop is designed for count-controlled iterations.
//    while loop is designed for condition-controlled iterations.
// Research Bridge: Loops → Gradient Descent iterations in AI training
//                  Each loop = one training step updating model weights

import java.util.Scanner;

class C1T1C6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For loop — multiplication table
        System.out.println("Enter a number for multiplication table: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // While loop — sum until user enters 0
        int n = 1;
        int sum = 0;

        while(n != 0) {
            System.out.println("Enter a number (0 to stop): ");
            n = scanner.nextInt();
            if(n != 0) {
                sum += n;
            }
        }
        System.out.println("Sum: " + sum);

        // Nested loops — star pattern
        System.out.println("Enter number of rows for pattern: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}