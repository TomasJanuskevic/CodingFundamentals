package introduction;

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
        System.out.printf("Factorial of %d is: %d \n", givenNumber,factorial);
    }
}
