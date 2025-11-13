class  RelationalOperators{
    public static void main(String[] args) {
        double billAmount = 2500.0;
        double minDiscount = 1000.0;
        double maxDiscount = 3000.0;

        System.out.println("Bill Amount: ₹" + billAmount);

        System.out.println("== Operator: " + (billAmount == minDiscount));
        System.out.println("!= Operator: " + (billAmount != minDiscount));
        System.out.println("> Operator: " + (billAmount > minDiscount));
        System.out.println("< Operator: " + (billAmount < maxDiscount));
        System.out.println(">= Operator: " + (billAmount >= minDiscount));
        System.out.println("<= Operator: " + (billAmount <= maxDiscount));

        if (billAmount > minDiscount && billAmount < maxDiscount) {
            System.out.println("You are eligible for a 10% discount!");
        } else if (billAmount >= maxDiscount) {
            System.out.println("You get a 20% discount!");
        } else {
            System.out.println("No discount available.");
        }
    }
}
