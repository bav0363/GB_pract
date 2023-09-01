package geekbrains_seminar_2;

public class Plate {
    private int food;
    private int additive = 20;
    public Plate(int food) {
        check_plate(food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        check_plate(food);
    }

    public void info() {
        System.out.println("Кол-во корма в тарелке: " + food);
    }

    public void add_food(){
        setFood(getFood() + additive);
    }

    private void check_plate(int food){
        if (food < 0){
            System.out.println("В тарелке мало корма!!!");
        }
        else {
            this.food = food;
        }
    }
}
