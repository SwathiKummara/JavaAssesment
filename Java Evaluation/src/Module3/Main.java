package Module3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employData = new ArrayList<>();

        System.out.println(employData.add(new Employee("Swathi","Kummara","1-2-2001","13-06-2022","development","Gopal","triner",  10)));
        employData.add(new Employee("Harika","mara","2-2-2003","14-06-2022","development","Pawan","Intern", 3));
        employData.add( new Employee("Pawan","Kum","3-2-2004","13-06-2012","development","Pawan","HR", 2));
        employData.add(new Employee("Gamya","vaser","4-2-2001","1-06-2042","development","srian","Intern", 5));
        employData.add(new Employee("Shruthi","rama","1-2-2201","3-06-2022","development","Pawan","developer", 8));
        employData.add(new Employee("Soumya","mara","1-12-2009","8-06-2022","development","manan","tester", 1));

        //sorting according to  firstname
        Collections.sort(employData,((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())));
        System.out.println(employData);

        //sorting according to dateofJoining

        Collections.sort(employData,(o1, o2) -> o1.getDateofJoining().compareTo(o2.getDateofJoining()));
        System.out.println(employData);

        // finding the persons who have more than 2years experiance
        employData.stream().filter(e->e.getExperiance() > 2)
                .map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("+++++++finding the persond who have specific designation");
        //finding the persond who have specific designation
        employData.stream().filter(employee -> employee.getDesignation()=="Intern")
                .map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("++++++++group of employees by manager name");
        //group of employees by manager name

        employData.stream().filter(employee -> employee.getManagerName()=="Pawan")
                .map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("++++++group by year of birth");
 //group by year of birth
        employData.stream().filter(employee -> employee.getDob().contains("2001"))
                .map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("+++++++finding by year of joining");
        //finding by year of joining
        employData.stream().filter(employee -> employee.getDateofJoining().contains("2022"))
                .map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("++ list of managers");
        //list of managers
        ArrayList<String> ArrList = new ArrayList<String>();

        for (Employee employee: employData) {
            ArrList.add(employee.getManagerName());
        }
        HashSet<String> ManagerSet = new HashSet<String>(ArrList);

        System.out.println(ManagerSet);


    }
}
