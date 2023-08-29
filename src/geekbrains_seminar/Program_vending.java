package geekbrains_seminar;

public class Program_vending {
    public static void main(String[] args) {
        Product product_1 = new Product();
        product_1.name = "Product_1";
        product_1.brand = "Brand_1";
        product_1.price = 200;
        System.out.println(product_1.displayInfo());

        Product product_2 = new Product("Product_2", "Brand_2", 300);
        System.out.println(product_2.displayInfo());

        Product product_3 = new Product();
        System.out.println(product_3.displayInfo());


    }
}
