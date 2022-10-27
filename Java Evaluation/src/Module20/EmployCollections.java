package Module20;

import java.time.LocalDate;

public class EmployCollections {
    private String firstName;
    private String lastName;
    private LocalDate dateofJoining;

    private String dob;
    private  String department;
    private String managerName;
    private String designation;
    private int experiance;


    public EmployCollections(String firstName, String lastName, LocalDate dateofJoining, String dob, String department, String managerName, String designation, int experiance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofJoining = dateofJoining;
        this.dob = dob;
        this.department = department;
        this.managerName = managerName;
        this.designation = designation;
        this.experiance = experiance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateofJoining() {
        return dateofJoining;
    }

    public String getDob() {
        return dob;
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

    public int getExperiance() {
        return experiance;
    }

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
