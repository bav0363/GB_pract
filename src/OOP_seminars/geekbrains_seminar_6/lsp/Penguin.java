package OOP_seminars.geekbrains_seminar_6.lsp;

public class Penguin extends Bird{

    public Penguin() {
        canFly = false;
        flySpeed = 15;
    }

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать");
        //System.out.printf("Пингвин летит со скоростью %d\n", flySpeed);;
    }



}
