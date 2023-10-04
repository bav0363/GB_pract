package OOP_seminars.geekbrains_seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Program_vending {
    public static void checkRezult(Product name){
        if (name != null){
            System.out.println("Выданный товар:");
            System.out.println(name.displayInfo());
        }
        else {
            System.out.println("Такого товара в автомате нет!");
        }
    }
    public static void main(String[] args) {

        Product product_1 = new BottleOfWater("Бутылка с водой", "Источник", 150, 1.5);
        Product product_2 = new BottleOfWater("Бутылка с водой", "Источник", 200, 2.5);

        Product product_3 = new BottleOfMilk("Бутылка с молоком", "Молоко", 200, 0.9, 2.5);
        Product product_4 = new BottleOfMilk("Бутылка с молоком", "Молоко", 250, 0.9, 3.2);

        Product product_5 = new Chocolate("Шоколад", "snickers", 150, 80);
        Product product_6 = new Chocolate("Шоколад", "bounty", 170, 100);

        List<Product> products = new ArrayList<>();
        products.add(product_1);
        products.add(product_2);
        products.add(product_3);
        products.add(product_4);
        products.add(product_5);
        products.add(product_6);

        for (Product product: products) {
            System.out.println(product.displayInfo());
        }

        System.out.println("------------------------");

        Vending vending_product = new Vending(products);

        BottleOfWater bottleOfWater = vending_product.getBottleOfWater("Бутылка с водой", 2.5);
        checkRezult(bottleOfWater);

        BottleOfMilk bottleOfMilk = vending_product.getBottleOfMilk("Бутылка с молоком", 2.5);
        checkRezult(bottleOfMilk);

        Chocolate chocolate = vending_product.getChocolate("Шоколад", 80);
        checkRezult(chocolate);
    }
}
