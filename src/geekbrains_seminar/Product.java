package geekbrains_seminar;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product(){
        this("Noname");
    }

    public Product(String name){
        this(name, "Noname");
    }

    public Product(String name, String brand){
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price){
        checkName(name);
        checkBrand(brand);
        checkPrice(price);
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "Noname";
        }
        else {
            this.name = name;
        }
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "Nobrand";
        }
        else {
            this.brand = brand;
        }
    }

    private void checkPrice(double price){
        if (price < 100){
            this.price = 100;
        }
        else {
            this.price = price;
        }
    }



}
