import java.util.Random;

public class DownloadSimulator {

    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();

       
        Thread t1 = new Thread(() -> {
            try {
                int time = rand.nextInt(3000) + 1000; 
                System.out.println("File 1 downloading... (" + time + " ms)");
                Thread.sleep(time);
                System.out.println("File 1 downloaded.");
            } catch (Exception e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                int time = rand.nextInt(3000) + 1000;
                System.out.println("File 2 downloading... (" + time + " ms)");
                Thread.sleep(time);
                System.out.println("File 2 downloaded.");
            } catch (Exception e) {}
        });

        Thread t3 = new Thread(() -> {
            try {
                int time = rand.nextInt(3000) + 1000;
                System.out.println("File 3 downloading... (" + time + " ms)");
                Thread.sleep(time);
                System.out.println("File 3 downloaded.");
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        
        t1.start();
        t2.start();
        t3.start();

      
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads completed");
    }
}
