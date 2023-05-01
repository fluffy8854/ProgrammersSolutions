package PSolutions;

public class StringReplace4 {
    // 문자열 중 'm'을 "rn"으로 교체하는 메서드 작성
    public static void main(String[] args) {
        StringReplace4 sr = new StringReplace4();
        System.out.println(sr.solution("masterpiece"));
    }

    public String solution(String rny_string) {
        // 문자열에서 특정 문자열을 교체하는 함수
        // String.replace( old String, new String) -> 치환된 문자열  / 바꾸고 싶은 문자열로 모두 치환 해준다.
        // String.replaceAll( old String, new String ) -> 치환된 문자열  / replace()와 같지만 old String으로 정규식을 받는다.
        // String.replaceFirst() -> 치환된 문자열 / 문자열 중 처음 해당되는 문자열만 치환한다.
        String answer = rny_string.replace("m","rn");
        return answer;
    }
}
