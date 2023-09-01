package geekbrains_seminar_2;

public class  Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(String name){
        System.out.println("Кот " + name +  " ест ...");;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println(("Кличка: " + name + ", аппетит: " + appetite + ", сытость: " + satiety));
    }

}
