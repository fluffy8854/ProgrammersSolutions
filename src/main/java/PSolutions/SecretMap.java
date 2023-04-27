package PSolutions;

import java.util.Arrays;

public class SecretMap {

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();
        int[]arr1 = {9,20,28,18,11};
        int[]arr2 = {30,1,21,17,28};
        System.out.println(Arrays.toString(sm.solution(5, arr1,arr2 )));
    }


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] realMap = new int[n];
        String shap = "";
        int binMod =0;
        // 원래 지도 구하기
        // or 로 구현
        for( int i = 0 ; i < n ; i++){
            realMap[i] = arr1[i] | arr2[i];
        }
        // 지도 해석하여 문자열로 나타내기
        for(int j = 0 ; j < n ; j++){
            shap = "";             // # 들어갈 문자열 초기화
            binMod = realMap[j];
            for( int k = 0 ; k < n ; k++ ){
                // 2진수 계산식으로 1 = "#" 0 = " " 구별하여 저장하기
                if(binMod / (int)Math.pow(2,n-k-1) == 1){
                    shap+="#";
                    binMod = binMod % (int)Math.pow(2,n-k);
                }
                else shap+=" ";
            }
            answer[j] = shap;
        }


        return answer;
    }
}
