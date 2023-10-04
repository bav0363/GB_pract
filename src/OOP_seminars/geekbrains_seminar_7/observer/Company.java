package OOP_seminars.geekbrains_seminar_7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private Vacancy vacancy;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, Vacancy vacancy, int maxSalary) {

        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacancy);
    }
}
