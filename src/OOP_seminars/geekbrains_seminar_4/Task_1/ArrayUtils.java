package OOP_seminars.geekbrains_seminar_4.Task_1;

public class ArrayUtils {

    public static <T> T[] replaceTwoElements(T[] array, int index1, int index2){
        if(index1 >= array.length || index2>= array.length || index1 <0 || index2 < 0)
            throw new IndexOutOfBoundsException();
        T[] newArray = array.clone();
        T obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }

}
