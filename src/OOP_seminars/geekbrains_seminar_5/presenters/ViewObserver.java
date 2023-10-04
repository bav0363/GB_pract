package OOP_seminars.geekbrains_seminar_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orberDate, int tableNo, String name);

    void onchangeReservationTable(int oldResrvationID, Date reservationDate, int tableNo, String name);
}
