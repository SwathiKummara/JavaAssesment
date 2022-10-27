package Module19;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Main {
        public static void main(String args[]) throws IOException {
                HashMap<String, List<String>> managerReporteeList;
                managerReporteeList = new HashMap<>();
                List<String> reportees = new ArrayList<>();
                Collections.addAll(reportees, "Swathi", "Megana", "Garima", "siva", "sarthak", "pranav", "yash");

                managerReporteeList.put("Pawan", reportees);


                Map<LocalDate, List<String>> dateOrderList = new HashMap<>();

                List<String> orderList = new ArrayList<>();
                Collections.addAll(orderList, "dress", "coffe", "tea", "mangoes");

                dateOrderList.put(LocalDate.now(), orderList);


                Map<String, Map<LocalDate, List<String>>> userwithDateandOrder = new HashMap<>();

                userwithDateandOrder.put("swathi", dateOrderList);
                System.out.println(userwithDateandOrder.get("swathi"));
        }

}