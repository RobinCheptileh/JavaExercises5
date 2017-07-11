package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/10/17.
 *
 * 1. Write a program to check whether a number is a cube or not.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer");
        int n = input.nextInt();
        if(isCube(n))
            System.out.println("Cube");
        else
            System.out.println("Not cube");
    }

    private static boolean isCube(int n) {
        return Math.pow((int) Math.cbrt(n), 3) == n;
    }
}
