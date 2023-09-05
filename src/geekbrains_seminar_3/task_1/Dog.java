package geekbrains_seminar_3.task_1;

import geekbrains_seminar_3.task_1.Animal;

public class Dog extends Animal {

    private static int counter;

    public static int getCounter() {
        return counter;
    }
    {
        counter++;
    }

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
}
