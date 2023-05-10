package PSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCut {public String[] solution(String myString) {
    int index = 0;
    String str = "", cmp = "";
    ArrayList<String> al = new ArrayList<>();
    // 문자열 자르기
    while(index < myString.length()){
        if(myString.charAt(index) == 'x'){
            if(str.equals("")){
                index++;
                continue;
            }
            index++;
            al.add(str);
            str = "";
            continue;
        }

        if(index == myString.length()-1){
            str += myString.charAt(index);
            al.add(str);
            index++;
            break;
        }

        str += myString.charAt(index);
        index++;
    }

    // 리스트 배열에 담기
    String[] answer = new String[al.size()];
    for(int i = 0 ; i < al.size() ; i++){
        answer[i] = al.get(i);
    }
    System.out.println(Arrays.toString(answer));

    // 사전순 정렬
    for(int i = 0 ; i < answer.length - 1 ; i++ ){
        for(int j = 0 ; j < answer.length - 1 ; j++){
            if(answer[j].compareTo(answer[j+1]) > 0 ){
                cmp = answer[j];
                answer[j] = answer[j+1];
                answer[j+1] = cmp;
            }

        }
    }
    System.out.println(Arrays.toString(answer));

    return answer;
}

    public static void main(String[] args) {
        StringCut sc = new StringCut();
        sc.solution("dxccxbbbxaaaa");
    }
}
