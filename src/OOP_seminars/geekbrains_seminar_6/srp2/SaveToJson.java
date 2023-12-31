package OOP_seminars.geekbrains_seminar_6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    //region Public Methods
    public void saveToJson(Order order) {
        String fileName = "order1.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //endregion



}
