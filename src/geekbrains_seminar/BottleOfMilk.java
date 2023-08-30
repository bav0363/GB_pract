package geekbrains_seminar;

public class BottleOfMilk extends Product{

    private double volume;
    private  double fat;

    public BottleOfMilk(String name, String brand, double price, double volume, double fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - v: %.2f - f: %.1f", name, brand, price, volume, fat);
    }
}
