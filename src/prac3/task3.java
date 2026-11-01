package prac3;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println("Массив A: " + Arrays.toString(a));
        
        double[] b = calculateSuffixAverages(a);
        System.out.println("Массив B: " + Arrays.toString(b));
    }

    public static double[] calculateSuffixAverages(int[] a) {
        int n = a.length;
        double[] b = new double[n];
        double sum = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            sum += a[i];
            b[i] = sum / (n - i);
        }
        return b;
    }
}
