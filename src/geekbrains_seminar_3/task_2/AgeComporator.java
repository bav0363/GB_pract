package geekbrains_seminar_3.task_2;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
