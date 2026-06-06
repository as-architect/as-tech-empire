// Circuit 1 | Track 1 | Concept 8 — ArrayList, 2D ArrayList, For-each Loop
// Problem: Build a Dynamic Student Registry
// Q: ArrayList internally uses an array. When full, what happens?
//    Where does new data go? What is the performance cost?
// A: // A: When ArrayList's internal array gets full,
//    it creates a new array of 1.5x size.
//    All old elements are copied to new array.
//    Old array is deleted by garbage collector.
//    This copying makes it slow for a moment.
//    To avoid this: new ArrayList<>(100)
//    pre-decide the size if you know it.
// Research Bridge: ArrayList resizing → Dynamic memory allocation in AI
//                  Tensor reshape operations in PyTorch — same copy cost

import java.util.ArrayList;

class C1T1C8 {
    public static void main(String[] args) {

        // ArrayList of students
        ArrayList<String> students = new ArrayList<>();
        students.add("Oggy");
        students.add("Jack");
        students.add("Bob");
        students.add("Alice");
        students.add("Eve");

        // Remove by name
        students.remove("Bob");

        System.out.println("Students:");
        for(String student : students) {
            System.out.println("  " + student);
        }

        // 2D ArrayList — 4 students, 3 subjects each
        ArrayList<ArrayList<Integer>> marks = new ArrayList<>();

        marks.add(new ArrayList<>());
        marks.get(0).add(90); marks.get(0).add(78); marks.get(0).add(92);

        marks.add(new ArrayList<>());
        marks.get(1).add(82); marks.get(1).add(91); marks.get(1).add(89);

        marks.add(new ArrayList<>());
        marks.get(2).add(85); marks.get(2).add(87); marks.get(2).add(90);

        marks.add(new ArrayList<>());
        marks.get(3).add(88); marks.get(3).add(94); marks.get(3).add(76);

        // Print marks and find top student
        String topStudent = "";
        int highestAvg = 0;

        System.out.println("\nMarks:");
        for(int i = 0; i < students.size(); i++) {
            System.out.print("  " + students.get(i) + ": ");
            int sum = 0;
            for(int mark : marks.get(i)) {
                System.out.print(mark + "  ");
                sum += mark;
            }
            int avg = sum / marks.get(i).size();
            System.out.println("| Avg: " + avg);

            if(avg > highestAvg) {
                highestAvg = avg;
                topStudent = students.get(i);
            }
        }

        System.out.println("\nTop Student: " + topStudent + " — Avg: " + highestAvg);
    }
}