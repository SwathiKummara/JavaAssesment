package Module20;

import Module3.Employee;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
      List<EmployCollections> employCollections = new ArrayList<>();
        employCollections.add(new EmployCollections("Swathi","Kummara",LocalDate.now(),"13-06-2022","development","Gopal","triner",  10));
        employCollections.add(new EmployCollections("megam","Kummara",LocalDate.of(2000,12,16),"13-06-2022","development","Gopal","triner",  10));
        employCollections.add(new EmployCollections("Sourab","Kummara",LocalDate.of(2006,02,10),"13-06-2022","development","Gopal","triner",  10));
        employCollections.add(new EmployCollections("sruthi","Kummara",LocalDate.of(2000,1,6),"13-06-2022","development","Gopal","triner",  10));

        List<EmployCollections> employeeListBefore = employCollections.stream()
                .filter(e -> e.getDateofJoining().isBefore(LocalDate.of(2016,06,12)))
                .collect(Collectors.toList());
        employCollections.removeAll(employeeListBefore);
        System.out.println(employCollections);



        List<String> list = new ArrayList<>();
        Collections.addAll(list,"402","345","429","509","389","500","300");

        Predicate<String> predicate = l -> l.startsWith("4");
        list.removeIf(predicate);

        System.out.println(list);



        Map<Integer,String> map1 = new HashMap<>();

        map1.put(1, "swathi");
        map1.put(2, "has");

        System.out.println(map1.size());
        // expected output: 2

        map1.clear();
        System.out.println(map1.size());
// expected output: 0

    }
}
