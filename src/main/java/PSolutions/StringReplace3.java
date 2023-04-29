package PSolutions;

import java.util.Arrays;

public class StringReplace3 {
    // 문자열 뒤집기
    public static void main(String[] args) {
        StringReplace3 str = new StringReplace3();
        int[][] arr = new int[][]{{2,3},{0,7},{5,9},{6,10}};
        System.out.printf("%s",str.solution("rermgorpsam",arr));
    }

    public String solution(String my_string, int[][] queries) {
        String answer = "";
        // 문자열 중간부터 참조하기 위해 char 배열로 변환
        char[] cArr = my_string.toCharArray();
        String tmp = "";
        for(int i = 0; i < queries.length; i++){
            tmp = "";
            tmp = String.valueOf(cArr); // reverse 처리된 문자열 저장하기
            for(int j = 0 ; j < queries[i][1] - queries[i][0] + 1 ; j++ ){
                // 뒤집기
                cArr[queries[i][0]+j] = tmp.charAt(queries[i][1]-j);
            }
        }
        answer = String.valueOf(cArr);

        return answer;
    }

}
