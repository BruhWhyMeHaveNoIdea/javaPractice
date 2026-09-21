package fprac;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вычисление площади на основе трех сторон.");
        System.out.println("Введите три стороны.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сторона A:");
        double a = scanner.nextDouble();
        System.out.println("Сторона B:");
        double b = scanner.nextDouble();
        System.out.println("Сторона С:");
        double c = scanner.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Одна из сторон <= 0.");
            System.exit(0);
        }
        double[] myArray = {a, b, c};
        Arrays.sort(myArray);

        if ((myArray[0] + myArray[1]) <= myArray[2]) {
            System.out.println("Неверные стороны треугольника.");
            System.exit(0);
        }

        double p = (a+b+c)/2.0;

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь: %.2f".formatted(s));
        scanner.close();
    }
}