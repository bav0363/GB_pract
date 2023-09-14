package geekbrains_seminar_4.Task_2;

public class Entity implements PersonalData{

    private final String name;

    private final String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; Наименование: %s", inn, name);
    }
}
