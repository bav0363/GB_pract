package OOP_seminars.geekbrains_seminar_3.task_1;

public class Cat extends Animal {

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Вызван инициализатор Cat");
        counter++;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        System.out.println("Вызван конструктор Cat");
    }

    public Cat(String name) {
        super(name, 200, 0);
        System.out.println("Вызван конструктор Cat");
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", name);
    }
}

