package OOP_seminars.geekbrains_seminar_3.task_1;

public abstract class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    private int id;

    private static int idCounter;
    private static int counter;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println("Вызван инициализатор Animal static");
    }

    {
        System.out.println("Вызван инициализатор Animal");
        id = ++idCounter;
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Вызван конструктор Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
    public void run(int distance){
        if(distance < maxRun){
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }
    }
    public void swim(int distance){
        if(distance < maxSwim){
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }
}
