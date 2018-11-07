/**
 * Created by annakitchak on 21.10.18.
 */
public class Appl {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Dan");
        p1.setBirthYear(1987);

        p1.output();

        Person p2 = new Person();
        p2.input();
        p2.output();
        System.out.println(p2.age());
        p2.changeName();
        p2.output();
    }
}
