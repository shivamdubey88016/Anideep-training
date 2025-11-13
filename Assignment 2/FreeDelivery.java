
class FreeDelivery{
    public static void main(String[] args) {
        double orderAmount = 1200.0;
        boolean isPremiumMember = false;
        boolean hasCoupon = true;

       

        if (orderAmount >= 1000 && isPremiumMember) {
            System.out.println("Eligible for free delivery (High order + Premium Member).");
        } else if (orderAmount >= 1000 || hasCoupon) {
            System.out.println("Eligible for free delivery (High order or valid coupon).");
        } else if (!(orderAmount < 500)) {
            System.out.println("Eligible for standard delivery benefits.");
        } else {
            System.out.println("Not eligible for free delivery.");
        }
    }
}
