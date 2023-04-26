package PSolutions;

import java.util.Arrays;

public class QueryArray {

    public static void main(String[] args) {
        QueryArray qa = new QueryArray();
        int[] arr1 = {0, 1, 2, 3, 4};
        int[][] queries = { {0,3}, {1,2}, {1,4}};

        System.out.println(Arrays.toString(qa.queryExcute(arr1,queries)));
    }

    public int[] queryExcute(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp;

        // queries 를 참조하여 arr의 배열 순서를 변경
        for(int i = 0 ; i < queries.length ; i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        answer = arr;

        return answer;
    }
}
