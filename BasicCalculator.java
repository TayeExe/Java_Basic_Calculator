/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basiccalculator;

/**
 * Taylor Austin
 * CITP 190
 * 09.19.2026
 * A calculator that can perform basic math operations 
 */
import java.util.Scanner;
public class BasicCalculator {
    

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in); // import scanner
        boolean keepRunning = true; // keeps the program running while true 
        do{
        System.out.println("Hello ! This is a basic Java calculator. Please choose an operation from the following menu:"); // introduction
        //Gets user input for type of math equation and stores it in int operator
        System.out.print("Type 1 for addition (+)\n");
        System.out.print("Type 2 for subtraction (-)\n");
        System.out.print("Type 3 for multiplication (*)\n");
        System.out.print("Type 4 for division (/)\n");
        int operator = scanner.nextInt();
        
            // Gets input for first number and stores it in double firstNumber
          System.out.print("Please enter the first number: ");
          double firstNumber = scanner.nextDouble();
          
          // gets input for second number and stores it in the double secondNumber
          System.out.print("Please enter the second number: "); 
          double secondNumber = scanner.nextDouble();
           // takes the users input for type of calculaton and performs it base on its case in the switch
          switch (operator) {
              case 1:
                double additionNumber = (firstNumber + secondNumber);
                System.out.println("The answer is: " + additionNumber);
                break;
              case 2:
                double subtractionNumber = (firstNumber - secondNumber);
                System.out.println("The answer is: " + subtractionNumber);
                break;
              case 3:
                double multiplicationNumber = (firstNumber * secondNumber);
                System.out.println("The answer is: " + multiplicationNumber);
                break;
              case 4: 
                double divisionNumber = (firstNumber / secondNumber);
                System.out.println("The answer is: " + divisionNumber);
                break;
          }    
            // asks user if they want to continue the program    
           System.out.println("Would you like to continue?");
           System.out.print("Type 'y' to continue and any other button to exit!");
           String continueOrQuit = scanner.next();
           if ("y".equalsIgnoreCase(continueOrQuit)){
               keepRunning = true;
           } else {                 // makes the program continue if the user inputs y
               keepRunning = false;
           }
        } while (keepRunning);  
        
        System.out.println("Goodbye!! Come back soon!"); // end of the program if user presses a button that is not y while in the loop 
                  
          }
    }

