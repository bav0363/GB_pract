package OOP_seminars.geekbrains_seminar_7.observer;

public class Vacancy {

    private String name;

    public String getName() {
        return name;
    }

    public Vacancy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
