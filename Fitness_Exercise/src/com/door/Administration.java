package com.door;

public class Administration extends Employee {

    private int vacation;
    private int salary;

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours);
        this.vacation = vacation;
        this.salary = salary;
    }

    public int getVacation() {
        return 5;
    }
}
