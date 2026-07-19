package com.github.designsma.basics;
import java.util.Scanner;

public class App {
    public String getGreeting()
    {
        return "Hello there!";
    }
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in); // read from keyboard

        System.out.println("Hello, World!\nSelect an option!");
        System.out.println("1. IO\n2. Guessing Game");

        int opt = sc.nextInt();
        try {
            switch (opt) {
                case 1:
                    io_func();
                    break;
                case 2:
                    guessing_game(sc);
                    break;
                default:
                    throw new AssertionError("No valid option was introduced.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong. Please run the program again.");
        }

        
    }

    private static void io_func()
    {
        System.out.println("...");
    }

    private static void guessing_game(Scanner sc)
    {
        byte number = (byte) (1+ Math.random()*99); // random number between 1 and 100
        byte tries = 5;

        System.out.println("Guess a number between 1 and 100. You have " + tries + " tries.");

        while (tries>0)
        {
            System.out.println("Guess a number: ");
            byte guess = (byte) sc.nextInt();

            if (guess == number)
            {
                
                System.out.println(
                        "Congratulations! You guessed the correct number.");
                sc.close();
                
                // Exit function if guessed correctly
                return;
            }
            else System.out.println("The number is " + (number > guess ? "higher" : "lower") + " than " + guess);

            --tries;
        }

        // If the user runs out of attempts
        System.out.println(
            "You've exhausted all attempts. The correct number was: "
            + number);
        sc.close();
    }
}