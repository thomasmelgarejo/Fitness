package com.door;

public class Employee extends Person {

    private int hours;
    private int salary;
    private  int vacation;
    private Person person;

//    public Employee(String name, String cpr) {
//        super(name, cpr);
//    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }


}
