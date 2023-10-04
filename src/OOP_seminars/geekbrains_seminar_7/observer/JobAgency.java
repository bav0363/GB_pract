package OOP_seminars.geekbrains_seminar_7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private String nameAgency;

    List<Observer> observers = new ArrayList<>();

    public JobAgency(String name) {
        this.nameAgency = name;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary, Vacancy vacancy) {
        for (Observer observer: observers){
            if(observer.getDesiredVacancies().contains(vacancy)){
                observer.receiveOffer(companyName, salary, vacancy);
            }
        }
        for (int i = observers.size() -1; i > -1; i--){
            if (observers.get(i).isAnswer()){
                removeObserver(observers.get(i));
            }
        }
        System.out.println("__________");
        System.out.println("Список оставшихся соискателей после рассылки: " + observers);
        System.out.println();
    }

}

