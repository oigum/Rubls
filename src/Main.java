package PACKAGE_NAME;

public class Main {
    public static void main(String[] args) {
        int account = 300; // начальный счет
        int amount = 1500; // сумма пополнения

        int bonus = 0;
        if (amount > 1000) { // условие начисления бонусов
            bonus = amount / 100; // кол-во начисленных бонусов
        }
        int finalAccount = account + amount + bonus; // итоговая сумма счета

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус:" + bonus);
    }
}
