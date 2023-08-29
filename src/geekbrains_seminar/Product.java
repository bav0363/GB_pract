package geekbrains_seminar;

public class Product {
    String name;
    String brand;
    double price;

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
        this.name = name;
        this.brand = brand;
        this.price = price;

    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }



}
