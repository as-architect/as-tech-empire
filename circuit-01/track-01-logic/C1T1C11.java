// Circuit 1 | Track 1 | Concept 11 - Static keyword
// Problem: Build a Student Counter System
// Q: Why is static stored differently in memory?
//    Which memory area holds static variables?
//    Connect to Concept 1.
// // A: Static variables are stored in Method Area (part of heap).
//    They belong to the class, not objects.
//    Like Concept 1 — one fixed RAM location for whole program.
class C1T1C11 {
    static int totalStudents = 0;
    static String schoolName = "A.S. Tech Academy";
    static double totalFees = 0.0;
    
    static void addStudent(String name, double fee) {
        totalStudents++;
        totalFees += fee;    }

    static void printReport() {
        System.out.println("School: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
        System.out.printf("Total Fees Collected: %.2f%n", totalFees);
        System.out.printf("Average Fees: %.2f%n", totalStudents > 0 ? totalFees / totalStudents : 0.0);
    }
    public static void main(String[] args) {
        addStudent("Alice", 1800.00);
        addStudent("Bob", 1700.00);
        addStudent("Charlie", 2000.00);

        printReport();
    }
}