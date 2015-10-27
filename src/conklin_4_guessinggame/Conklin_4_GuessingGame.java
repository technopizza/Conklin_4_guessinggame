/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conklin_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class Conklin_4_GuessingGame {

    /**
     * @param args the command line arguments
     */
   static void numberGame(Scanner scanner, Random random, int tries){
       int max = 10;
        int answer = random.nextInt(max + 1);
        System.out.println("Welcome to the WORLD FAMOUS NUMBER GUESSING GAME!!!!!");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Welcome, " + name + ", to the WORLD FAMOUS NUMBER GUESSING GAME!!!!!");
        System.out.println("Guess the number between 0 and " + max + ".");
        System.out.println("You have " + tries + " tries to guess it right.");
        int counter = 0;
        while (counter < tries) {
            if(counter >0){
                System.out.println("Try Again!");
            }
            counter++;
            int guess = scanner.nextInt();
            if (guess == answer) {
            System.out.println("You Win!!!!!");
            return;
            }
            else if(guess > answer){
                System.out.println("Oops! You're guess was too high!");
            }
            else if(guess < answer){
                System.out.println("Oops! You're guess was too low!");
            }
            
        }
        System.out.println("You Lose!!!!!");
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        numberGame(scanner, random, 10);
    }
    
}
