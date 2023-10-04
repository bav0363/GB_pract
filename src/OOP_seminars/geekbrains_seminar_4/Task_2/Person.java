package OOP_seminars.geekbrains_seminar_4.Task_2;

public class Person implements PersonalData {

    private final String fio;

    private final String inn;

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; ФИО: %s", inn, fio);
    }
}
