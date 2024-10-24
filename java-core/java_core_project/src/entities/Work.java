package entities;
import utils.Status;

import java.time.LocalDate;
public class Work {
    public static int autuId = 0;
    private int id;
    private String name;
    private String workDescription;
    private LocalDate addDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;
    private int assignee; // người được giao
    private String projectCreator; // người tạo dự án
    private String notification; // Thông báo từ sếp

    public Work() {
    }

    public Work(String name, String workDescription, LocalDate addDate, LocalDate startDate, LocalDate endDate, Status status) {
        this.id = ++autuId;
        this.name = name;
        this.workDescription = workDescription;
        this.addDate = addDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public static int getAutuId() {
        return autuId;
    }

    public static void setAutuId(int autuId) {
        Work.autuId = autuId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getAssignee() {
        return assignee;
    }

    public void setAssignee(int assignee) {
        this.assignee = assignee;
    }

    public String getProjectCreator() {
        return projectCreator;
    }

    public void setProjectCreator(String projectCreator) {
        this.projectCreator = projectCreator;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }



    public void displayWork() {
        System.out.println("Work Details:");
        System.out.println("---------------------");
        System.out.println("ID                : " + id);
        System.out.println("Work Name         : " + name);
        System.out.println("Description       : " + workDescription);
        System.out.println("Add Date          : " + addDate);
        System.out.println("Start Date        : " + startDate);
        System.out.println("End Date          : " + endDate);
        System.out.println("Status            : " + status);
        System.out.println("---------------------");
    }
}
