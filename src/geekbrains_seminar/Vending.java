package geekbrains_seminar;

import java.util.List;

public class Vending {

    private List<Product> products;

    public Vending(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return  null;
    }

    public BottleOfMilk getBottleOfMilk(String name, double fat){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getFat() == fat){
                    return bottleOfMilk;
                }
            }
        }
        return  null;
    }

    public Chocolate getChocolate(String name, double weight){
        for (Product product: products) {
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getWeight() == weight){
                    return chocolate;
                }
            }
        }
        return  null;
    }







}
