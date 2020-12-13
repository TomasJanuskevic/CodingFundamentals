package introduction;

public class DataTypesExercises {
    public static void printSum(int firstNumber, int secondNumber, int thirdNumber) {
        int suma = firstNumber + secondNumber + thirdNumber;
        System.out.printf("%d + %d + %d = %d", firstNumber, secondNumber, thirdNumber, suma);
    }

    public static void printDivision(int skaicius, int skaiciusIsKurioDalinam) {
        //gaunama sveika dalis
        int dalybosRezultatas = skaicius / skaiciusIsKurioDalinam;

        //gaunama liekana
        int liekana = skaicius % skaiciusIsKurioDalinam;

        System.out.printf("%d / %d = %d (liekana %d)", skaicius,
                skaiciusIsKurioDalinam, dalybosRezultatas, liekana);
    }

    public static void printCircleAreaAndPerimeter(double spindulys) {
        double plotas = Math.PI * Math.pow(spindulys, 2);
        double perimetras = 2 * Math.PI * spindulys;

        System.out.printf("Apskritimo spindulys %.2f,  plotas %.2f", spindulys, plotas);
        System.out.println();
        System.out.printf("Apskritimo perimetras %.2f\n", perimetras);
    }

    public static void printNumbersAverage(int firstNumber, int secondNumber, int thirdNumber) {
        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.printf("Average (%d + %d + %d) = %d", firstNumber, secondNumber,
                thirdNumber, average);
    }

    public static void printSumDIgits(int givenNumber) {
        int originalNumber = givenNumber;
        int sumDigits = 0;

        while (givenNumber > 0) {
            sumDigits = sumDigits + givenNumber % 10;
            givenNumber /= 10;
        }
        System.out.printf("Sum of given number %d digits is: %d\n", originalNumber, sumDigits);
    }

    public static void convertMeters(double inches, double feet, double miles, double yards) {
        double inchesToMeters = inches * 0.0254;
        double feetToMeters = feet * 0.3048;
        double milesToMeters = miles * 1609;
        double yardsToMeters = yards * 0.914;

        System.out.printf(inches + " inches is %.3f meters \n", inchesToMeters);
        System.out.printf(feet + " feets is %.3f meters \n", feetToMeters);
        System.out.printf(miles + " miles is %.3f meters \n", milesToMeters);
        System.out.printf(yards + " yards is %.3f meters \n", yardsToMeters);
    }

}
