package geekbrains_seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat_1 = new Cat("Барсик", 15);
        Cat cat_2 = new Cat("Пушок", 10);
        Cat cat_3 = new Cat("Рыжик", 25);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat_1);
        cats.add(cat_2);
        cats.add(cat_3);

        for (Cat cat: cats) {
            cat.info();
        }
        System.out.println();

        Plate plate = new Plate(15);
        plate.info();

        System.out.println("__________");
        System.out.println("Коты, поешьте.....");
        System.out.println();

        for (Cat cat: cats) {
            while (cat.isSatiety() == false){
               if(plate.getFood() < cat.getAppetite()){
                   System.out.println("Хозяин, в тарелке недостаточно корма! Насыпь еще!");
                   plate.add_food();
                   System.out.println("Корма добавил, не мяукай!");
               }
               else {
                   cat.setSatiety(true);
                   cat.eat(cat.getName());
                   System.out.println(cat.getName() + " наелся. " + "Сытость " + cat.isSatiety());
                   plate.setFood(plate.getFood() - cat.getAppetite());
               }
            }
        }
        System.out.println();
        plate.info();
    }

}
