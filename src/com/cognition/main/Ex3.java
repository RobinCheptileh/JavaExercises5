package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/10/17.
 * <p>
 * 3. Write a program to accept a float value of a number and return a rounded float value.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter float value");
        System.out.println(Math.round(input.nextFloat()));
    }
}
