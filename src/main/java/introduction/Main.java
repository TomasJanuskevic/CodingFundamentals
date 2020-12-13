package introduction;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------String exercises-------------");
        //paduodame argumentus
        StringExercises.printHelloName("Darius", "Darinskas", 20);
        System.out.println("***************************");
        StringExercises.printStringPattern();
        System.out.println("***************************");
        StringExercises.printLowerCase("LABAS");
        System.out.println("***************************");
        StringExercises.checkUserName("BlackKnight");
        StringExercises.checkUserName("Tom");
        System.out.println("***************************");
        StringExercises.printReversedString("labadiena");
        System.out.println("***************************");
        StringExercises.printReversedString("Hello");
        System.out.println("***************************");
        StringExercises.printHalfOfString("Labas kaip sekasi?");
        System.out.println("***************************");
        StringExercises.printWordWithutFirstLetter("Hello");
        System.out.println("***************************");
        StringExercises.compareTwoStrings("Labas", "labas");
        StringExercises.compareTwoStrings("HI", "Hello");
        System.out.println("***************************");
        StringExercises.printSymbolCount("Stalas kede2??");
        System.out.println("***************************");


        System.out.println();
        System.out.println();
        System.out.println("--------------Data type exercise--------------");

        DataTypesExercises.printSum(4, 6, 2);
        System.out.println();
        System.out.println("***************************");
        DataTypesExercises.printDivision(5, 3);
        System.out.println();
        System.out.println("***************************");
        DataTypesExercises.printCircleAreaAndPerimeter(6);
        System.out.println("***************************");
        DataTypesExercises.printSumDIgits(123);
        System.out.println("***************************");
        DataTypesExercises.convertMeters(456, 45, 45, 45);
        System.out.println("***************************");


        System.out.println();
        System.out.println();
        System.out.println("--------------Loops exercise--------------");

        LoopsExercises.printMultiplicationTable(2);
        System.out.println();
        System.out.println("***************************");
        LoopsExercises.printEvenNumbers(20);
        System.out.println("***************************");
        LoopsExercises.printFactorial(10);
        //test

    }
}
