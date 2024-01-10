import java.util.Scanner;
public class QuizGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is capital of India?",
                "2. Which planet is known as Red planet?",
                "3. What is the largest mamal on Earth?"
        };

        String[][] options = {
                {"A. Mumbai", "B. Delhi", "C. Banglore", "D. Hydrabad"},
                {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
                {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Polar Bear"}
        };

        String[] correctAnswers = {"B", "B", "B"};

        int score = 0;

        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            for(String option : options[i])
            {
                System.out.println(option);
            }

            System.out.println("Your answer : ");
            String userAnswer = sc.next().toUpperCase();

            if(userAnswer.equals(correctAnswers[i]))
            {
                System.out.println("Correct...!\n");
                score++;
            }
            else
            {
                System.out.println("Incorrect...! The correct answer is : " + correctAnswers[i] + "\n");
            }
        }
        System.out.println("Your final score : " + score + " out of " + questions.length);
    }
}
