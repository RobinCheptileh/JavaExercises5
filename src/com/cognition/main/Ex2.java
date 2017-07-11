package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/10/17.
 * <p>
 * 2. Write a method to check whether a string is a valid password.
 * RULES:  - Contain at least 10 characters.
*          - Consist of only letters and digits.
*          - Contain at least 2 digits.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        String password = input.next();
        if (isValidPassword(password))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private static boolean isValidPassword(String password) {
        char[] letters = password.toCharArray();
        int digit_count = 0;
        for (char c : letters)
            if (!Character.isLetterOrDigit(c))
                return false;
            else if (Character.isDigit(c))
                digit_count++;
        return password.length() >= 10 && digit_count >= 2;
    }
}
