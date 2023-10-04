package OOP_seminars.geekbrains_seminar_4.Task_2;

public class Program {
    public static void main(String[] args) {

        Entity entity = new Entity("ООО Рога и копыта", "3578837465");
        DebetAccount<Entity> entityDebetAccount1 = new DebetAccount<>(entity, 2000000);

        Person person1 = new Person("Клиент", "6354678833");
        CreditAccount<Person> CreditAccount1 = new CreditAccount<>(person1, 305);

        Transaction<Account<?>> transaction = new Transaction<>(entityDebetAccount1, CreditAccount1, 30000);
        transaction.execute();


    }


}
