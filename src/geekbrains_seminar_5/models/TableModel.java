package geekbrains_seminar_5.models;

import geekbrains_seminar_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    public void view(){
        for (Table table : loadTables()){
            System.out.println(table.getReservations());
        }
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int changeReservationTable(int oldResrvationID, Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldResrvationID) {
                    table.deleteReservation();
                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        }
        return -1;
    }
}