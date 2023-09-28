package geekbrains_seminar_7.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Student implements Observer{

    private String name;

    private int salary;

    List<Vacancy> desiredVacancies = new ArrayList<>();

    boolean answer = false;
    public Student(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public boolean isAnswer() {
        return answer;
    }
    public List<Vacancy> getDesiredVacancies() {
        return desiredVacancies;
    }
    public void addVacancy(Vacancy vacancy){
        desiredVacancies.add(vacancy);
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: мне нужна эта работа! (компания %s; вакансия %s; зар.плата %d)\n", name, nameCompany, vacancy, salary);
            this.salary = salary;
            answer = true;
        }
        else {
            System.out.printf("Студент %s: я найду работу получше! компания %s; вакансия %s; зар.плата %d)\n", name, nameCompany, vacancy, salary);
        }
    }
    @Override
    public String toString() {
        return name;
    }
}
