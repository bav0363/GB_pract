package geekbrains_seminar_7.singleton;

public class Settings {
    private String param1;
    private int param2;
    private boolean param3;
    private static Settings instance;

    protected Settings() {
    }

    protected Settings(String param1, int param2, boolean param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }

    public static Settings getInstance() {
        if (instance == null){
            instance = new Settings();
            //Получить настройки , проинициализировать поля объекта
        }
        return instance;
    }
}
