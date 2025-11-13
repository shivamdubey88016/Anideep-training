class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shivam", 25);
        e1.showDetails();
    }
}
