package OOP_seminars.geekbrains_seminar_7.adapter;

public class Main {
    public static void main(String[] args) {

        MeteoStore meteoStore = new MeteoStore();
        MS200 ms200 = new MS200(3445);

        ST500 st500 = new ST500(34485);

        meteoStore.save(ms200);
        meteoStore.save(new AdapterST500(st500));




    }
}
