package com.door;

public class Instructor extends Employee {


    private int salery;
    private int vacation;

    public Instructor(String name, String cpr, int hours, int salery, int vacation) {
        super(name, cpr, hours);
        this.salery = salery;
        this.vacation = vacation;
    }

    @Override //polymorfi overwrites method
    public int getSalary() {
        return this.salery*super.getHours();
    }

    public int getVacation() {
        return 0;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salery=" + salery + " name " + super.getHours()+
                '}';
    }
}
