package AlgorithmsLeetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "H";
        System.out.println(findLength(str));
    }

    public static int findLength(String str){
        int length = 0;

        if(str.isEmpty()){
            return -1;
        }
        for(int i = str.length()-1; i >= 0; i--){
            if(length > 0 && str.charAt(i) == ' '){
                break;
            }
            if(str.charAt(i) != ' '){
                length++;
            }
        }
        return length;
    }
}
