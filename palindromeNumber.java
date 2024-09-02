package AlgorithmsLeetcode;

/*Leetcode Problem 9: Palindrome Number*/
public class palindromeNumber {

    /*Stringify approach*/
    public boolean isPalindromeString(int num){
        String str = Integer.toString(num);
        int pt1 = 0;
        int pt2 = str.length()-1;
        while(pt1 <= pt2){
            if(str.charAt(pt1) != str.charAt(pt2)){
                return false;
            }
            pt1++;
            pt2--;
        }
        return true;
    }

    /*
     * Reversing the integer approach
     * In this approach, we will divide the original number into two parts: the first half and the second half.
     * For example, if num = 123321, the first half would be 123, and the second half would be 321. We will store
     * the reversed second half in another variable and compare it with the first half. If both are equal, then the
     * number is a palindrome.
     *
     * We also account for numbers with an odd number of digits. In such cases, we remove the last digit from the
     * reversed half before comparing.
     * For example, if num = 1234321, after completing the iteration, the first half of the original num would be 123,
     * and the second half (i.e., halfReverse) would be 1234. After the iteration, we remove the 4 from halfReverse
     * and then check if they are equal.
     */
    public boolean isPalindromeReverse(int num){
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int halfReverse = 0; // This variable will store the reversed last half of the number to compare with the first half.
        while(halfReverse < num){ // We iterate until halfReverse is less than the remaining original number.
            int remainder = num % 10;
            halfReverse = (halfReverse * 10) + remainder;
            num /= 10;
        }
        System.out.println(halfReverse);
        return halfReverse == num || num == halfReverse/10;
    }
}
