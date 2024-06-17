package coding;
public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Adding students
        studentDAO.addStudent(new Student(1, "Alice", 20));
        studentDAO.addStudent(new Student(2, "Bob", 22));

        // Retrieving all students
        System.out.println("All Students: " + studentDAO.getAllStudents());

        // Retrieving a student by ID
        System.out.println("Student with ID 1: " + studentDAO.getStudentById(1));

        // Updating a student's details
        studentDAO.updateStudent(1, "Alice Smith", 21);
        System.out.println("Updated Student with ID 1: " + studentDAO.getStudentById(1));

        // Deleting a student
        studentDAO.deleteStudent(2);
        System.out.println("All Students after deletion: " + studentDAO.getAllStudents());

        // Closing the connection
        studentDAO.close();
    }
}
