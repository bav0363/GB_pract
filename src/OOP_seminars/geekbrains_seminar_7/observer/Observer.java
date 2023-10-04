package OOP_seminars.geekbrains_seminar_7.observer;

import java.util.List;

public interface Observer {

    void receiveOffer(String nameCompany, int salary, Vacancy vacancy);

    boolean isAnswer();

    void addVacancy(Vacancy vacancy);

    List<Vacancy> getDesiredVacancies();

}
