import java.util.Scanner;

public class GradingSystem {
    float receiveInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks percentange between (0-100): ");
        float marks = scanner.nextFloat();
        return marks;
    }

    void evaluateMarksAndGrade() {
        float marks = receiveInput();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A (Excellent!)");
        } else if (marks >= 80) {
            System.out.println("Grade: B (Good Job!)");
        } else if (marks >= 70) {
            System.out.println("Grade: C (Fair Effort!)");
        } else if (marks >= 60) {
            System.out.println("Grade: D (Needs Improvement!)");
        } else if (marks >= 0) {
            System.out.println("Grade: F (Failed, Work Harder!)");
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {
        GradingSystem gradingsystem = new GradingSystem();
        gradingsystem.evaluateMarksAndGrade();
    }

}

