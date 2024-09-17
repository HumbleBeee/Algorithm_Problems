package AlgorithmsLeetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanInt(String str){
        int res = 0;
        Map<Character, Integer> ruleMap = new HashMap<>();
        ruleMap.put('I', 1);
        ruleMap.put('V', 5);
        ruleMap.put('X', 10);
        ruleMap.put('L', 50);
        ruleMap.put('C', 100);
        ruleMap.put('D', 500);
        ruleMap.put('M', 1000);
        for(int i = str.length()-1; i >= 0; i--){
            int currentVal = ruleMap.get(str.charAt(i));

            if (i + 1 < str.length() && currentVal < ruleMap.get(str.charAt(i + 1))) {
                // If the current value is less than the next value, subtract it
                res -= currentVal;
            } else {
                // Otherwise, add the current value
                res += currentVal;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanInt(str));
    }
}
