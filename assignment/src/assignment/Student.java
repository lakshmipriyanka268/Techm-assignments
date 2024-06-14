package assignment;
public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Print the name and age of the student
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

