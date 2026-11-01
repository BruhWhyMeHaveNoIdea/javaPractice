package prac2;

public class task4 {
    public static void main(String[] args) {
        double result = splitNumber(12.34);
    }

    static double splitNumber(double num) {
        int integer = (int) num;
        double fraction = num - integer;
        System.out.println("Число: " + num + ", Целая часть: " + integer + ", Дробная часть: " + fraction);
        return fraction;
    }
}
