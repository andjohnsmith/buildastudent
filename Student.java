import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses = "";
    private int balance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class year: ");
        this.year = in.nextInt();

        setStudentId();
    }

    private void setStudentId() {
        this.studentId = year + "" + id;
        id++;
    }

    public void enroll() {
        String course;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter course to enroll ('Q' to quit): ");
            course = in.nextLine();
            if (!course.equals("Q")) {
                this.courses = this.courses + "\n  " + course;
                this.balance += courseCost;
            }
        } while (!course.equals("Q"));
    }

    public void viewBalance() {
        System.out.println("Your balance is $" + balance);
    }

    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        balance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentId +
                "\nClass Year: " + year +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + balance;
    }
}