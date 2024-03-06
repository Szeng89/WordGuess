package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Game {

    public static void runGame() {
        announce_game();
        getsecret_words();

    }

    //that prints a welcome message
    public static void announce_game(){
        System.out.println("Welcome");
    }
    //print game over
    public void game_over(){
        System.out.println("game over");
    }
    //method char[] for secret word
    public static void getsecret_words(){
        //make array for random words
        String[] words= {"cat", "dog", "bog", "cut"};

        //Make random method object
        Random rando = new Random();

        //assigned a random number of the  []length to a int called randomNumber
        int randomNumber = rando.nextInt(words.length);

        // assign that random chosen []length to randomword
        String randomWord = words[randomNumber];

        //print to console randomWord
        System.out.println(randomWord);

    }

    public static void initialize_game_state(){}
    //return a char from player input
    public static void get_next_guess(){}
    // return boolean
    public static void is_word_guessed(){}
    // returns boolean
    public static void ask_to_play_again(){}
    //Use printArray to show play where they are at
    public static void print_current_state(){}
    //LOOP through the word array looking for the inputed guess, and replace the "_" with the guesses char if found
    public static void process(){}
    //print a happy message
    public static void play_won(){
        System.out.println("Yay! congrats you got the word!");
    }
    //print a sad message (){}
    public static void player_lost(){
        System.out.println("Better luck next time");
    }

}
