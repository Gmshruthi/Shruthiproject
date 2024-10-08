package Git.src.practise;
public class Employee {
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
    Employee(
                    String jobTitle, String department, String managerId, String dateOfJoining, String employmentStatus,
                    double salary, String workLocation,String employmentEligibilityVerification, String backgroundCheckStatus, String emergencyContact,
                    String skills, String education, String certifications, String performance) {
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
        return jobTitle+"\n"+department+"\n"+managerId+"\n"+dateOfJoining+"\n"+employmentStatus+"\n"+
                salary+"\n"+workLocation+"\n"+employmentEligibilityVerification+"\n"+backgroundCheckStatus+"\n"+emergencyContact+"\n"+
                skills+"\n"+education+"\n"+certifications+"\n"+performance+"\n"+aadhaarNumber+"\n"+panNumber+"\n"+bankAccountDetails;
    }
    public static void main(String[] args) {
        Employee employeeDetails=new Employee("Senior UI Developer","Application","direct Manager","10/7/2013",
                "Full Time",700000,"Chennai","Done","Done"
                ,"76827983632","Frontend Development,CSS,reactjs,html",
                "B.Tech computer Science","Google Certification,Microsoft Certification","Good");
        employeeDetails.setBankAccountDetails("Indian Bank");
        employeeDetails.setAadhaarNumber("7872 297 2892");
        employeeDetails.setPanNumber("120AA12903709");
        System.out.println(employeeDetails);
    }
}
