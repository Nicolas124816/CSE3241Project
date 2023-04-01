package Entities;

public class Employee {
    private int salary;
    private String position;
    private String startDate;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Salary: " + this.salary + "\n Position: " + this.position
                + "\n Start Date: " + this.startDate;
    }

}
