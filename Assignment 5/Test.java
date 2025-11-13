class HelloThread extends Thread {
    public void run() {
      
        for (int i = 0; i < 5; i++) {
            System.out.println("hello " +Thread.currentThread().getName());
        }
    }
}

class WorldThread extends Thread {
     @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("World");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        WorldThread t2= new WorldThread();
      
      //System.out.println(t1.getState());
      
        t1.start();  
        
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t2.getState());

    }
}
