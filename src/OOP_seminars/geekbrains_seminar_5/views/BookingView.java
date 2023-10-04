package OOP_seminars.geekbrains_seminar_5.views;

import OOP_seminars.geekbrains_seminar_5.models.Table;
import OOP_seminars.geekbrains_seminar_5.presenters.View;
import OOP_seminars.geekbrains_seminar_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    public ViewObserver observer;

    public void showTables(Collection<Table> tables){
        for (Table table:tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReserves(Collection<Table> tables) {
        for (Table table : tables){
            System.out.printf("%s %s\n", table, table.getReservations());
        }
    }


    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printResrvationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони #%d\n", reservationNo);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте позднее.");
        }
    }

    @Override
    public void printChangeResrvationTableResult(int newreservationNo) {
        if (newreservationNo > 0){
            System.out.printf("Ваша бронь успешно аннулирована.\n" +
                    "Номер вашей новой брони #%d\n", newreservationNo);
        }
        else {
            System.out.println("Не удалось перезабронировать столик. Возможно, бронь с таким номером отсутствует. Попробуйте позднее.");
        }

    }

    public void reservationTable(Date orberDate, int tableNo, String name){
        observer.onReservationTable(orberDate, tableNo, name);
    }

    public void changeReservationTable(int oldResrvationID, Date reservationDate, int tableNo, String name){
        observer.onchangeReservationTable(oldResrvationID, reservationDate, tableNo, name);

    }

}
