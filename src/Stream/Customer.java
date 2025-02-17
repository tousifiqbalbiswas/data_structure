package Stream;

import java.util.List;
import java.util.ArrayList;

class Customer {
    private int id;
    private String name;
    private int age;
    private String email;
    private String city;

    // Constructor
    public Customer(int id, String name, int age, String email, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getCity() { return city; }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Customer { " +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Email='" + email + '\'' +
                ", City='" + city + '\'' +
                " }";
    }
}
