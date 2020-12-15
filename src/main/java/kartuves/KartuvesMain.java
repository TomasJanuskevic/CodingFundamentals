package kartuves;

import java.util.Random;
import java.util.Scanner;

public class KartuvesMain {
    public static void main(String[] args) {
        hangMan();
    }

    private static char getUserLetter() {
        Scanner scanner = new Scanner(System.in);
        char letter;
        while (true) {
            System.out.println("Iveskite viena raide");
            String userInput = scanner.nextLine();
            if (userInput.length() == 1) {
                letter = userInput.charAt(0);
                break;
            } else {
                System.out.println("Blogai ivedete");
            }
        }
        return letter;
    }

    private static char[] arrayOfWords() {
        String[] words = {"stalas", "durys", "batas"};
        String guessWord = words[new Random().nextInt(words.length)];
        char[] arrayOfGuessWord = new char[guessWord.length()];
        for (int i = 0; i < guessWord.length(); i++) {
            arrayOfGuessWord[i] = guessWord.charAt(i);
        }
        return arrayOfGuessWord;
    }

    private static char[] patternMaker(int arrayLength) {
        char[] wordPattern = new char[arrayLength];
        for (int i = 0; i < wordPattern.length; i++) {
            wordPattern[i] = '*';
        }
        return wordPattern;
    }

    private static boolean checkInput(char userInput, char[] word) {
        for (char letter : word) {
            if (userInput == letter) {
                return true;
            }
        }
        return false;
    }

    private static char[] changeWordPattern(char userInput, char[] word, char[] wordPattern) {
        for (int i = 0; i < word.length; i++) {
            if (userInput == word[i]) {
                wordPattern[i] = userInput;
            }
        }
        return wordPattern;
    }

    private static boolean checkWord(char[] userWord) {
        for (char letter : userWord) {
            if (letter == '*') {
                return false;
            }
        }
        return true;
    }

    private static void printHangMan(int attempt) {
        switch (attempt) {
            case 4:
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("---");
                break;
            case 3:
                System.out.println(" |-----");
                System.out.println(" |    |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("---");
                break;
            case 2:
                System.out.println(" |-----");
                System.out.println(" |    |");
                System.out.println(" |    0");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("---");
                break;
            case 1:
                System.out.println(" |-----");
                System.out.println(" |    |");
                System.out.println(" |    0");
                System.out.println(" |  --|--");
                System.out.println(" |   ");
                System.out.println("---");
                break;
            case 0:
                System.out.println(" |-----");
                System.out.println(" |    |");
                System.out.println(" |    0");
                System.out.println(" |  --|--");
                System.out.println(" |   /|");
                System.out.println("---");
                break;
        }
    }

    public static void hangMan() {
        char[] word = arrayOfWords();                                       // sukuriam atsitiktinio zodzio array
        char[] wordPattern = patternMaker(word.length);        // sukiriam tokio pat ilgio array patterna su visais '*'

        for (int i = 4; i >= 0; i--) {
            char userInput = getUserLetter();                            // nuskaitom viena raide
            if (checkInput(userInput, word)) {                              // tikrinam ar turime sutapima
                wordPattern = changeWordPattern(userInput, word, wordPattern);  //keiciam patterna
                if (checkWord(wordPattern)) {                                     // tikrinam ar zodzis atspetas)
                    System.out.println("Laimejote, zodis: " + String.valueOf(word));
                    return;
                }
                System.out.println(wordPattern);
                i++;
            } else {
                printHangMan(i);
                System.out.println("Liko bandymu: " + i);
                System.out.println(wordPattern);
            }
        }
        System.out.println("Zaidimas baigtas, teisingas zodis: " + String.valueOf(word));
    }
}

