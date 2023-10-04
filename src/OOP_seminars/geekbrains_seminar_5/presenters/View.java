package OOP_seminars.geekbrains_seminar_5.presenters;

import OOP_seminars.geekbrains_seminar_5.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);
    void showReserves(Collection<Table> tables);

    void setObserver(ViewObserver observer);

    void printResrvationTableResult(int reservationNo);

    void printChangeResrvationTableResult(int reservationNo);





}
