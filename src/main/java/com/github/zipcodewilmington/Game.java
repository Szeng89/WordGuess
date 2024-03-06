package com.github.zipcodewilmington;

import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Game {
    Scanner

    public void runGame() {}

    //that prints a welcome message
    public void announce_game(){
        System.out.println("Welcome");
    }
    //print game over
    public void game_over(){
        System.out.println("game over");
    }
    //method char[] for secret word
    public void initialize_game_state(){}
    //return a char from player input
    public void get_next_guess(){}
    // return boolean
    public void is_word_guessed(){}
    // returns boolean
    public void ask_to_play_again(){}
    //Use printArray to show play where they are at
    public void print_current_state(){}
    //LOOP through the word array looking for the inputed guess, and replace the "_" with the guesses char if found
    public void process(){}
    //print a happy message
    public void play_won(){
        System.out.println("Yay! congrats you got the word!");
    }
    //print a sad message (){}
    public void player_lost(){
        System.out.println("Better luck next time");
    }

    }
}

