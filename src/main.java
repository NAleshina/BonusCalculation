public class main {
    public static void main(String[] args) {
        int cash = 2000;
        int balans = 100;
        int bonus;
        int total;
        if (cash > 1000) {
            bonus = cash / 100;
            total = balans + cash + bonus;
            System.out.println("Вам начислено " + bonus +" бонусов" );
        }
        else {
            total = balans + cash;
        }
        System.out.println("Итоговый баланс: " + total);
    }
}
