package PSolutions;

import java.util.Scanner;

public class StringLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int i = 0;

        // 반복문으로 문자열 반복출력
        while(i<n){
            System.out.printf(str);
            i++;
        }
    }
}
