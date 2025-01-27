package codesoft;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizAppWithTimer {
    static int timer = 15; // Time limit for each question (seconds)
    static boolean answered = false; // To track if the user has answered within the time limit

    public static void main(String[] args) {
        Scanner asscanner = new Scanner(System.in);
        Question[] questions = {
                new Question("What is the capital of India ?", new String[]{"1. Berlin", "2. Madrid", "3. India", "4. Rome"}, 3),
                new Question("Which planet is known as the Red Planet?", new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}, 2),
                new Question("Who wrote 'Atomic Habit'?", new String[]{"1. Charles Dickens", "2. J.K. Rowling", "3.James Clear ", "4. Leo Tolstoy"}, 3)
        };

        int score = 0;

        System.out.println("Welcome to the Quiz with Timer!");
        System.out.println("--------------------------------");

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            System.out.println((i + 1) + ". " + question.questionText);

            for (String option : question.options) {
                System.out.println(option);
            }

            timer = 15; // Reset the timer for each question
            answered = false; // Reset the answered flag for each question

            Timer countdownTimer = new Timer();
            countdownTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    if (timer > 0) {
                        System.out.print("\rTime left: " + timer + " seconds");
                        timer--;
                    } else {
                        System.out.print("\nTime's up! Moving to the next question.\n");
                        countdownTimer.cancel();
                    }
                }
            }, 0, 1000);

            int userAnswer = -1;
            long startTime = System.currentTimeMillis();

            while ((System.currentTimeMillis() - startTime < 15000) && !answered) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    answered = true;
                    countdownTimer.cancel();
                }
            }

            if (!answered) {
                System.out.println("You did not answer in time!");
            } else if (userAnswer == question.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + question.correctAnswer + ".\n");
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

       /// scanner.close();
    }
}
