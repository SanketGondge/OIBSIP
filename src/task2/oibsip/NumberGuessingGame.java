package task2.oibsip;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int systemNumber = r.nextInt(100) + 1;
        int userNumber = 0;
        int attempt = 0;

        System.out.println("Guess the Number ");
        System.out.println("Enter number between 1 to 100");

        while (userNumber != systemNumber) {

            System.out.print("Enter number: ");
            userNumber = sc.nextInt();
            attempt++;

            if (userNumber > systemNumber)
            {
                System.out.println("Too High");
            }
            else if (userNumber < systemNumber) 
            {
                System.out.println("Too Low");
            }
            else
            {
                System.out.println("Correct Number");
                System.out.println("Total Attempts: " + attempt);
            }
        }

        
    }
}

