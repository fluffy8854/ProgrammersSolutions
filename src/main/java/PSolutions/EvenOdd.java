package PSolutions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("%d is even",num);
        }
        else if(num % 2 == 1){
            System.out.printf("%d is odd",num);
        }
        else System.out.println("not natural number");

    }
}
