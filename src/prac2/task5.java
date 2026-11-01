package prac2;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n1. Выполнить расчёт\n2. О программе\n3. О разработчике\n0. Выход");
            System.out.print("Выбор: ");

            while (!sc.hasNextInt()) {
                System.out.print("Введите число: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1: calculate(); break;
                case 2: System.out.println("Программа считает косинус."); break;
                case 3: System.out.println("райан гослинг"); break;
                case 0: System.out.println("Выходим.."); break;
                default: System.out.println("Некорректный ввод");
            }
        }
        sc.close();
    }

    static void calculate() {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        int n = 0;

        System.out.print("Введите X: ");
        while (!sc.hasNextDouble()) { sc.next(); }
        x = sc.nextDouble();

        System.out.print("Введите N (>0): ");
        while (!sc.hasNextInt()) { sc.next(); }
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть > 0.");
            return;
        }

        double sum = 1.0, term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= -x * x / ((2 * i - 1) * (2 * i));
            sum += term;
        }
        System.out.printf("Результат: %.4f\n", sum);
    }
}
