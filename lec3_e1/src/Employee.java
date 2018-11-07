/*
Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consists of
    three private fields: name, rate and hours;
    static field totalSum
    properties for access to these fields;
    default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
    methods:
        salary - to calculate the salary of person (rate * hours)
        toString - to output information about employee
        changeRate - to change the rate of employee
        bonuses – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them.
Display the total salary of all workers to screen
*/


public class Employee {
    private String name;
    private int rate;
    private int hours;
    private double salary;
    private static double totalSum;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double salary(){
        double sal = rate * hours;
        this.setSalary(sal);
        totalSum = totalSum + sal;
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int r){
        this.rate = r;
    }

    public double bonuses(){
        double bonus = this.getSalary() * 0.1;
        totalSum = totalSum + bonus;
        return  bonus;
    }

    

}
