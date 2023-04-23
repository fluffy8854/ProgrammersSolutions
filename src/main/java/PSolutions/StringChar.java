package PSolutions;

import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0 ; i<a.length() ; i++){
            System.out.printf("%c\n",a.charAt(i));
    }
}
}
