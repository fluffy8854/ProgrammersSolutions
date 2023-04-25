package PSolutions;

public class StrongCompare {
    public static void main(String[] args) {

    }

    public int compare(String ineq, String eq, int n, int m) {
        int answer = 0;

        // 자바에서 문자열 비교 -> String.equals 메서드로 비교한다
        // == 연산자로 비교할 시 두 문자열의 해시값을 비교한다.
        if(eq.equals("=")){
            if(ineq.equals(">")){
                if(n >= m){
                    answer = 1;
                }
                else answer = 0;
            }
            else if( ineq.equals("<")){
                if(n <= m){
                    answer = 1;
                }
                else answer = 0;
            }
        }
        else if (eq.equals("!")){
            if(ineq.equals(">")){
                if(n > m){
                    answer = 1;
                }
                else answer = 0;
            }
            else if( ineq.equals("<")){
                if(n < m){
                    answer = 1;
                }
                else answer = 0 ;
            }
        }
        return answer;
    }
}
