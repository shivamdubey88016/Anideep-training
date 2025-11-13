public class Student {
    
    private String name;
    private int age;
    private String department;

    
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter 
    public String getName() {
        return name;
    }
// Setter
    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


//note: always call getter to return results
    public static void main(String[] args) {
        Student s = new Student("Shivam", 20, "Computer Science");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Department: " + s.getDepartment());
    }
}






