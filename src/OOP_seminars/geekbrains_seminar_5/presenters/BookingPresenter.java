package OOP_seminars.geekbrains_seminar_5.presenters;

import OOP_seminars.geekbrains_seminar_5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void updateTablesUI(){
        bookingView.showTables(loadTables());
    }

    public void updateReservesUI(){
        bookingView.showReserves(loadTables());
    }


    public void updateReservationResultUI(int reservationID){
        bookingView.printResrvationTableResult(reservationID);
    }
    public void updateChangeReservationResultUI(int newreservationID){
        bookingView.printChangeResrvationTableResult(newreservationID);
    }


    @Override
    public void onReservationTable(Date orberDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orberDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }

    @Override
    public void onchangeReservationTable(int oldResrvationID, Date reservationDate, int tableNo, String name) {
        int newreservationNo = tableModel.changeReservationTable(oldResrvationID, reservationDate, tableNo, name);
        updateChangeReservationResultUI(newreservationNo);
    }
}
