package geekbrains_seminar_7.observer;

import java.util.ArrayList;
import java.util.List;

public class Senior implements Observer {
    private String name;

    private int salary;

    boolean answer = false;

    List<Vacancy> desiredVacancies = new ArrayList<>();

    public Senior(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean isAnswer() {
        return answer;
    }

    public void addVacancy(Vacancy vacancy) {
        desiredVacancies.add(vacancy);
    }

    @Override
    public List<Vacancy> getDesiredVacancies() {
        return desiredVacancies;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary) {
            System.out.printf("Сеньор %s: мне нужна эта работа! компания %s; вакансия %s; зар.плата %d)\n", name, nameCompany, vacancy, salary);
            this.salary = salary;
            answer = true;
        } else {
            System.out.printf("Сеньор %s: я найду работу получше! компания %s; вакансия %s; зар.плата %d)\n", name, nameCompany, vacancy, salary);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
