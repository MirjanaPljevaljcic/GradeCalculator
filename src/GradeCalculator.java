import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter your grade");
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            }

            if (score <= 100) {
                totalScore += score;
                count++;
            } else {
                System.out.println("Please enter a grade between 0 and 100, enter negative number to stop");
            }
            }
        if (count == 0) {
            System.out.println("No grade entered.");
            return;
        }

        int average = totalScore / count;

        System.out.println("Your average grade is : " + average);

        if (average > 90) {
            System.out.println("Excellent Work!");
        } else if (average > 80) {
            System.out.println("Good Job!");
        } else if (average > 70) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("Lets work hard to get those grades up!");
        }

        scanner.close();

    }
}
