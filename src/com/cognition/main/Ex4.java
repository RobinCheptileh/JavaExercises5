package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/10/17.
 * <p>
 * 4. Write a program to check if a number is Armstrong or not. A number is Armstrong if the sum of the cubes of the digits
 * of the number is equal to the number.
 * Example: 407 = (4*4*4) + (0*0*0) + (7*7*7)
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if (isArmstrong(number))
            System.out.println("Is Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    /**
     * @param number
     * The number to check if it is a substring
     * @return
     * Returns true if the number is Armstrong and false if not
     *
     * This method converts the number to a string and in turn the string to a character array,
     * it then loops through the  character array converting each element to an integer, cubes it and add the cube to
     * sum. It then compares the sum to the number, it is Armstrong if they are equal.
     */
    private static boolean isArmstrong(int number) {
        char[] numbers = Integer.toString(number).toCharArray();
        int sum = 0;
        for (char c : numbers)
            sum += Math.pow(Integer.parseInt(Character.toString(c)), 3);
        return sum == number;
    }

    /**
     * @param number
     * The number to check if it is a substring
     * @return
     * Returns true if the number is Armstrong and false if not
     *
     * This method converts the number to a string,
     * it then loops through the string converting each substring to an integer, cubes it and add the cube to
     * sum. It then compares the sum to the number, it is Armstrong if they are equal.
     */
    /*private static boolean isArmstrong(int number) {
        String numbers = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++)
            sum += Math.pow(Integer.parseInt(numbers.substring(i, i + 1)), 3);
        return sum == number;
    }*/

    /**
     * @param number
     * The number to check if it is a substring
     * @return
     * Returns true if the number is Armstrong and false if not
     *
     * This method converts the number to a string,
     * it then loops through the string converting each character to an integer, cubes it and add the cube to
     * sum. It then compares the sum to the number, it is Armstrong if they are equal.
     */
    /*private static boolean isArmstrong(int number) {
        String numbers = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++)
            sum += Math.pow(Integer.parseInt(Character.toString(numbers.charAt(i))), 3);
        return sum == number;
    }*/
}
