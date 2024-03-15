package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Wordguess {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Wordguess run = new Wordguess();
        run.runGame();
    }

    private void runGame() {

    }

    public String getRandomWord(List<String> words) {
        Random random = new Random():
    }

    public char getNextGuess() {
        System.out.println("Enter a letter: ");
        return scanner.next().charAt(0);

    }

    public boolean askToPlayAgain() {
        while (true) {
            System.out.println("Play again? (yes/no)");
            String userInput = scanner.next();

            if (userInput.equals("yes")) {
                return true;
            }else if (userInput.equals("no")) {
                return false;
            }else {
                System.out.println("Invalid input, Please enter yes or no");
            }
        }
    }

    public void playerWon() {
        System.out.println("Wow! you did it! you win!!");

    }

    public void playerLost() {
        System.out.println("Sorry, Maybe next time");

    }

    public List<String> getRandomWords(){
        List<String> randomWords = new ArrayList<>();
        randomWords.add("cat");
        randomWords.add("dog");
        randomWords.add("Bird");
        randomWords.add("moon");
        randomWords.add("apple");
        randomWords.add("beach");
        randomWords.add("banana");
        randomWords.add("garden");
        randomWords.add("library");
        randomWords.add("monster");
                

    }



}