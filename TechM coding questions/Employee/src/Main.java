import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager employeeManager = (EmployeeManager) context.getBean("employeeManager");

        // Adding employees
        Employee emp1 = new Employee(0, "John Doe", "IT");
        Employee emp2 = new Employee(0, "Jane Doe", "HR");

        employeeManager.addEmployee(emp1);
        employeeManager.addEmployee(emp2);

        // Retrieving all employees
        System.out.println("All Employees: " + employeeManager.getAllEmployees());

        // Retrieving an employee by ID
        System.out.println("Employee with ID 1: " + employeeManager.getEmployeeById(1));

        // Updating an employee
        Employee empToUpdate = employeeManager.getEmployeeById(1);
        empToUpdate.setName("John Smith");
        empToUpdate.setDepartment("Finance");
        employeeManager.updateEmployee(empToUpdate);
        System.out.println("Updated Employee with ID 1: " + employeeManager.getEmployeeById(1));

        // Deleting an employee
        employeeManager.deleteEmployee(2);
        System.out.println("All Employees after deletion: " + employeeManager.getAllEmployees());
    }
}
