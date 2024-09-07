package AlgorithmsLeetcode;

import java.util.Arrays;
import java.util.Hashtable;

public class longestCommonPrefix {

    public String longestPrefixSort(String[] str){
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] second = str[str.length-1].toCharArray();
        for(int i = 0; i < first.length; i++){
            if(first[i] != second[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }

    public String longestPrefixBruteForce(String[] str){
        if(str == null)
            return "";
        int len = str[0].length();
        for(int i = 0; i < len; i++){
            char c = str[0].charAt(i);
            for(int j = 1; j < str.length; j++){
                if(i == str[j].length() || str[j].charAt(i) != c){
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}
