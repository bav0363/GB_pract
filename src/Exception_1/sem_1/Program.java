package Exception_1.sem_1;

public class Program {
    public static void main(String[] args) {
        exceptions();


    }
    public static void exceptions(){
        try{
            float a = 1/5;

        }
        catch (Exception e){
            //System.exit(130);
            System.out.println("Деление на ноль");

        }
        finally {
            System.out.println("Удачно");
        }
    }
}
