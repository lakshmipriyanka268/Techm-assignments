package subclasspackage;
package subclasspackage;

import mypackage.Person;

public class Subclass extends Person {

    // Constructor
    public Subclass(String name, int age, String address) {
        super(name, age, address);
    }

    public void printDetails() {
        // Accessing protected member age
        System.out.println("Age: " + age);

        // Accessing default/package-private member address
        // This will cause a compilation error because address has package-private access
        // System.out.println("Address: " + address);

        // We can access the address using the getter method
        System.out.println("Address: " + getAddress());
    }

    public static void main(String[] args) {
        Subclass subclass = new Subclass("John Doe", 30, "123 Main St");
        
        // Set and get the name using the setter and getter methods
        subclass.setName("Jane Doe");
        System.out.println("Name: " + subclass.getName());
        
        // Print age and address
        subclass.printDetails();
    }
}

