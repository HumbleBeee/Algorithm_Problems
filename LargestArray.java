package AlgorithmsLeetcode;

import java.util.Arrays;

public class LargestArray {

    public static String findLargest(int[] arr){
        Integer[] numAsInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        if(numAsInteger[0] == 0){
            return "0";
        }

        Arrays.sort(numAsInteger, (a, b) -> {
            String s1 = Integer.toString(a);
            String s2 = Integer.toString(b);
            return (s2+s1).compareTo(s1+s2);
        });

        StringBuilder result = new StringBuilder();
        for(int num : numAsInteger){
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(findLargest(arr));
    }
}
