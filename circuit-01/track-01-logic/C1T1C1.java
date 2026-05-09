// Circuit 1 | Track 1 | Concept 1 — Variables and Memory
// Problem: Your First Memory Box
// Q: Where does a program store your name? What does "memory" mean for a computer?
// A: Variables are stored in RAM while the program runs.
//    RAM is fast and temporary — cleared when program ends.
//    CPU processes the data but does not store variables.

class C1T1C1 {
    public static void main(String[] args) {
        String name = "A.S.";
        int age = 20;
        String city = "Ahmedabad";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I am from " + city + ".");

        int futureAge = age + 10;
        System.out.println("I will be " + futureAge + " years old in 10 years.");
    }
}
