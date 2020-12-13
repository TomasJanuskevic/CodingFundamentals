package modifires;

public class Car {
    // Access modifires

    //Private
    //Public
    //Protected
    //Default


    //public test
    //Access modifier Return type method name
    public void turnOnEngine() {
        System.out.println("Engine is on");
        injectFuel();
    }
    //private accessible only from THIS CLASS
    private void injectFuel(){
        System.out.println("Fuel is being injected");
    }
}
