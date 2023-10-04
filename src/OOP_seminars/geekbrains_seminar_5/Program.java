package OOP_seminars.geekbrains_seminar_5;

import OOP_seminars.geekbrains_seminar_5.models.TableModel;
import OOP_seminars.geekbrains_seminar_5.presenters.BookingPresenter;
import OOP_seminars.geekbrains_seminar_5.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);


        System.out.println("Доступные столы для резервирования:\n");
        bookingPresenter.updateTablesUI();

        System.out.println("______________");
        System.out.println("Бронирование...");
        view.reservationTable(new Date(23), 4, "Andry");

        System.out.println("______________");
        System.out.println("Список имеющихся резервов:\n");
        bookingPresenter.updateReservesUI();

        System.out.println("______________");
        System.out.println("Повторное бронирование:");
        view.changeReservationTable(101, new Date(), 2, "Sergei");
        System.out.println("______________");

        System.out.println("Актуальный список резервов:\n");
        bookingPresenter.updateReservesUI();


    }
}
