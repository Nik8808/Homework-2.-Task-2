public class Main {
    public static void main(String[] args) {

        int check = 100;
        int replenished = 1100;
        int bonusRuble = 100;
        int minimum = 1000;

        int bonus;
        if (replenished >= minimum) {
            bonus = replenished / bonusRuble;
        } else {
            bonus = 0;
        }
        System.out.println("Начислено бонусов:");
        System.out.println(bonus);
        System.out.println("Счет:");
        System.out.println(check + replenished + bonus + "р");
        
    }
}