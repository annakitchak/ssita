import java.util.Comparator;

/**
 * Created by annakitchak on 24.10.18.
 */
public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.getSalary()-e2.getSalary();
    }
}
