package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Wordguess {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Wordguess run = new Wordguess(); // Create instance of WordGuess game and start it
        run.runGame();
    }

    private void runGame() {
        List<String> wordList = getRandomWords(10); // generate list of random words
        System.out.println("Hi lets play WordGuess");

        while (true) {
            String secretWord = getRandomWord(wordList); // get random word from arraylist as secret word
            StringBuilder sb = new StringBuilder("_".repeat(secretWord.length())); // uses _ to shows whats revealed
            int numberOfGuessesLeft = secretWord.length(); // set number of guess left to length of word

            while (numberOfGuessesLeft > 0) {
                System.out.println("Currently Revealed: " +sb); // display whats revealed and guesses left
                System.out.println("Number of guesses left: " + numberOfGuessesLeft);
                char guess = getNextGuess();

                if (secretWord.indexOf(guess) != -1) { //check if guessed charact is in secret word
                    for (int i = 0; i < secretWord.length(); i++) {
                        if (secretWord.charAt(i) == guess) { // if guess is right sets to shows in word
                            sb.setCharAt(i, guess);
                        }
                    }
                }
                if (secretWord.equals(sb.toString())) { // check to see if entire word is guessed
                    playerWon();
                    break;
                }

                numberOfGuessesLeft--; // decrease guesses left
            }
            if (numberOfGuessesLeft == 0) { // if not more guesses player lost
                playerLost();
            }

            if (!askToPlayAgain()) {
                break;
            }
        }
    }

    public String getRandomWord(List<String> words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.size()); // get a random index from within the range of word list
        return words.get(randomIndex);
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

    public List<String> getRandomWords(int word){ // not positive why i need a unused var in parameter
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
                return randomWords;

    }



}