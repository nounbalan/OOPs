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
class teamleader extends Employee{
    public int bonus;
    protected int finsal1;
    public String lang;
    teamleader(){
        System.out.println("Enter the bonus amount: ");
        bonus=sc.nextInt();
    }
    protected void sal(){
        finsal1=bonus+salary;
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
        System.out.println("Salary with bonus: "+finsal1);
    }
}
class promotional extends teamleader{
    public int appraisal;
    public int prosal;
    public void promotion(){
    System.out.println("Enter the appraisal amount: ");
    appraisal=sc.nextInt();
    }
    public void promsalary(){
        prosal=finsal1+appraisal;
    }
    public void print1(){
        System.out.println("The salary after you're being promoted is "+(bonus+salary+appraisal));

    }

}
public class multiappl{
    public static void main(String[]args){
        teamleader obj1=new teamleader();
        promotional obj2=new promotional();
        obj1.blood();
        obj1.getsal();
        obj1.sal();
        obj1.proglang();
        obj1.confirm();
        obj1.print();
        obj2.promotion();
        obj2.promsalary();
        obj2.print1();

    }
}
