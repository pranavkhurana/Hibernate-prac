package mypack;

import entity.DebitAccount;
import entity.Employee;
import entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        /*Vehicle vehicle=new Vehicle(142,"bike");
        Vehicle vehicle2=new Vehicle(255,"scoot");
        Vehicle vehicle3=new Vehicle(121,"car");

        List<Vehicle> vehicleList=new ArrayList<Vehicle>();
        vehicleList.add(vehicle);vehicleList.add(vehicle2);
        List<Vehicle> vehicleList1=new ArrayList<Vehicle>();
        vehicleList1.add(vehicle);vehicleList1.add(vehicle3);

        Employee employee=new Employee("prakhar",21,vehicleList);
        Employee employee1=new Employee("John Doe",22,vehicleList1);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);employeeList.add(employee1);
        List<Employee> employeeList1 = new ArrayList<Employee>();
        employeeList1.add(employee);
        List<Employee> employeeList2 = new ArrayList<Employee>();
        employeeList2.add(employee1);

        vehicle.setEmployeeList(employeeList);
        vehicle2.setEmployeeList(employeeList1);
        vehicle3.setEmployeeList(employeeList2);*/

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        DebitAccount debitAccount=new DebitAccount();
        debitAccount.setOwner("Peter");
        debitAccount.setBalance(23000);
        debitAccount.setInterestRate(23);
        debitAccount.setId(2);
        debitAccount.setOverdraftFee(2300);
        session.save(debitAccount);
        /*session.save(employee);
        session.save(employee1);
        session.save(vehicle);
        session.save(vehicle2);
        session.save(vehicle3);*/

        session.getTransaction().commit();
        session.close();

    }
}