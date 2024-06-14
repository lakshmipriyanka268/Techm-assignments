package mypackage;
package mypackage;

public class Person {
    private String name;
    protected int age;
    String address; // default/package-private

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }
}

