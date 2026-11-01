package prac2;

public class task3 {
    public static void main(String[] args) {
        int n = 13579; // любое число
        boolean hasOdd = false;

        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                hasOdd = true;
                break;
            }
            n /= 10;
        }
        System.out.println(hasOdd);
    }
}
