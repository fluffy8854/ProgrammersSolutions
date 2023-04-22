package PSolutions;

import java.util.Scanner;

public class CaseSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String sw = "";

        // String 객체의 n번째 글자(char)를 참조하려면 String.charAt()함수를 사용한다.
        // 형변환으로 문자의 아스키 코드값 구분하기 a - 97 A - 65
        for(int i = 0 ; i < word.length(); i++){
            if((int)word.charAt(i) < 91 && (int)word.charAt(i)> 64){
                // UpperCase 65~90
                sw += Character.toLowerCase(word.charAt(i));
            }
            else if((int)word.charAt(i) < 123 && (int)word.charAt(i)> 96){
                // LowerCase 97~122
                sw += Character.toUpperCase(word.charAt(i));
            }
            else sw +=word.charAt(i);
        }
        System.out.println(sw);
    }
}
