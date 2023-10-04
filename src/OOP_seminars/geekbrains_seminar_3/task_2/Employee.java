package OOP_seminars.geekbrains_seminar_3.task_2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }


    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if(surNameRes == 0){
            return name.compareTo(o.name);
        }
        else {
            return  surNameRes;
        }
    }
}
