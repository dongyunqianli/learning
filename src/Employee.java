import java.io.*;
public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    public static String Department="developer";
    public Employee(){
        System.out.println("no argument start");
        Department="developer0";
        System.out.println("no argument end");
    }
    public Employee(String name){
        System.out.println("one arguemnt start");
        this.name=name;
        Department="developer1";
        System.out.println("one argument end");
    }
    public void empName(String empName){
        name=empName;
    }
    public void empAge(int empAge){
        age=empAge;
    }
    public void empDesignation(String empDesig){
        designation=empDesig;
    }
    public void empSalary(double empSalary){
        salary=empSalary;
    }
    public void printEmployee(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("designation: "+designation);
        System.out.println("salary: "+salary);
        System.out.println("department: "+Department);
    }
}
