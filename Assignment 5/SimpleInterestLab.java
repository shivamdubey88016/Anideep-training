import java.util.Scanner;

public class SimpleInterestLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double T = sc.nextDouble();

        double rate;
        if(P > 10000)
            rate = 10;
        else if(P >= 5000)
            rate = 8;
        else
            rate = 5;

        double SI = (P * T * rate) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}
