// Circuit 1 | Track 1 | Concept 7 — Arrays and 2D Arrays
// Problem: Build a Student Grade Analyzer
// Q: An array stores multiple values in contiguous memory locations.
//    What does "contiguous" mean and why does it matter for performance?
// A: Contiguous means elements occupy consecutive RAM addresses with no gaps.
//    int array at address 100 → next at 104 → next at 108 (4 bytes each).
//    Performance benefit: CPU cache loads nearby addresses automatically.
//    When CPU reads arr[0], it automatically loads
//    nearby addresses into cache too (cache line = 64 bytes).
//    So arr[1] to arr[15] are already in cache — free reads.
//    Non-contiguous structures (LinkedList) cause cache misses — slower.
//    Arrays win for iteration-heavy tasks because of cache locality.
// Research Bridge: Arrays → Tensors in AI (contiguous memory = fast GPU computation)
//                  2D Arrays → Weight matrices in neural networks

class C1T1C7 {
    public static void main(String[] args) {

        // 1D Array — student marks
        int[] marks = {85, 90, 78, 92, 88};

        int max = marks[0];
        int min = marks[0];
        int sum = 0;

        for(int i = 0; i < marks.length; i++) {
            if(marks[i] > max) max = marks[i];
            if(marks[i] < min) min = marks[i];
            sum += marks[i];
        }

        double avg = (double) sum / marks.length;

        System.out.println("Marks:");
        for(int i = 0; i < marks.length; i++) {
            System.out.println("  Student " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);

        // 2D Array — 3 students, 3 subjects
        String[][] records = {
            {"Oggy", "Maths", "Science", "English"},
            {"Jack", "Maths", "Science", "English"},
            {"Bob",  "Maths", "Science", "English"}
        };

        int[][] grades = {
            {90, 78, 92},
            {82, 91, 89},
            {85, 87, 90}
        };

        System.out.println("\nStudent Records:");
        for(int i = 0; i < records.length; i++) {
            System.out.print("  " + records[i][0] + ": ");
            for(int j = 1; j < records[i].length; j++) {
                System.out.print(records[i][j] + "-" + grades[i][j-1] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nTotal Marks:");
        for(int i = 0; i < grades.length; i++) {
            int total = 0;
            for(int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            System.out.println("  " + records[i][0] + ": " + total);
        }
    }
}