package geekbrains_seminar_5.presenters;

import geekbrains_seminar_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date resrvationDate, int tableNo, String name);

    int changeReservationTable(int oldResrvationID, Date reservationDate, int tableNo, String name);
}
