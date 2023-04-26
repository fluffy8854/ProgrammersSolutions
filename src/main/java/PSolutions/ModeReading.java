package PSolutions;

public class ModeReading {
    // 문자열 code를 읽어 "1"이 나올때마다 모드를 바꾸어 처리하는 프로그램

    public static void main(String[] args) {
        ModeReading mr = new ModeReading();
        System.out.println(mr.modeRead("adsgadbfasd1"));
    }

    public String modeRead(String code) {
        String answer = "";
        int idx = -1;                      // code의 index
        String[] strArr;
        strArr = code.split("1");    // 모드가 바뀔때마다 나누어서 저장

        System.out.println(strArr[0]);
        for(int i = 0 ; i < strArr.length; i++){
            idx++;                         // "1"의 index 더하기
            if(i % 2 == 0){ // mode 0
                for(int j = 0 ; j < strArr[i].length() ; j++ ){
                    if(j % 2 == 0){
                        answer += strArr[i].charAt(j);
                    }
                    idx++;                 // 한글자 읽을떄마다 index 증가
                }
            }
            else if(i % 2 == 1){ // mode 1
                for( int k = 0 ; k < strArr[i].length() ; k++){
                    if(k % 2 == 1){
                        answer += strArr[i].charAt(k);
                    }
                    idx++;
                }
            }
        }

        if(answer.equals("")){        //  code가 빈 문자열 일 떄 EMPTY
            answer += "EMPTY";
        }

        return answer;
    }
}


