package geekbrains_seminar_2;

public class  Cat {

    private String name;

    private int appetite;

    private boolean satiety;


    public Cat(String name){
        this(name, 15);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        if(plate.decreaseFood(this.appetite)){
            System.out.println("Кот " + this.name + " покушал с аппетитом " + this.appetite);
            this.satiety = true;
        } else {
            System.out.println("Кот " + this.name + " не будет есть. Мало еды!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s, Аппетит: %d, Сытость: %b", name, appetite, satiety);
    }
}
