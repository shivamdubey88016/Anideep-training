public class ConstroctorOverloading {
String BrandName;
int price;
byte ram;

ConstroctorOverloading(String BrandName) {
    this.BrandName = BrandName;
}
ConstroctorOverloading(String BrandName, int price) {
    this.BrandName = BrandName;
    this.price = price;
    
}
ConstroctorOverloading(String BrandName, int price, byte ram) {
    this.BrandName = BrandName;
    this.price = price;
    this.ram = ram;
}

void displayInfo() {
    System.out.println("Brand Name: " + BrandName);
    System.out.println("Price: " + price);
    System.out.println("RAM: " + ram);
}

public static void main(String[] args) {
    ConstroctorOverloading phone1 = new ConstroctorOverloading("Samsung");
    ConstroctorOverloading phone2 = new ConstroctorOverloading("Apple", 1000);
    ConstroctorOverloading phone3 = new ConstroctorOverloading("OnePlus", 600, (byte) 12);

    phone1.displayInfo();
    phone2.displayInfo();
    phone3.displayInfo();
}

    
}
