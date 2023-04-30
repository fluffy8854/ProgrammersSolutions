package PSolutions;

public class StringCompare2 {

    public static void main(String[] args) {
        // 어느 부분 문자열이 한 문자열에 속해있으면 1 아니면 0을 반환하는 메서드 작성
        StringCompare2 sp = new StringCompare2();
        System.out.println(sp.solution("banana","bana"));
    }

    public int solution(String my_string, String target) {
        int answer;
        // 문자열에서 char 또는 String이 부분문자열로 있는지와 위치를 반환하는 함수
        // String.indexOf()를 이용한다. 문자열에 부분 문자열로 존재하지 않으면 -1을 반환
        if(my_string.indexOf(target) == -1){
            answer = 0;
        }
        else answer = 1;

        return answer;
    }
}
