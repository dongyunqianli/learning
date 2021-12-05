import java.io.*;
public class EmployeeTest {
    public static void main(String[] args){
        System.out.println(Employee.Department);
        Employee empOne=new Employee("runoob1");

        System.out.println(Employee.Department);
        empOne.empAge(26);
        empOne.empDesignation("programer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        Employee empTwo=new Employee();
        empTwo.empName("runoob2");
        empTwo.printEmployee();
        System.out.println(Employee.Department);

    }

}
