package PSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeArrayLength {
    public static void main(String[] args) {
        MakeArrayLength ma = new MakeArrayLength();
        int[] ar = new int[]{1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(ma.arrayMake(ar)));
    }

    public int[] arrayMake(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int j = 0;
        while(j < arr.length){
            if(al.isEmpty()){
                al.add(arr[j]);
                j++;
            }
            else if(al.get(al.size()-1) < arr[j]){
                al.add(arr[j]);
                j++;
            }
            else if(al.get(al.size()-1) >= arr[j]) {
                al.remove(al.size() - 1);
            }
        }



        int[] stk = al.stream().mapToInt(i ->i).toArray();
        return stk;
    }

}
