package geekbrains_seminar_3.task_2;

public class Worker extends Employee{


    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Зарплата %.2f; Возраст %d", surName, name, calculateSalary(), age);
    }


}
