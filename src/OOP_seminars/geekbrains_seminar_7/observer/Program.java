package OOP_seminars.geekbrains_seminar_7.observer;

public class Program {
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency("Агенство кадров №1");

        Observer student1 = new Student("Petrov", 2_000);
        Observer student2 = new Student("nePetrov", 5_000);
        Observer master1 = new Master("Ivanov", 40_000);
        Observer master2 = new Master("neIvanov", 55_000);
        Observer senior1 = new Senior("Sidorov", 120_000);
        Observer senior2 = new Senior("neSidorov", 150_000);

        Vacancy vacancies1 = new Vacancy("Стажер");
        Vacancy vacancies2 = new Vacancy("Тестировщик");
        Vacancy vacancies3 = new Vacancy("Разработчик");

        student1.addVacancy(vacancies1);
        student2.addVacancy(vacancies2);
        master1.addVacancy(vacancies2);
        master1.addVacancy(vacancies3);
        master2.addVacancy(vacancies2);
        senior1.addVacancy(vacancies3);
        senior2.addVacancy(vacancies3);

        Company google = new Company("Google", jobAgency,vacancies3, 140_000);
        Company yandex = new Company("Yandex", jobAgency, vacancies2, 95_000);
        Company geekBrains = new Company("GeekBrains", jobAgency, vacancies1,  58_000);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(senior1);
        jobAgency.registerObserver(senior2);

        for (int i = 0; i < 1; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
