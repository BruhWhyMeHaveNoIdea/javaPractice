package prac3;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60}; 
        
        for (int i = 1; i < a.length; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
