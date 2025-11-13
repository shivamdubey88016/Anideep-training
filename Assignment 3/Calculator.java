public class Calculator {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
     void add(int a, int b,int c) {
        int sum = a + b+c;
        System.out.println("Sum: " + sum);
    }
     void add(double a, double b) {
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }
public static void main(String[] args){
    Calculator c1 = new Calculator();
    c1.add(5, 10);
    c1.add(5, 10, 15);
    c1.add(5.5, 10.5);      
}



}



