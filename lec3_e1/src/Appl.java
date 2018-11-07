/**
 * Created by annakitchak on 16.10.18.
 */
public class Appl {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setName("Anna");
//        s1.setRating(5);
//
//        Student s2 = new Student("Dan");
//        s2.setRating(3);
//
//        Student s3 = new Student("Charlie",3);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s2.betterStudent(s1));
//        System.out.println(Student.avgRating());



        Employee e1 = new Employee();
        e1.setName("Dan");
        e1.setRate(12);
        e1.setHours(8);

        Employee e2 = new Employee("Wayne");
        e2.setRate(7);
        e2.setHours(9);

        Employee e3 = new Employee("John",6);
        e3.setHours(9);

        Employee e4 = new Employee("Jack",9,8);

        e4.changeRate(8);



        System.out.println(e1);
        System.out.println("Salary = " + e1.salary());
        System.out.println(e2);
        System.out.println("Salary = " + e2.salary());
        System.out.println(e3);
        System.out.println("Salary = " + e3.salary());
        System.out.println(e4);
        System.out.println("Salary = " + e4.salary());
        System.out.println("Bonus = " + e4.bonuses());
        System.out.println("tota sum = " + Employee.getTotalSum());
    }
}
