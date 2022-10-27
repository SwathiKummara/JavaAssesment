package Module3;
public class Employee{
    private String firstName;
    private String lastName;
    private String  dateofJoining;

    private String dob;
    private  String department;
    private String managerName;
    private String designation;
    private int experiance;

    public Employee(String firstName, String lastName,String dob,  String dateofJoining, String department, String managerName, String designation, int experiance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.dateofJoining = dateofJoining;
        this.department = department;
        this.managerName = managerName;
        this.designation = designation;
        this.experiance = experiance;

    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateofJoining(String dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateofJoining() {
        return dateofJoining;
    }

    public String getDepartment() {
        return department;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getDesignation() {
        return designation;
    }
    public String getDob(){
        return dob;
    }
public int getExperiance(){
        return this.experiance;
}
    @Override
    public String toString() {
        return (
                "   firstName  :"+this.getFirstName()+
                        "  lastName  :"+this.getLastName()+
                        "Dob :"+this.getDob()+
                        "   DateofJoinning :"+this.getDateofJoining()+
                "   DepartMent :" +this.getDepartment()+
                "   Manager :")+this.getManagerName()+
                "   Destination :"+this.getDesignation()+"  Experiance  :"+this.getExperiance()
                ;
    }
}
