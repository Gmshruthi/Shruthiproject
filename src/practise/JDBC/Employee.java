package Git.src.practise.JDBC;

import Git.src.practise.Address;

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
    String jobTitle;
    String department;
    String managerId;
    String dateOfJoining;
    String employmentStatus;
    double salary;
    String workLocation;
    private String panNumber;
    private String aadhaarNumber;
    private String bankAccountDetails;
    String employmentEligibilityVerification;
    String backgroundCheckStatus;
    String emergencyContact;
    String skills;
    String education;
    String certifications;
    String performance;
    Employee(String employeeId,String firstName,String lastName
            ,String middleName,String dob,String gender,String emailAddress,String phoneNumber
            ,Address address,
             String jobTitle, String department, String managerId, String dateOfJoining, String employmentStatus,
             double salary, String workLocation,String employmentEligibilityVerification, String backgroundCheckStatus, String emergencyContact,
             String skills, String education, String certifications, String performance) {

        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
        this.dob=dob;
        this.gender=gender;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.jobTitle=jobTitle;
        this.department=department;
        this.managerId=managerId;
        this.dateOfJoining=dateOfJoining;
        this.employmentStatus=employmentStatus;
        this.salary=salary;
        this.workLocation=workLocation;
        this.employmentEligibilityVerification=employmentEligibilityVerification;
        this.backgroundCheckStatus=backgroundCheckStatus;
        this.emergencyContact=emergencyContact;
        this.skills=skills;
        this.education=education;
        this.certifications=certifications;
        this.performance=performance;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public String getAadhaarNumber() {
        return aadhaarNumber;
    }
    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }
    public String getBankAccountDetails() {
        return bankAccountDetails;
    }
    public void setBankAccountDetails(String bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }
    @Override
    public String toString(){
        return employeeId+"\n"+firstName+"\n"+lastName+"\n"+middleName+"\n"+dob+"\n"+gender+"\n"+emailAddress+"\n"+phoneNumber+"\n"+address+
                jobTitle+"\n"+department+"\n"+managerId+"\n"+dateOfJoining+"\n"+employmentStatus+"\n"+
                salary+"\n"+workLocation+"\n"+employmentEligibilityVerification+"\n"+backgroundCheckStatus+"\n"+emergencyContact+"\n"+
                skills+"\n"+education+"\n"+certifications+"\n"+performance+"\n"+aadhaarNumber+"\n"+panNumber+"\n"+bankAccountDetails;
    }
    public static void main(String[] args) {
        Address address=new Address("VGN MAHALAKSHMI NAGAR","TVK","chennai","9991","Tamil Nadu");
        Employee employee=new Employee("121","G","Mohan","guru","10/5/2001",
                "male","gmnmohan@gmail.com","9999966666",address,"Senior UI Developer","Application","direct Manager","10/7/2013",
                "Full Time",700000,"Chennai","Done","Done"
                ,"76827983632","Frontend Development,CSS,reactjs,html",
                "B.Tech computer Science","Google Certification,Microsoft Certification","Good");
        employee.setBankAccountDetails("Indian Bank");
        employee.setAadhaarNumber("7872 297 2892");
        employee.setPanNumber("120AA12903709");
        System.out.println(employee);
    }
}


