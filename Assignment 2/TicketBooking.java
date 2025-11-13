class TicketBooking {
    void bookTicket(String name, String movie) {
        System.out.println("Booking ticket for " + name + "...");
        System.out.println("Movie: " + movie);
        
       
    }

    double calculateTotal(int tickets, double pricePerTicket) {
        double total = tickets * pricePerTicket;
        return total;
    }

    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        tb.bookTicket("Shivam", "Pushpa 2");
        double totalAmount = tb.calculateTotal(3, 250.0);
        System.out.println("Total amount for 3 tickets: ₹" + totalAmount);
    }
}
