package PSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFind {
    // atendance에서 참여를 한 사람 중 rank 에서 높은 등수 순으로
    // 3명의 등수를 구하는 메서드 (atendance와 rank의 동일 index는 같은 사람 )

    public static void main(String[] args) {
        ArrayFind af = new ArrayFind();
        int[] iArr = {3,7,2,5,4,6,1};
        boolean[] bArr = {false,true,true,true,true,false,false};
        System.out.println(af.solution(iArr,bArr));
    }

    public int solution(int[] rank, boolean[] attendance) {
        int[] ranker = new int[3];
        int k = 0;
        // 1등부터 내림차순으로 index 탐색 후 atendance의 같은 index가 true면 저장하기
        for(int i = 1 ; i <= rank.length ; i++ ){
            for(int j = 0 ; j< rank.length ; j++ ){
                if(rank[j] == i){
                    if(attendance[j] == true){
                        ranker[k] = j;
                        k++;
                    }
                    break;
                }
            }
            // 3명을 선발하면 반복문 종료
            if( k > 2){
                break;
            }
        }

        int answer = ranker[0] * 10000 + ranker[1] * 100 + ranker[2];
        return answer;
    }
}
