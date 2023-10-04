package OOP_seminars.geekbrains_seminar_3.task_2;

import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}
