package AlgorithmsLeetcode;

public class IndexOfFirstOccurrence {

    public static void main(String[] args) {
        String hayStack = "sadded";
        String needle = "sad";
        System.out.println(findNeedle(hayStack, needle));
    }

    public static int findNeedle(String haystack, String needle){
        int res = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(res)){
                res++;
            } else{
                i = i - res;
                res = 0;
            }
            if(res == needle.length()){
                return i-res+1;
            }
        }
        return -1;
    }

}
