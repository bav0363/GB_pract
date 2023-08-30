package geekbrains_seminar;

public class BottleOfWater extends Product{

    private double volume;

    public BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - v: %.2f", name, brand, price, volume);
    }
}
