package introduction;

import java.util.Scanner;

public class LoopsExercises {
    public static void printMultiplicationTable(int number) {
        System.out.printf("Number %d multiplication table: ", number);

        for (int skaicius = 1; skaicius <= 10; skaicius++) {
            System.out.print((number * skaicius) + ", ");
        }
    }

    public static void printEvenNumbers(int riba) {
        System.out.printf("Even number up to %d: ", riba);

        for (int skaicius = 1; skaicius <= riba; skaicius++) {
            if (skaicius % 2 == 0) {
                System.out.print(skaicius + ", ");
            }
        }
    }

    public static void printFactorial(int givenNumber) {
        int factorial = 1;

        for (int i = 1; i <= givenNumber; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d is: %d \n", givenNumber, factorial);
    }

    //jai dalinasi is 5 - fizz
    //jai is 7 - buzz
    //jai is 5 ir7 - fizzBuzz
    //jai nesidalina - atspausdinam skaiciu
    public static void fizzBuzz(int number) {
        //sukurti cikla, begti per visus skaicius
        for (int skaicius = 0; skaicius <= number; skaicius++) {
            if (skaicius % 5 == 0 && skaicius % 7 == 0) {
                System.out.println("fizzBuzz " + skaicius);
            } else if (skaicius % 7 == 0) {
                System.out.println("buzz " + skaicius);
            } else if (skaicius % 5 == 0) {
                System.out.println("fizz " + skaicius);
            } else {
                System.out.println(skaicius + " nesidalina nei is 5 nei is 7");
            }
        }
    }

    public static void scannerLoopTest() {
        Scanner scanner = new Scanner(System.in);



        String temp = "";
        while (!temp.equalsIgnoreCase("stop")) {
            System.out.println("Iveskite teksta: ");
            String userInput = scanner.nextLine();
            System.out.println("Jus ivedete teksta - " + userInput);
            System.out.println("Noredami baigti programa veskite stop");
            temp = scanner.nextLine();
        }
        System.out.println("Pabaiga");

    }
}
