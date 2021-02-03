package com.door;

import java.util.ArrayList;

public class Main {


    /**Inherit øvelser, aflevering 03-02
     * Intressante ting
     * -casting klasser
     * -instanceof
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Instructor instructor1 = new Instructor("Instructor1","454545-45",250,100, 10);
        Instructor instructor2 = new Instructor("Instructor2","444545-45",50,150, 0);
        Administration administration = new Administration("admin1","225522-1111",1212,23000,5);
        Administration administration1 = new Administration("admin2","335522-1111",37,23000,5);
        list.add(administration);
        list.add(administration1);
        list.add(instructor1);
        list.add(instructor2);




        //PRINT FITNESS EMPLOYEES
        System.out.println("PRINT FITNESS EMPLOYEES");
        System.out.println("Name       Cpr           Hours          Salary         Vacation");
        System.out.println("***************************************************************");
        for (Person p : list ) {
            System.out.print(p.getName()+"    "+ p.getCpr()+"   ");

            if (p instanceof Instructor){
                System.out.print( ((Instructor) p).getHours());
                System.out.print("  "+ ((Instructor) p).getSalary());
                System.out.print("  "+ ((Instructor) p).getVacation());
            }

            if (p instanceof Administration){
                System.out.print( ((Administration) p).getHours());
                System.out.print("  "+ ((Administration) p).getSalary());
                System.out.print("  "+ ((Administration) p).getVacation());
            }
            System.out.println("");
        }
        System.out.println("================================================================");


        ArrayList<Person> people = new ArrayList<>();
        Member member1 = new Member("Member1","4545488-5555","Full    ",299);
        Member member2 = new Member("Member2","6545488-5555","Full    ",299);
        Member member3 = new Member("Member3","7545488-5555","Basic   ",199);
        Member member4 = new Member("Member4","8545488-5555","Basic   ",199);
        people.add(member1);
        people.add(member2);
        people.add(member3);
        people.add(member4);


        //PRINT FITNESS MEMBERS
        System.out.println("FITNESS MEMBERS");
        System.out.println("Name       Cpr                Member type     Fee");
        System.out.println("***************************************************************");
        for (Person p : people ) {
            System.out.print(p.getName()+"    "+ p.getCpr()+"   ");

            System.out.print("    "+ ((Member) p).getMemberType());
            System.out.print("        "+ ((Member) p).getFee());

//            if (p instanceof Instructor){
//                System.out.print( ((Instructor) p).getHours());
//                System.out.print("  "+ ((Instructor) p).getSalary());
//                System.out.print("  "+ ((Instructor) p).getVacation());
//            }
//
//            if (p instanceof Administration){
//                System.out.print( ((Administration) p).getHours());
//                System.out.print("  "+ ((Administration) p).getSalary());
//                System.out.print("  "+ ((Administration) p).getVacation());
//            }
            System.out.println("");
        }
        System.out.println("================================================================");


        //PRINT EMPLOYEES & MEMBERS Name and Cpr
        people.addAll(list);


        System.out.println("EMPLOYEES & MEMBERS Name and Cpr");
        System.out.println("Name       Cpr");
        System.out.println("***************************************************************");
        for (Person p : people ) {
            System.out.print(p.getName()+"    "+ p.getCpr()+"   ");

            //            if (p instanceof Instructor){
//                System.out.print( ((Instructor) p).getHours());
//                System.out.print("  "+ ((Instructor) p).getSalary());
//                System.out.print("  "+ ((Instructor) p).getVacation());
//            }
//
//            if (p instanceof Administration){
//                System.out.print( ((Administration) p).getHours());
//                System.out.print("  "+ ((Administration) p).getSalary());
//                System.out.print("  "+ ((Administration) p).getVacation());
//            }
            System.out.println("");
        }
        System.out.println("================================================================");





    }
}
