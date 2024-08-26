package Git.src.practise.Inheritance;

import Git.src.practise.Contact;

public class MainClass {
    public static void main(String[] args) {
        Company company=new Company();
        EmployeeOfContact employeeOfContact=new EmployeeOfContact();
        Person person=new Person();
        Contact contact=new EmployeeOfContact();
        //EmloyeeOfContact employeeOfContact=new Contact(); Inheritance is Is-A Relationship , instance of subclass cannot be instance of superclass
        System.out.println(employeeOfContact.name+" "+employeeOfContact.phoneNumber+" "
                +employeeOfContact.emailId+" "+employeeOfContact.salary+" "+employeeOfContact.designation+" "+person.DateOfBirth);
    }
}
