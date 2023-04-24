package PSolutions;

public class DiceGame3 {


    public int diceScore(int a, int b, int c, int d){
        int score;

        if( a == b && b == c && c == d ){        // 4개의 주사위가 같은 수 일때
            score = 1111 * a;
        }
        else if ( a!=b && b == c && c == d){     // 4개의 주사위중 3개가 같은 수 일때
            score = (int)Math.pow((b * 10 + a),2);
        }
        else if ( b!=a && a == c && c == d){
            score = (int)Math.pow((a * 10 + b),2);
        }
        else if ( c!=b && a == b && b == d){
            score = (int)Math.pow((a * 10 + c),2);
        }
        else if ( d!=b && b == c && c == a){
            score = (int)Math.pow((a * 10 + d),2);
        }
        else if ( a == b && c == d){            // 4개의 주사위중 2개 2개씩 같은수가 나왔을 때
            score = (a + c) * Math.abs( a - c );
        }
        else if ( a == c && b == d){
            score = (a + b) * Math.abs( a - b );
        }
        else if ( a == d && b == c){
            score = (a + b) * Math.abs( a - b );
        }
        else if ( a == b && c != d){            // 4개의 주사위중 2개 같은수가 나오고 나머지가 다른 수가 나왔을 때
            score = c * d;
        }
        else if ( a == c && b != d){
            score = b * d;
        }
        else if ( a == d && b != c){
            score = b * c;
        }
        else if ( b == c && a != d){
            score = a * d;
        }
        else if ( b == d && a != c){
            score = a * c;
        }
        else if ( c == d && a != b){
            score = a * b;
        }
        else if( a != b && a != c && a != d && b != c && b != d && c != d){ // 4개 주사위가 모두 다른 수 일떄
            score = a;
            if( score > b) score = b;
            if( score > c) score = c;
            if( score > d) score = d;
        }
        else score = -1;

        return score;
    }




    public static void main(String[] args) {
        DiceGame3 dg = new DiceGame3();
        System.out.println(dg.diceScore(2,2,2,2));
        System.out.println(dg.diceScore(4,1,4,4));
        System.out.println(dg.diceScore(6,3,3,6));
        System.out.println(dg.diceScore(2,5,2,6));
        System.out.println(dg.diceScore(6,4,2,5));


    }
}
