package OOP_seminars.geekbrains_seminar_3.task_1;

public class Programm {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Dog("Быстрый", 500, 20),
                new Dog("Тузик", 500, 20),
                new Dog("Шарик", 500, 25),
                new Dog("Бима", 600, 30),
        };

        for (Animal animal: animals){
            System.out.printf("%d - %s\n", animal.getId(), animal.getName());
            animal.run(400);
            animal.swim(20);
        }

        System.out.println("Счетчик идентификаторов объектов: " + Animal.getIdCounter());
        System.out.println("Было создано животных: " + Animal.getCounter());
        System.out.println("Было создано собак:" + Dog.getCounter());
        System.out.println("Было создано кошек: " + Cat.getCounter());

    }
}
