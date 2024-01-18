package module01;

import java.util.Scanner;
import java.util.Random;

public class MultiplicationTableExam {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int correct, userInput, score;
    static boolean gameOn = true;

    public static void main(String[] args) {
        System.out.println("Multiplication Exam");

        while (gameOn) {
            for (int i = 0; i < 10; i++) {
                int a = rand.nextInt(10) + 1;
                int b = rand.nextInt(10) + 1;
                System.out.printf("\n%s * %s = ", a, b);
                userInput = Integer.parseInt(scanner.nextLine());
                correct = a * b;
                if (userInput == correct) {
                    System.out.println("Your answer is correct!");
                    score++;
                } else {
                    System.out.println("Your answer is wrong.");
                }

            }
            if (score == 10) {
                System.out.printf("Congratulations your score is %s/10\n--Ending program--", score);
                gameOn = false;
            } else {
                System.out.printf("Your score is not high enough %s/10.\n--Starting over--", score);
            }
        }
    }
}
