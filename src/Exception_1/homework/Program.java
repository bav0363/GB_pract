package Exception_1.homework;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.


//        boolean flag = false;
//        while (!flag){
//            try {
//                System.out.println(inputFromConsole());
//                flag = true;
//            }
//            catch (NumberFormatException e){
//                System.out.println("Введено неккоректное значение. Повторите ввод");
//            }
//        }

        //Задание 2. Исправьте код
//        try {
//            int[] intArray = new int[8];
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("Выход за пределы массива");
//        }

        //Задание 3. Исправьте код

//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 7);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        }

        //Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

        //emptyString();



}
    public static float inputFromConsole(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float value = Float.parseFloat(in.nextLine());
        return value;
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    public static void emptyString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String str = in.nextLine();
        if (str.isEmpty()){
            System.out.println("Пустые строки вводить нельзя.");
        }
        else {
            System.out.println("Данные введны корректно.");
        }


    }

}
