package geekbrains_seminar_6.lsp;

import java.util.ArrayList;
import java.util.List;

public class Programm {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();

        Penguin penguin = new Penguin();

        List<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(duck1);
        birds.add(duck2);
        birds.add(duck3);
        birds.add(penguin);

        processFly(birds);

    }

    public static void processFly(List<Bird> birds){
        for (Bird bird: birds){
            if (bird.canFly) {
                bird.fly();
            }
        }
    }
}
