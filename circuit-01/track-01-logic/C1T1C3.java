// Circuit 1 | Track 1 | Concept 3 — Expressions and Conditions
// Problem: Build a Number Analyzer
// Q: When Scanner takes user input, where does the value go — Stack or Heap?
// A: int n goes to Stack (primitive value stored directly)
//    Scanner sc object goes to Heap
//    sc variable on Stack stores only the address of Scanner object in Heap
//    User's typed value is read by Scanner, converted to int, stored on Stack

import java.util.Scanner;

class C1T1C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println(n + " is positive");
        } else if(n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is zero");
        }

        if(n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        if(n > 100) {
            System.out.println(n + " is greater than 100");
        } else if(n < 100) {
            System.out.println(n + " is less than 100");
        } else {
            System.out.println(n + " is equal to 100");
        }

        int ir = n / 3;
        double dr = (double) n / 3;
        double difference = dr - ir;

        System.out.println("int result of " + n + "/3 = " + ir);
        System.out.println("double result of " + n + "/3 = " + dr);
        System.out.println("Difference = " + difference);
    }
}
