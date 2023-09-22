package geekbrains_seminar_6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    // region Fields
    private String clientName;
    private String product;
    private int qnt;
    private int price;
    //endregion

    // region Constructors
    public Order(){
    }
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    //endregion

    //region Public Getters And Setters (Properties)
    public String getClientName() {
        return clientName;
    }
    public String getProduct() {
        return product;
    }
    public int getQnt() {
        return qnt;
    }
    public int getPrice() {
        return price;
    }
    //endregion

    //region Public Methods
    private String prompt (String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }
    //endregion


}
