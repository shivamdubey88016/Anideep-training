public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("payment done");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("next job");
        });

        t1.start();
        t1.join();  
        System.out.println("order placed");

        t2.start();
    }
}
