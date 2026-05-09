// Circuit 1 | Track 1 | Concept 2 — Data Types, Limits, Overflow
// Problem: Push every type to its edge
// Q: Why can't int store 9.99 — size problem or storage format problem?
// A: Storage format problem. int uses pure binary for whole numbers.
//    It has no slot to store a floating decimal point.
//    9.99 arriving into int means .99 has nowhere to live — Java refuses entirely.
// Research Bridge: Integer overflow → Gradient explosion in AI training

class C1T1C2 {
    public static void main(String[] args) {
        int x = 9999999;
        double y = 9.9;
        boolean z = true;
        char c = 'x';

        System.out.println("int=" + x + ", double=" + y + ", boolean=" + z + ", char=" + c);

        // Pushing int to its actual limit
        System.out.println("Max int value: " + Integer.MAX_VALUE);       // 2147483647
        System.out.println("Overflow result: " + (Integer.MAX_VALUE + 1)); // -2147483648
        System.out.println("Min int value: " + Integer.MIN_VALUE);       // -2147483648

        // int i = 9.99; → error: incompatible types
        // decimal literal defaults to double, cannot fit into int's binary format
    }
}
