package OOP_seminars.geekbrains_seminar_4.Task_2;

public class CreditAccount<T extends PersonalData> extends Account<T> {

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
