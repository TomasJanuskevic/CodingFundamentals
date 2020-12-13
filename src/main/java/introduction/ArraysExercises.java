package introduction;

public class ArraysExercises {
    public static void printSumOfArrayElements(int[] skaiciuMasyvas, int[] kitasSkaiciuMasyvas) {
        int skaiciuSuma = 0;

        for (int skaicius : skaiciuMasyvas) {
            skaiciuSuma += skaicius;
        }
        for (int skaicius : kitasSkaiciuMasyvas) {
            skaiciuSuma += skaicius;
        }
        System.out.println("Masyvu skaiciu suma: " + skaiciuSuma);
    }

    public static void printAverageOfArrays(int[] numbers) {
        int sumOfNumbers = 0;

        for (int number : numbers) {
            sumOfNumbers += number;
        }
        double average = (double)sumOfNumbers/numbers.length;
        System.out.println("Average of arrays's elements: " + average);
    }
}
