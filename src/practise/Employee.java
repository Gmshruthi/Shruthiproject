package Git.src.practise;

public class Employee {
     Integer employeeId;
     String firstName;
     String lastName;
     String middleName;
     String dob;
     String gender;
     String emailAddress;
     String phoneNumber;
    String address;

    Employee(Integer employeeId,String firstName,String lastName
    ,String middleName,String dob,String gender,String emailAddress,String phoneNumber
    ,String address){
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
//    @Override
////    public String toString(){
////
////        return employeeId+"\n"+firstName+"\n"+address;
////    }

    public static void main(String[] args) {
        Employee employee=new Employee(121,"G","Mohan","guru","10/5/2001",
                "male","gmnmohan@gmail.com","9999966666","saidapet");
        System.out.println(employee);
    }
}
