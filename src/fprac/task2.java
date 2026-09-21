package fprac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = -16*(int)Math.pow(x, 5)+(int)Math.pow(x, 4)-(23*x)-55;
        System.out.println(y)
    }
}