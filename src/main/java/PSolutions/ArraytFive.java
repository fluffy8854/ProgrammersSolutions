package PSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytFive {
    public static void main(String[] args) {
        int [] arr = new int[3];

        ArraytFive af = new ArraytFive();
        System.out.println(Arrays.toString(af.fiveArray(13,50)));
    }



    public int[] fiveArray(int l,int r){
        ArrayList<Integer> al = new ArrayList<>();
        int j;
        // 범위 내 전수 조사
        for(int i = l ; i <= r ; i ++){
            // 검사 반복문
            for( j = 0 ;  j < String.valueOf(i).length() ; j++ ){
                if (String.valueOf(i).charAt(j) != '0'){
                    if(String.valueOf(i).charAt(j) != '5'){
                        break;
                    }
                }
                if(j == String.valueOf(i).length()-1){
                    al.add(i);
                }
            }
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        int[] answer = al.stream().mapToInt(k ->k).toArray();
        return answer;
    }
}
