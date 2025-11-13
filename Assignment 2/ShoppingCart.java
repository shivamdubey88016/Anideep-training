class ShoppingCart{
    public static void main(String[] args) {
        double itemPrice = 250.0;
        int quantity = 3;
        double discount = 50.0; // discount is in rupees
        double tax = 45.0;

        double addition = itemPrice * quantity;
        double subtraction = addition - discount;
        double multiplication = itemPrice * quantity;
        double division = addition / quantity;
        double modulus = quantity % 2;

        double total = subtraction + tax;

        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Addition (itemPrice * quantity): " + addition);
        System.out.println("Subtraction (after discount): " + subtraction);
        System.out.println("Multiplication (itemPrice * quantity): " + multiplication);
        System.out.println("Division (total / quantity): " + division);
        System.out.println("Modulus (quantity % 2): " + modulus);
        System.out.println("Final Total (after tax): " + total);
    }
}
