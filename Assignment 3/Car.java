public class Car{

String make;
String model;
short year;
double price;
public Car(String make, String model, short year, double price){
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
    System.out.println("Car object created: " + make + " " + model + ", Year: " + year + ", Price: $" + price);
}
void DisplayInfo(){
    System.out.println("Car Make: " + make);
    System.out.println("Car Model: " + model);
    System.out.println("Car Year: " + year);
    System.out.println("Car Price: $" + price);
}
public static void main(String[] args){
    Car car1 = new Car("Toyota", "Camry", (short)2020, 24000.00);
    Car car2 = new Car("Honda", "Civic", (short)2019, 22000.00);
    Car car3 = new Car("Ford", "Mustang", (short)2021, 26000.00);
    car1.DisplayInfo();
    car2.DisplayInfo();

    car3.DisplayInfo();

}}