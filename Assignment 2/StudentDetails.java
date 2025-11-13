public class StudentDetails {
    String name;
    int score;
    String grade;

    StudentDetails(String name, int score, String grade) {
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
       
    }

    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("shivam", 20, "A");
        StudentDetails student2 = new StudentDetails("sunny", 22, "B");
        StudentDetails student3 = new StudentDetails("rohit", 19, "A+");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
    
}
