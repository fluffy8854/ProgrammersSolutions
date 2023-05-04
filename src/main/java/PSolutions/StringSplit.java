package PSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        StringSplit ss = new StringSplit();
        System.out.println(Arrays.toString(ss.solution(" i    love  you")));
    }

    public String[] solution(String my_string) {
        String[] sArr = my_string.split(" ");
        ArrayList<String> al = new ArrayList<>();
        for( String s : sArr){
            if(s.equals("")){
                continue;
            }
            al.add(s);

        }
        String[] answer = new String[al.size()];
        for( int i = 0 ; i < al.size() ; i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}
