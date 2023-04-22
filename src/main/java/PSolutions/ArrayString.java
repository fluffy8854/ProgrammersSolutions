package PSolutions;

public class ArrayString {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        ArrayString as = new ArrayString();
        System.out.println(as.solution(arr));

    }
    public String solution(String[] arr) {
        String answer = "";

        // 반복문으로 배열을 0부터 끝까지 참조하여 하나의 String 변수에 모두 더하기
        for(int i = 0 ; i<arr.length ; i++){
            answer += arr[i];
        }

        return answer;
    }
}

