package prac2;

public class task2 {
    public static void main(String[] args) {
        double x = 1.5;
        int n = 10;
        double sum = 1.0, term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= -x * x / ((2 * i - 1) * (2 * i));
            sum += term;
        }
        System.out.println("Приближенное значение: " + sum);
    }
}
