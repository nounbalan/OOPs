import java.util.*;
class Employee{
    Scanner sc=new Scanner(System.in);
    public String name;
    protected int age, salary;
    public String bloodgroup;
    Employee(){
        name="Balan";
        age=21;        
    }
    public void getsal(){
        System.out.println("Enter base salary: ");
        salary=sc.nextInt();
    }
    protected void blood(){
        System.out.println("Enter the blood group");
        bloodgroup=sc.next();
    }
    public void confirm(){
        System.out.println("Employee details confirmed !");
    }
}
class programmer extends Employee{
    public int bonus;
    protected int finsal;
    public String lang;
    programmer(){
        System.out.println("Enter the bonus amount: ");
        bonus=sc.nextInt();
    }
    protected void sal(){
        finsal=bonus+salary;
    }
    public void proglang(){
        System.out.println("Enter the programing language the employee specifies in: ");
        lang=sc.next();
    }
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: Program");
        System.out.println("Language: "+lang);
        System.out.println("Salary with bonus: "+finsal);
    }
}
public class sinher{
    public static void main(String[]args){
        programmer obj1=new programmer();
        obj1.blood();
        obj1.getsal();
        obj1.sal();
        obj1.proglang();
        obj1.confirm();
        obj1.print();

    }
}
