package OOP_seminars.geekbrains_seminar_4.Homework;


import java.util.ArrayList;

public class Box<T extends Fruct> {
    private ArrayList<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }
    public void addToBox(T e){
        fructs.add(e);
    }
    public float getWeightBox(){
        return fructs.size() * fructs.get(0).getWeight();
    }
    @Override
    public String toString() {
        return "Box: " + fructs;
    }
    public void merge(Box<T> box){
        for (int i = fructs.size() - 1; i > -1; i--){
            box.addToBox(fructs.get(i));
            fructs.remove(i);
        }
    }
    public boolean compare(Box box){
        if (fructs.size() * fructs.get(0).getWeight() == box.getWeightBox()){
            return true;
        }
        else {
            return false;
        }
    }
}
