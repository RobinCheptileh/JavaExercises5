package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/10/17.
 * <p>
 * Main Class
 */
public class Main {
    public static void main(String[] args) {
        choose();
    }

    private static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a question:" +
                "\n\t1. Write a program to check whether a number is a cube or not." +
                "\n\t2. Write a method to check whether a string is a valid password. Password rules:" +
                "\n\t\t- Contain at least 10 characters." +
                "\n\t\t- Consist of only letters and digits." +
                "\n\t\t- Contain at least 2 digits." +
                "\n\t3. Write a program to accept a float value of a number and return a rounded float value." +
                "\n\t4. Write a program to check if a number is Armstrong or not. A number is Armstrong if the sum of " +
                "the cubes of the digits of the number is equal to the number." +
                "\n\t\tExample: 407 = (4*4*4) + (0*0*0) + (7*7*7)" +
                "\n\t5. Exit");
        int action = input.nextInt();

        switch (action) {
            case 1:
                Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
                Ex3.main(null);
                break;

            case 4:
                Ex4.main(null);
                break;

            case 5:
                System.out.println("\n\tBye!");
                break;

            default:
                System.out.println("Invalid choice");
                choose();
                break;
        }
    }
}
