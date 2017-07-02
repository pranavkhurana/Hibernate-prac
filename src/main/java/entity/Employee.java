package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    int age;

    @ManyToMany(mappedBy = "employeeList")
    List<Vehicle> vehicleList;

    public Employee(String name, int age, List<Vehicle> vehicleList) {
        this.name = name;
        this.age = age;
        this.vehicleList = vehicleList;
    }

    public Employee() {
    }


    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
