package OOP_seminars.geekbrains_seminar_7.builder;

public class Program {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder
                .append("DDD")
                .append("HGF")
                .insert(2, "fghj")
                .append("ghjk")
                .toString();
        System.out.println(s);


        Order order = new OrderBuilder()
                .setProductId(10012)
                .setProductName("AAAAAA")
                .setQnt(2)
                .setPrice(100.15)
                .setClientName("BBBBBBB")
                .build();

        System.out.println(order);



    }
}
