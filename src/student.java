import java.util.Scanner;
public class student {
    String name;
    int regno;
    int age;
    student(String name, int regno, int age){
        name=name;
        //System.outA.println(name);
        regno=regno;
        System.out.println(regno);
        age=age;
        System.out.println(age);

    }
    public static void main(String args[]){
        student s=new student("shruthi",52,19);
        student n=new student("Naveen",51,20);
        student p=new student("Periyaswamy",53,20);
        student a=new student("Akshaya",71,20);
        student Sa=new student("Sadhana",61,20);


    }
}
