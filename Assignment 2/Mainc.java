 class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {
   
    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {
   
    void start() {
        System.out.println("Bike starts");
    }
}

class Truck extends Vehicle {
  
    void start() {
        System.out.println("Truck starts");
    }
}

public class Mainc {
    public static void main(String[] args) {
        Car v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();   
        v2.start(); 
        Truck t=new Truck();
        t.start();
        Vehicle v3=new Vehicle();
        v3.start();
       
    }
}
