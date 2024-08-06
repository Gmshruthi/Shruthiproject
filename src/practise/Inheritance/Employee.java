package Git.src.practise.Inheritance;

public class Employee {
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }
}
class Manager extends Employee{

    Manager(String name, double salary) {
        super(name, salary);
    }
    String Department="Sales";

}
class Main{
    public static void main(String[] args) {
        Manager manager=new Manager("Jonathan",45000);
        System.out.println(manager.name);
        System.out.println(manager.salary);
        System.out.println(manager.Department);
    }
}
