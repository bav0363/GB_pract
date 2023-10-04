package OOP_seminars.geekbrains_seminar_4.Homework;

public class Apple extends Fruct{

    protected final String name = "apple";

    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return String.format("%s %.1f", name, getWeight());
    }
}
