package PSolutions;

public class StringReplace2 {

    public static void main(String[] args) {
        StringReplace2 str = new StringReplace2();
        int[] arr = new int[]{1,2,0,0,3};
        System.out.println(str.solution("zpiaz",arr));

    }


    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i = 0 ; i < index_list.length ; i++){
            answer += my_string.charAt(index_list[i]);
        }

        return answer;
    }

}
