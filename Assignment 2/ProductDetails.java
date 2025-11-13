public class ProductDetails {
    public static void main(String[] args) {
        byte quantity = 100;
        short stock = 5000;
        int productId = 10101;
        long barcode = 9876543210L;
        float price = 299.99f;
        double rating = 4.7;
        char category = 'E';
        boolean available = true;

        System.out.println("Product ID: " + productId);
        System.out.println("Barcode: " + barcode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock: " + stock);
        System.out.println("Price: ₹" + price);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
        System.out.println("Available: " + available);
    }
}
