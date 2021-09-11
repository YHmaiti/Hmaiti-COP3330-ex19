/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program calculates the body mass index (BMI)
// for a person using the person’s height in inches and weight in pounds.
// The program prompts the user for weight and height.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // variables declaration
        Double height = 0.0;
        Double weight = 0.0;
        Double BMI = 0.0;
        String string; // string will be sued to help in the scanning of input from the user
        Boolean numerical = false;

        // check if the value of the weight entered is numerical or not
        // after scanning it within the loop
        while(numerical == false){

            System.out.print("What is your weight in pounds (numerical value only)? ");
            string = scanner.nextLine();
            numerical = true;

            try {

                weight = Double.parseDouble(string);

            } catch (NumberFormatException ex) {

                numerical = false;

            }

        }

        numerical = false;

        // check if the value of the height entered is numerical or not
        // after scanning it within the loop
        while (numerical == false){

            System.out.print("What is your height in inches (numerical value only)? ");
            string = scanner.nextLine();
            numerical = true;

            try {

                height = Double.parseDouble(string);

            } catch (NumberFormatException ex) {

                numerical = false;

            }


        }

        // eqaution to calculate the BMI
        BMI = (weight / (height * height)) * 703;

        // output the BMI as described by the assignment
        System.out.printf("Your BMI is %.1f.\n", BMI);

        // output the corresponding message depending on the BMI value calculated
        if (BMI <= 25 && BMI >= 18.5) {

            System.out.print("You are within the ideal weight range.");

        } else if (BMI > 25){

            System.out.print("You are overweight. You should see your doctor.");

        } else if (BMI < 18.5) {

            System.out.print("You are underweight. You should see your doctor.");

        }

    }

}