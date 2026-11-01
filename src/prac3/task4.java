package prac3;

public class task4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        int n = matrix.length;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        System.out.print("Элементы: ");
        
        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            for (int i = left; i <= right; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            }

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            }
        }
        System.out.println();
    }
}
