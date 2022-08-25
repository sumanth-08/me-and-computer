package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int computerNumber = (int)(Math.random()*100);
        int number;
        int guess = 1;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number between 1 to 100");
            number = scanner.nextInt();

            if (number > computerNumber){
                System.out.println("Select the smaller number");
            }else if (number < computerNumber){
                System.out.println("Select the larger number");
            }else{
                System.out.println("You go it..! Number of guesses is " + guess);
            }

            guess++;

        }while(number != computerNumber);

    }
}
