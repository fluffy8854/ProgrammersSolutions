package PSolutions;

import java.util.Scanner;

public class PrintAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // printf 메서드로 값 넣기, 개행문자 \n
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d", b);
    }
}