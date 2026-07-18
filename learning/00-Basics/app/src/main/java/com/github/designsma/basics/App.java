package com.github.designsma.basics;
import java.util.Scanner;
import java.io.BufferedReader;

public class App {
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in); // read from keyboard

        System.out.println("Hello, World!\nSelect an option!");
        System.out.println("1. IO\n2. Other");

        int opt = sc.nextInt();
        sc.close();

        switch (opt) {
            case 1:
                io_func();
                break;
            case 2:
                break;
            default:
                throw new AssertionError("No valid option was introduced.");
        }

        
    }

    private static void io_func()
    {
        System.out.println("...");
    }
}