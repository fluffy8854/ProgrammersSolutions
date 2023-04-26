package PSolutions;

public class DiceGame2 {


    public static void main(String[] args) {
        DiceGame2 dg2 = new DiceGame2();
        System.out.println(dg2.diceScore( 1 ,3,5));

    }

    public int diceScore(int a, int b, int c) {
        int answer = 0;


            // 세 숫자 모두 다를 때
            if( a != b && b != c && c != a){
                answer += (a+b+c);
            }
            // 세 숫자 중 두개가 같고 하나가 다를 때
            else if( a == b && a!= c && b !=c){
                answer += ((a+b+c)*(a*a+b*b+c*c));
            }
            else if( a == c && a!= b && c !=b){
                answer += ((a+b+c)*(a*a+b*b+c*c));
            }
            else if( b == c && c!= a && b !=a){
                answer += ((a+b+c)*(a*a+b*b+c*c));
            }
            // 세 숫자 모두 같을 때
            else if( a == b && b == c){
                answer += ((a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c));
            }


        return answer;
    }
}
