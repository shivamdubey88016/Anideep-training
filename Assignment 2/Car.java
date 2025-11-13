 
 class Car { 
    String brandName;
    String modelNo;
    double price;

    Car(String brandName, String modelNo, double price) {
        this.brandName = brandName;
        this.modelNo = modelNo;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + modelNo);
        System.out.println("Price: ₹" + price);
        
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner", 4500000);
        Car car2 = new Car("Hyundai", "Creta", 1800000);
        Car car3 = new Car("Tata", "Harrier", 2200000);
        car1.display();
        car2.display();
        car3.display();
    }
}
