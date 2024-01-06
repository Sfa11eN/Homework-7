// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы урок 2");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задание 1");
        int amountPurpose = 2459000;
        int monthAmount = 15000;
        int month = 1;
        double monthlyPercent = 0.01;
        float total = 0;

        while (total <= amountPurpose) {
            total += monthAmount + total * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, total);
            month++;
        }
    }

    private static void task2() {
        System.out.println("Задание 2");

        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter + " ");
            counter++;
        }

        System.out.println();


        for (int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        int humanPopulation = 12000000;
        float countBirth = (float) 17 / 1000;
        float countDeath = (float) 8 / 1000;
        for (int year = 1; year < 11; year++) {
            humanPopulation = (int) (humanPopulation + (humanPopulation * countBirth) - (humanPopulation * countDeath));
            System.out.printf("Год %d, численность населения составляет %d%n ", year, humanPopulation);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        int target = 12000000;
        int moneyPerMonth = 15000;
        int period = 1;
        double percentByMonth = 0.07;
        float finalTotal = 0;

        while (finalTotal <= target) {
            finalTotal += moneyPerMonth + finalTotal * percentByMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", period, finalTotal);
            period++;
        }
    }

    private static void task5() {

        System.out.println("Задание 5");
        double percent = 1.07;
        int sum = 15000;
        int month = 1;

        while (sum <= 12000000) {
//            sum *= percent;
            sum = (int) (sum * percent);
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " накоплений " + sum);
            }
            month++;
        }


    }

    private static void task6() {
        System.out.println("Задание 6");
        double percent = 1.07;
        int sum = 15000;
        int month = 1;

        while (month <= 108) {
            sum *= percent;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " накоплений " + sum);
            }
            month++;
        }
    }

    private static void task7() {
        System.out.println("Задание 7");
        int friday = 5;
        int firstDayMonth = 1;
        while (firstDayMonth <= 26) {
            if (firstDayMonth % friday == 0) {
                System.out.println("Сегодня пятница," + firstDayMonth + "е число. Необходимо подготовить отчет");
            }
            firstDayMonth++;
        }
    }

    private static void task8() {
        System.out.println("Задание 8");
        int period = 79;
        int realTime = 2024;
        int firstAction = realTime - 200;
        int lastAction = realTime + 100;

        for (int i = firstAction; i < lastAction; i++) {
            if(i%period==0){
                System.out.println(i);
            }
        }
    }
}