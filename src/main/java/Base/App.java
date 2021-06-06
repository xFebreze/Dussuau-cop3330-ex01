package Base;
import java.util.Scanner;
/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Alek Dussuau


Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.

Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
 */


public class App {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("What is your name? ");
        String name = input.nextLine();

        //Concat
        String output = ("Hello, " + name + ", nice to meet you!");

        //output
        System.out.println(output);
    }
}
