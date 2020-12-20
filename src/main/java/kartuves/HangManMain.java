package kartuves;

import java.util.Arrays;
import java.util.Scanner;

public class HangManMain {
    public static void main(String[] args) {
        hangMan();
    }

    private static char getUserLetter() {
        Scanner scanner = new Scanner(System.in);
        char letter;
        while (true) {
            System.out.println("Iveskite viena raide");
            String userInput = scanner.nextLine();
            if (userInput.length() == 1 && userInput.substring(0, 1).matches("[a-zA-Z]")) {
                letter = userInput.toUpperCase().charAt(0);
                break;
            } else {
                System.out.println("Blogai ivedete, ivskite viena raide");
            }
        }
        return letter;
    }

    private static boolean checkInput(char userInput, char[] word) {
        for (char letter : word) {
            if (userInput == letter) {
                return true;
            }
        }
        return false;
    }

    private static void changeWordPattern(char userInput, char[] word, char[] wordPattern) {
        for (int i = 0; i < word.length; i++) {
            if (userInput == word[i]) {
                wordPattern[i] = userInput;
            }
        }
    }

    private static boolean checkWord(char[] wordPattern) {
        for (char letter : wordPattern) {
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
                System.out.println(" |   / \\");
                System.out.println("---");
                break;
        }
    }

    public static void hangMan() {
        char[] word = Words.getRandomWord().toCharArray();             // sukuriam atsitiktinio zodzio array
        char[] wordPattern = new char[word.length];        // sukiriam tokio pat ilgio array patterna su visais '*'
        Arrays.fill(wordPattern, '*');

        System.out.println("Sveiki, spekite zodi irasydami po viena raide,\nGalite suklysti 5 kartus");
        System.out.println("Zodis turi " + wordPattern.length + " raidziu");
        System.out.println(wordPattern);
        System.out.println("-----------------------------------------------------");

        for (int i = 4; i >= 0; i--) {
            char userInput = getUserLetter();                            // nuskaitom viena raide
            if (checkInput(userInput, word)) {                              // tikrinam ar turime sutapima
                changeWordPattern(userInput, word, wordPattern);  //keiciam patterna
                if (checkWord(wordPattern)) {                                     // tikrinam ar zodzis atspetas)
                    System.out.println("Laimejote, zodis: " + String.valueOf(word));
                    return;
                }
                System.out.println(wordPattern);
                i++;
            } else {
                printHangMan(i);
                System.out.println("Neteisingas spejimas");
                System.out.println("Liko bandymu: " + i);
                System.out.println(wordPattern);
                System.out.println("==============================================");
            }
        }
        System.out.println("Zaidimas baigtas, teisingas zodis: " + String.valueOf(word));
    }
}

