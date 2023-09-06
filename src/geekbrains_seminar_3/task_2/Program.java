package geekbrains_seminar_3.task_2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndexFrelance = random.nextInt(1000, 1500);
        int salaryIndexWorker = random.nextInt(170000, 250000);
        int age = random.nextInt(18, 55);
        int type = random.nextInt(1,3);

        if (type == 1){
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryIndexWorker, age);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryIndexFrelance, age);
        }
    }

    public static Employee[] generateEmployee(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }
    public static void main(String[] args) {

        Employee[] employees = generateEmployee(12);
        for (Employee employee: employees){
            System.out.println(employee);
        }
        System.out.println("_______________");

        Arrays.sort(employees, new AgeComporator());
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
