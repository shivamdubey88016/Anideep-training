class HighestPrice {
    public static void main(String[] args) {
        int p1 = 100;
        int p2 = 200;
        int p3 = 150;

        int highest = (p1 > p2) ? (p1 > p3 ? p1 : p3) : (p2 > p3 ? p2 : p3);

        System.out.println("Highest price is: " + highest);
    }
}
