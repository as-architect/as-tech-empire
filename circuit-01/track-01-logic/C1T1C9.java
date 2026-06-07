// Circuit 1 | Track 1 | Concept 9 — Methods and Overloaded Methods
// Problem: Build a Smart Utility Library
// Q: Why do methods exist? What would code look like without them?
//    Connect to how AI models use modular components.
// A: Methods allow us to reuse code blocks without repeating them.
//    Without methods, same code would be written again and again.
//    In AI, each layer like attention, feed-forward is a reusable
//    method called at every transformer block — same idea.
// Research Bridge: Methods → Transformer layers in AI models

class C1T1C9 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + " is even? " + isEven(num));
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        System.out.println(num + " is prime? " + isPrime(num));

        double celsius = 25.0;
        System.out.println(celsius + "°C in Fahrenheit is: " + celsiusToFahrenheit(celsius));

        int[] intArr = {3, 7, 2, 9, 5};
        for(int n : intArr) {
            System.out.print(n + "  ");
        }       
        System.out.println();
        System.out.println("Max in int array: " + findMax(intArr));

        double[] doubleArr = {3.5, 7.2, 2.8, 9.1, 5.6};
        for(double n : doubleArr) {
            System.out.print(n + "  ");
        }       
        System.out.println();
        System.out.println("Max in double array: " + findMax(doubleArr));
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static long factorial(int n) {
        if(n == 1 ) 
            return 1;
        else
            return n * factorial(n - 1);
    }

    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}