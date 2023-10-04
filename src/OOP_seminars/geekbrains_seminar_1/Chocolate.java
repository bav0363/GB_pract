package OOP_seminars.geekbrains_seminar_1;

public class Chocolate extends Product {

    private double weight;

    public Chocolate(String name, String brand, double price, double weight) {
        super(name, brand, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - m: %.2f", name, brand, price, weight);
    }
}
