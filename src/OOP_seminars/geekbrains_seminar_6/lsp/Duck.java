package OOP_seminars.geekbrains_seminar_6.lsp;

public class Duck extends Bird{

    public Duck() {
        flySpeed = 15;
    }

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d\n", flySpeed);;
    }

}
