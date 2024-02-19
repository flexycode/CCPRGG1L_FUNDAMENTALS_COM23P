// import the Scanner class
import java.util.Scanner;

public class StudentGradeCalculator {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        calculateGrade();
    }

    static void calculateGrade() {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your midterm score: ");
        double midtermScore = scan.nextDouble();

        System.out.print("Enter your final exam score: ");
        double finalExamScore = scan.nextDouble();

        double averageScore = (midtermScore + finalExamScore) / 2;

        String grade;

        if (averageScore >= 90) {
            grade = "A";
        } else if (averageScore >= 80) {
            grade = "B";
        } else if (averageScore >= 70) {
            grade = "C";
        } else if (averageScore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Hello, " + name + "!");
        System.out.println("Your average score is: " + averageScore);
        System.out.println("Your grade is: " + grade);

        scan.close();
    }
}
