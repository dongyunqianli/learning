package employ;
import java.io.*;
public class Salary extends Employee{
    private double salary;
    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary>=0.0){
            salary=newSalary;
        }
    }
    public void mailCheck(){
        System.out.println("class Salary method of mailCheck");
        System.out.println("check mail to: "+getName()+",salary: "+salary);
    }


}
