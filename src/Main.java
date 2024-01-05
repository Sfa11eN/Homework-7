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
    }
}