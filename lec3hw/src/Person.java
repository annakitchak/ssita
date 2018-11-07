/*
Create Console Application project in Java. Add class Person to the project.
Class Person should consists of
    two private fields: name and birthYear (the birthday year)
    properties for access to these fields
    default constructor and constructor with 2 parameters
    methods:
        age - to calculate the age of person
        input - to input information about person
        output - to output information about person
        changeName - to change the name of person
In the method main() create 5 objects of Person type and input information about them.

*/


import java.time.Year;
import java.util.Scanner;


public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(){
        int year = Year.now().getValue();
        return year - this.getBirthYear();
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        String nm = "";
        int year = 0;
        System.out.println("Enter name: ");
        if(scan.hasNext()) {
            nm = scan.nextLine();
        }
        else System.out.println("wrong input");
        System.out.println("Enter birth year: ");
        if(scan.hasNextInt()) {
            year = scan.nextInt();
        }
        else System.out.println("wrong input");
        Person.this.setName(nm);
        Person.this.setBirthYear(year);

    }

    public void output(){
        System.out.println(Person.this.getName() + " was born in " + Person.this.getBirthYear());
    }

    @Override
    public String toString() {
        return "Name is'" + name + '\'' +
                ", birthYear is" + birthYear;
    }

    public void changeName(String nm){
        this.name = nm;
    }

   /* public void changeName(){
        Scanner scan = new Scanner(System.in);
        String newName = "";
        System.out.println("Enter new name");
        if (scan.hasNext()){
            newName = scan.nextLine()
            Person.this.setName(newName);
        }
        else System.out.println("wrong input");
    }*/

}
