package objects;

//Brezinys arba blueprintas kurio pagalba sukuriamas objektas
public class Robot {

    //defoltinis konstruktorius iskveciamas objekto sukurimo metu
    public Robot() {
        System.out.println("Robotas yra sukurtas");
    }

    // specifinis konstruktorius
    public Robot(String color, String name, int weight) {
        System.out.println("Kitas robotas sukurtas");
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    //apibudename objektobusena/state
    String color = "Red";
    String name = "Brad";
    int weight = 50;

    // apibudiname objekto elgsena/behavior

    public void sayHello() {
        System.out.println("Say HI as a robot!");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
