package PSolutions;

public class StringReplace {

    public String solution(String my_string, String overwrite_string, int s){
        String word = "";

        for (int i = 0 ; i < my_string.length() ; i++ ){
            if(i < s){
                word += my_string.charAt(i);
            }
            else if( s <= i && i < s+overwrite_string.length()){
                word += overwrite_string.charAt(i-s);
            }
            else{
                word += my_string.charAt(i);
            }
        }
        System.out.println(word);


        return word;
    }

    public static void main(String[] args) {
        StringReplace sr = new StringReplace();
        sr.solution("He11oWor1d", "lloWorl",2);
    }
}
