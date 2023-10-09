package Exception_1.sem_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<Integer> my_list2 = new ArrayList<>();//Arrays.asList(6, 7, 8, 9));
        Random random = new Random();
        int testValue = 11;
        int minSize = 5;



        for (int i = 0; i < 10; i++) {
            my_list2.add(random.nextInt(10, 20));
        }
        my_list2.add(3, null);
        my_list2.add(4, null);

        System.out.println(my_list2);
//        int res = checkArray(my_list2, testValue);
//
//        if (res < 0) System.out.println("Код ошибки: " + res);
//        else System.out.println("Индекс заданного значения: " + res);

        checkArray2(my_list2);


    }

    public static int checkArray(List<Integer> array, int value) {
        if (array.isEmpty()) return -3;
        else {
            if (array.size() < 9) return -1;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).equals(value)) {
                    return i;
                }
            }
            return -2;
        }
    }

    public static void checkArray2(List<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == null){
                System.out.printf("В ячейке с индексом %d имеется пустое значение\n", i);
            }
            else System.out.println("Пустых ячеек не найдено");
        }
    }
}
