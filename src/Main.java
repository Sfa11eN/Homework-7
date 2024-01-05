// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Циклы урок 2");

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
        System.out.println("Задание 2");

        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter + " ");
            counter++;
        }

        System.out.println();


        for (int i = 10; i > 0; i--) {
            System.out.println(i+" ");
        }
        System.out.println("Задание 3");
        int humanPopulation=12000000;
        float countBirth=(float) 17/1000;
        float countDeath=(float) 8/1000;
        for (int year=1; year<11; year++){
            humanPopulation=(int) (humanPopulation+(humanPopulation*countBirth)-(humanPopulation*countDeath));
            System.out.printf("Год %d, численность населения составляет %d%n " ,year,humanPopulation);
        }

    }
}