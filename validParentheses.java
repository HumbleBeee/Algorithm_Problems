package AlgorithmsLeetcode;

import java.util.Stack;

public class validParentheses {

    public boolean isValidParentheses(String str){
        int len = str.length();
        //If the length of string is odd then there is one missing pair
        if(len%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < len; i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            if(ch == ']' || ch == ')' || ch == '}'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                //This condition is for mismatch pairs
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return false;
    }
}
