public class ThreadEx1  extends Thread {

    public void run() {
        System.out.println("downloading file 1");
    }
}
class ThreadEx2 extends Thread {
    public void run() {
        System.out.println("downloading file 2");
    }

}
class ThreadDemo extends Thread {
    public void run() {
        System.out.println("downloading file 3");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEx1 t1 = new ThreadEx1();
        ThreadEx2 t2 = new ThreadEx2();
        ThreadDemo t3 = new ThreadDemo();

        t1.start();
       t1.join();
        t2.start();
       t2.join();
        t3.start();

    }
}
