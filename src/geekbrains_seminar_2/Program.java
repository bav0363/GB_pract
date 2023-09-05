package geekbrains_seminar_2;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик"),
                new Cat("Персик", 12),
                new Cat("Борис", 14)
        };

        Plate plate = new Plate();
        plate.putFood(35);

        System.out.println("Прибежали голодные коты ...");
        System.out.println("____________");

        for (Cat cat: cats) {
            System.out.println(cat);
        }
        System.out.println("____________");

        for (Cat cat_eat: cats){
            System.out.println("Прибежал кот " + cat_eat.getName());
            cat_eat.eat(plate);
        }
        System.out.println("____________");

        for (Cat cat_satiety: cats){
            System.out.println("Кот " + cat_satiety.getName() + " сытость:" + cat_satiety.isSatiety());
        }




    }
}
