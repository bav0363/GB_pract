package OOP_seminars.geekbrains_seminar_4.Homework;

import java.util.ArrayList;

public class Program {
    public static<T extends Fruct> void fillBox(T e, Box<T> box, int quantity){
        /**
         * T e = new T(); Почему таким образом нельзя создать новый объект в рамках метода?
         * */
        for (int i = 0; i < quantity; i++){
            box.addToBox(e);
        }
    }

    public static void main(String[] args) {
        /**
         * Засыпем ящики фруктами (В один ящик не получится засыпать разные фрукты).
         * Затем доложим в каждый ящик еще по одному фрукту.
         * И определим массу каждого ящика.
         * */
        Box<Apple> box_1 = new Box(new ArrayList<Apple>());
        Box<Apple> box_2 = new Box<Apple>(new ArrayList<>());
        Box<Orange> box_3 = new Box<Orange>(new ArrayList<Orange>());

        fillBox(new Apple(), box_1, 5);
        box_1.addToBox(new Apple());
        System.out.println(box_1);
        System.out.println("Масса коробки: " + box_1.getWeightBox());

        fillBox(new Apple(), box_2, 4);
        box_2.addToBox(new Apple());
        System.out.println(box_2);
        System.out.println("Масса коробки: " + box_2.getWeightBox());

        fillBox(new Orange(), box_3, 6);
        box_3.addToBox(new Orange());
        System.out.println(box_3);
        System.out.println("Масса коробки: " + box_3.getWeightBox());
        System.out.println("________________");

        /**
         * Сравним по массе ящики между собой
         * */
        System.out.println(box_1.compare(box_1));
        System.out.println(box_1.compare(box_3));
        System.out.println(box_2.compare(box_1));
        System.out.println(box_3.compare(box_2));
        System.out.println("________________");

        /**
         * Пересыпем фрукты из одной коробки в другую (В один ящик не получится пересыпать разные фрукты).
         * */

        box_1.merge(box_2);

        System.out.println(box_1);
        System.out.println(box_2);
    }
}
