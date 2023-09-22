package geekbrains_seminar_6.srp2;

public class Program {

    //Переработать приложение с учетом принципа SPR


    public static void main(String[] args) {

        Order order = new Order();
        order.inputFromConsole();
        System.out.println(order);

        SaveToJson saveToJson = new SaveToJson();
        saveToJson.saveToJson(order);



    }
}
