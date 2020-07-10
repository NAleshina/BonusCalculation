public class Main {
    public static void main(String[] args) {
        float cash = 100.7F;
        float balans = 100;
        int bonus;
        float total;
        if (cash > 1000) {
            bonus = (int) cash / 100;
            total = balans + cash + bonus;
            System.out.println("Вам начислено " + bonus +" бонусов" );
        }
        else {
            total = balans + cash;
        }
        System.out.println("Итоговый баланс: " + total);
    }
}
