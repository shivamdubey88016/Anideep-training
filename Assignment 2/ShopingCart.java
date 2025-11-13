
class ShopingCart {
    int isEven(int num) {
        return num % 2;
    }
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        int items = 5;
        if (cart.isEven(items)==0) {
            System.out.println("The number of items (" + items + ") is even.");
        } else {
            System.out.println("The number of items (" + items + ") is odd.");
        }
    }
}
