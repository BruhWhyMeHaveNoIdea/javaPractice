package prac3;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 8, 4, 2, 2, 2, 9, 4};
        
        System.out.println("Макс. один. элементов" + findMaxIdentical(arr));
    }

    public static int findMaxIdentical(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        Arrays.sort(arr);
        
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 1;
            }
        }
        
        return Math.max(maxCount, currentCount);
    }
}
