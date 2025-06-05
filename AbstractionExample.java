package java_with_DSA;

abstract class Caar {
    abstract void start();
    abstract void drive();
    abstract void stop();

    void musicSystem() {
        System.out.println("Playing music...");
    }
}


  

public class AbstractionExample {
	void start() {
        System.out.println("Car started using the start button.");
    }

    void drive() {
        System.out.println("Driving the car after starting.");
    }

    void stop() {
        System.out.println("Car stopped using the stop button.");
    }
    public static void main(String[] args) {
    	AbstractionExample  myCar = new AbstractionExample();
        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}
