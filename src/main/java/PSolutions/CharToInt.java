package PSolutions;

public class CharToInt {
    // 자연수의 각 자릿수의 숫자를 총합한 후 9를 나눈 나머지값을 구하는 클래스
    public static void main(String[] args) {
        CharToInt ct = new CharToInt();
        System.out.println(ct.solution("787206465654214"));
    }
    public int solution(String number) {
        int answer = 0;
        for(int i = 0 ; i < number.length() ; i ++){
            // char -> int 로 형변환하는 방법
            // 1. (int) -> 사용 시 숫자의 아스키 코드값으로 변환
            // 따라서 '0'(아스키 코드값 48)을 빼주면 원래 숫자로 변환
            // 2. Character.getNumericValue() 메서드 사용
            answer += (int)number.charAt(i) -'0';
            //answer += Character.getNumericValue(number.charAt(i));
        }

        answer %= 9;

        return answer;
    }
}
