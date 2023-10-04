package OOP_seminars.geekbrains_seminar_4.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(15);
        arrayList1.add(-1);

        Employee employee = new Employee("Name", 23);
        System.out.println(employee);

        System.out.println("______________");

        ArrayList arrayList = new ArrayList();
        arrayList.add(employee);
        arrayList.add(12345);
        arrayList.add("SDFGHJK");

        System.out.println(arrayList);

        System.out.println("______________");

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[10]);
        myArrayList.add(employee);
        //myArrayList.add(15);
        //myArrayList.add("Hello");
        System.out.println(myArrayList);
        System.out.println("Кол-во элементов в коллекции: " + myArrayList.size());

        System.out.println("_______________");

        for (Object e: myArrayList){
            if (e != null) {
                if (e instanceof Employee){
                    Employee employee1 = (Employee) e;
                    System.out.println(employee1.getAge());
                }
            }
        }

        Integer[] array1 = new Integer[] { 0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        String[] array2 = new String[] {"AA", "BB", "CC", "DD"};

        String[] array3 = ArrayUtils.replaceTwoElements(array2, 1, 3);
        System.out.println(Arrays.toString(array3));



    }
}
