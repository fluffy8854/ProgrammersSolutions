package PSolutions;

import java.util.Arrays;

public class StringCompare3 {
    // 문자열의 접미사를 문자열 배열로 저장하고 사전순으로 정렬하는 메서드
    public static void main(String[] args) {
        StringCompare3 sc = new StringCompare3();
        System.out.println(Arrays.toString(sc.solution("banana")));

    }

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0 ; i < my_string.length(); i++){
            // 문자열 잘라 배열에 저장하기
            answer[i] = my_string.substring(i,my_string.length());
        }
        String tem;

        // 버블 정렬로 배열 정렬하기
        for( int j = 0 ; j < answer.length-1; j++){
            for( int k = 0 ; k < answer.length-1 ; k++){
                // 사전순서란 문자의 앞글자부터 높은 순서로 나열되있는 것 (a~z)
                // 같은 글자이면 다음 글자를 비교한다. ( aaa aab aac ~ )
                // 문자열을 사전순으로 비교해주는 함수 String.CompareTo(cmpStr)
                if(answer[k].compareTo(answer[k+1]) > 0){

                    tem = answer[k];
                    answer[k] = answer[k+1];
                    answer[k+1] =tem;
                }
            }
        }
        return answer;
    }
}
