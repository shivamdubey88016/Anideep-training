public class SimpleOddEven {

    static int num = 1;
    static final int MAX = 10;

    public static void main(String[] args) {

        Thread odd = new Thread(() -> {
            while (num < MAX) {
                synchronized (SimpleOddEven.class) {
                    if (num % 2 != 0) {
                        System.out.println("Odd: " + num);
                        num++;
                    }
                }
            }
        });

        Thread even = new Thread(() -> {
            while (num < MAX) {
                synchronized (SimpleOddEven.class) {
                    if (num % 2 == 0) {
                        System.out.println("Even: " + num);
                        num++;
                    }
                }
            }
        });

        odd.start();
        even.start();
    }
}
