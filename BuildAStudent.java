import java.util.Scanner;

public class BuildAStudent {

    public static void main(String[] args) {
        // Ask how many students to add
        System.out.println("Enter number of new students to add: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        // Create n number of new students
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i].toString());
        }

        in.close();
    }

}