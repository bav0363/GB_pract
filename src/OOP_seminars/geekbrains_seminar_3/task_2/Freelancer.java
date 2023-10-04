package OOP_seminars.geekbrains_seminar_3.task_2;

public class Freelancer extends Employee{


    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }
    @Override
    public double calculateSalary() {
        return 176 * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Зарплата %.2f; Возраст %d", surName, name, calculateSalary(), age);
    }
}
