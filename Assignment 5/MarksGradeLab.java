import java.util.Scanner;

public class MarksGradeLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if(average > 90)
            System.out.println("Grade: Ex");
        else if(average > 80)
            System.out.println("Grade: A");
        else if(average > 60)
            System.out.println("Grade: B");
        else if(average >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}
