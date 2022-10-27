package Module19;

import java.time.LocalDate;

public class Employee {
    private String reportee;
    private String manager;
    private String id;
    private LocalDate date;
    private int orderList;
    private String user;

    public String getReportee() {
        return reportee;
    }

    public String getManager() {
        return manager;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getOrderList() {
        return orderList;
    }

    public String getUser() {
        return user;
    }

    public Employee(String reportee, String manager, String id, LocalDate date, int orderList, String user) {
        this.reportee = reportee;
        this.manager = manager;
        this.id = id;
        this.date = date;
        this.orderList = orderList;
        this.user = user;
    }
}
