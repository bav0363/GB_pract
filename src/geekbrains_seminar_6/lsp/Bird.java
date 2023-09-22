package geekbrains_seminar_6.lsp;

public class Bird {
    protected int flySpeed = 10;

    protected boolean canFly = true;

    public boolean isCanFly() {
        return canFly;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void fly(){
        System.out.printf("Птица летит со скоростью %d\n", flySpeed);
    }

}
