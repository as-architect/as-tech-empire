// Circuit 1 | Track 1 | Concept 5 — Math Class and Random Numbers
// Problem: Build a Smart Random Number Game
// Q: Why does Math.random() return 0.0 to 0.999 and never exactly 1.0?
// A: Math.random() uses IEEE 754 double format internally.
//    The algorithm is designed to return values in range [0.0, 1.0)
//    meaning 0 is included but 1 is excluded by design.
//    Even if floating point could represent 1.0 exactly,
//    the algorithm never produces it — same precision boundary
//    we saw in Concept 2 with 0.1 + 0.2 = 0.30000000000000004.
// Research Bridge: Random number generation → Weight initialization in neural networks
//                  AI models initialize weights randomly before training begins

class C1T1C5 {
    public static void main(String[] args) {

        // Random number between 1 and 100
        int n = (int)(Math.random() * 100) + 1;
        System.out.println("Random number (1-100): " + n);

        // Math class operations
        System.out.println("Square root: " + Math.sqrt(n));
        System.out.println("Power of 2:  " + Math.pow(n, 2));
        System.out.println("Abs(n - 50): " + Math.abs(n - 50));
        System.out.println("Rounded:     " + Math.round(n));
        System.out.println("Max(n, 50):  " + Math.max(n, 50));

        // Second random number between 1 and n
        int n2 = (int)(Math.random() * n) + 1;
        System.out.println("\nSecond random number (1-" + n + "): " + n2);

        // Operations between both the random numbers
        System.out.println("Sum:        " + (n + n2));
        System.out.println("Difference: " + Math.abs(n - n2));
        System.out.println("Product:    " + (n * n2));
    }
}