package objects;

import java.util.Scanner;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        System.out.println("Roboto vardas - " + robot.name + " Roboto svoris  - " + robot.weight +
                " Roboto spalva  - " + robot.color);

        Robot anotherRobot = new Robot("Yellow", "Jerry", 67);
        System.out.println(anotherRobot);

        Animal animal = new Animal();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pasirinkite gyvuna [1, 2, 3] ");
            int pasirinkimas = scanner.nextInt();

            if (pasirinkimas == 1) {
                Cat cat = new Cat();
                cat.spinAround();
                cat.makeSound();
                cat.jump();
                cat.meow();
            } else if (pasirinkimas == 2) {
                Dog dog = new Dog();
                dog.jump();
                dog.bark();
            } else if (pasirinkimas == 3) {
                Elephant elephant = new Elephant();
                elephant.makeElephantSound();
                elephant.spinAround();
            } else {
                System.out.println("Tokio gyvuno nera");
                break;
            }
        }
    }
}
