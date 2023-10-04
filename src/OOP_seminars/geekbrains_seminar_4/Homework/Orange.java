package OOP_seminars.geekbrains_seminar_4.Homework;

public class Orange extends Fruct{

    protected final String name = "orange";

    public Orange() {
        super(1.5f);
    }
    @Override
    public String toString() {
        return String.format("%s %.1f", name, getWeight());
    }
}
