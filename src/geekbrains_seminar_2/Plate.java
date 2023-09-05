package geekbrains_seminar_2;

public class Plate {
    private int food; //Кол-во еды в тарелке.
    public void putFood (int amount){ // Метод добавления еду в тарелку.
        this.food += amount;
        System.out.printf("Добавлено %d еды в тарелку, теперь в тарелке %d еды\n", amount, food);
    }
    public boolean decreaseFood(int amount){ // Метод убывания еды из тарелки
        if(this.food < amount){
            System.out.println("Недостаточно еды");
            return false;
        }
        this.food -= amount;
        System.out.printf("Убыло %d еды из тарелки, теперь в тарелке %d еды\n", amount, food);
        return true;
    }
}
