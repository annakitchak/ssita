
//    Create a class Employee with fields name, department number, salary. Create five objects of class Employee.
//    1)Display all employees of a certain department (enter department number in the console);
//    2)arrange workers by the field salary in descending order.


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jon",1,3600);
        Employee e2 = new Employee("Ron",2,5900);
        Employee e3 = new Employee("Sam",1,9000);
        Employee e4 = new Employee("Marisa",2,36500);
        Employee e5 = new Employee("Emily",1,8800);

        Set<Employee>employees=new TreeSet<>((Comparator<Employee>) new SortBySalary());
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        for (Employee empl : employees) {
            System.out.println(empl);
        }

        Scanner scan = new Scanner(System.in);

        Iterator<Employee>iterator=employees.iterator();
		int dep=0;
        System.out.println("Enter department number");
		String name = "";
        if(scan.hasNextInt()){
            dep = scan.nextInt();
            if (dep > 0 && dep <= 2) {
                System.out.println("in " + dep + " department work: ");
                while(iterator.hasNext()){
			        Employee empl =iterator.next();
			        if(empl.getDepartmentNum()==dep){
                        System.out.println(empl);
			        }
		        }

            }else System.out.println("no such department");
        }else System.out.println("wrong input");



//        Employee [] company = {e1,e2,e3,e4,e5};
//
//        Scanner scan = new Scanner(System.in);
//        int dep=0;
//
//        System.out.println("Enter department number");
//        if(scan.hasNextInt()) {
//            dep = scan.nextInt();
//            if (dep > 0 && dep <= 2) {
//                System.out.println("in " + dep + " department work: ");
//                for (int i = 0; i < company.length; i++) {
//                    if (dep == company[i].getDepartmentNum()) {
//                        System.out.println(company[i]);
//                    }
//                }
//            }else System.out.println("no such department");
//        }else System.out.println("wrong input");
    }
}
