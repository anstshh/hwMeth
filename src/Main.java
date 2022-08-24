import java.time.LocalDate;

public class Main {
    public static void printYear () {
        int a = 2001;
        if (a % 400 == 0 || a % 100 != 0 && a % 4 == 0) {
            System.out.println(a + " не является высокосным");
        } else {
            System.out.println(a + " является высокосным");
        }

    }

    public static int systemChoice () {
        int ClientOS = 0;
        int currentYear = LocalDate.now().getYear();
        if (ClientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите Lite версию приложения для iOS по ссылке");
        } else {
            if (ClientOS == 1 && currentYear <= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        if (ClientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите Lite версию приложения для Android по ссылке");
        } else {
            if (ClientOS == 0 && currentYear <= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        return ClientOS;

    }

    public static int delivery () {
        int deliveryDistance = 15;
        int deliveringDays = 1;
        if (deliveryDistance <= 20) {
            deliveringDays = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveringDays = deliveringDays + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveringDays = deliveringDays + 2;
        }
        System.out.println("Итоговое количество дней доставки - " + deliveringDays);
        return deliveringDays;
    }

    public static void main (String[] args){
        //tasks 1-3
        printYear();
        systemChoice();
        delivery();

    }
}