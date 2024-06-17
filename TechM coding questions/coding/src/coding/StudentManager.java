package coding;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to get all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    // Method to get a student by id
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Method to update a student's details
    public boolean updateStudent(int id, String name, int age) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            return true;
        }
        return false;
    }

    // Method to delete a student by id
    public boolean deleteStudent(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Adding students
        manager.addStudent(new Student(1, "Alice", 20));
        manager.addStudent(new Student(2, "Bob", 22));

        // Displaying all students
        System.out.println("All Students: " + manager.getAllStudents());

        // Getting a student by id
        System.out.println("Student with ID 1: " + manager.getStudentById(1));

        // Updating a student's details
        manager.updateStudent(1, "Alice Smith", 21);
        System.out.println("Updated Student with ID 1: " + manager.getStudentById(1));

        // Deleting a student
        manager.deleteStudent(2);
        System.out.println("All Students after deletion: " + manager.getAllStudents());
    }
}
