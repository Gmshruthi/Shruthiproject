package Git.src.practise;

public class Employee {
     String employeeId;
     String firstName;
     String lastName;
     String middleName;
     String dob;
     String gender;
     String emailAddress;
     String phoneNumber;
     public Address address;

    public Employee(String employeeId,String firstName,String lastName
    ,String middleName,String dob,String gender,String emailAddress,String phoneNumber
    ,Address address){
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
        this.dob=dob;
        this.gender=gender;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.address=address;

    }
    @Override
    public String toString(){
        return employeeId+"\n"+firstName+"\n"+lastName+"\n"+middleName+"\n"+dob+"\n"+gender+"\n"+emailAddress+"\n"+phoneNumber+"\n"+address;
    }

    public static void main(String[] args) {
        Address address=new Address("VGN MAHALAKSHMI NAGAR","TVK","091");
        Employee employee=new Employee("121","G","Mohan","guru","10/5/2001",
                "male","gmnmohan@gmail.com","9999966666",address);
        System.out.println(employee);
    }
}
