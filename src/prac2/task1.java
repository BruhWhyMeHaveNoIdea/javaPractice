package prac2;

public class task1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i += 5) {
            System.out.printf("cos(%d°) = %.4f\n", i, Math.cos(Math.toRadians(i)));
        }
    }
}
