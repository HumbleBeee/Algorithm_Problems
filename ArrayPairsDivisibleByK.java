/* Problem of the day 01-10-2024
* 1497. Check If Array Pairs Are Divisible by k
* Given an array of integers arr of even length n and an integer k.
* We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
* Return true If you can find a way to do that or false otherwise.
* */

package AlgorithmsLeetcode;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairsDivisibleByK {

    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,-1,2,2,-2,-2};
        int k = 3;
        System.out.println(pairsExists(arr, k));
        System.out.println(pairExistsOptimized(arr, k));
        System.out.println(pairExistsFreqArray(arr, k));
    }

    public static boolean pairsExists(int[] arr, int k){
        int requiredPair = arr.length/2;
        int currPair = 0;
        boolean[] used = new boolean[arr.length];  // To track if an element is already paired

        for(int i = 0; i < arr.length; i++){
            if(used[i]) continue;
            for(int j = i+1; j < arr.length; j++){
                if(!used[j] && (arr[i] + arr[j])%k == 0){
                    // Mark these two elements as used
                    used[i] = true;
                    used[j] = true;
                    currPair++;
                    System.out.print("["+i+", "+j+"], ");
                    break;
                }
            }
        }
        return currPair == requiredPair;
    }

    public static boolean pairExistsOptimized(int[] arr, int k){
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        for(int num : arr){
            int rem = ((num % k) + k) % k;
            remainderMap.put(rem, remainderMap.getOrDefault(rem, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : remainderMap.entrySet()){
            int remainder = entry.getKey();
            int value = entry.getValue();
            if(remainder == 0){
                if(value % 2 != 0){
                    return false;
                }
            } else{
                int complement = k - remainder;
                if(remainderMap.getOrDefault(complement, 0) != value){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean pairExistsFreqArray(int[] arr, int k){
        int[] freqArr = new int[k];
        for(int num : arr){
            int rem = ((num % k) + k) % k;
            freqArr[rem]++;
        }

        if(freqArr[0] % 2 != 0){
            return false;
        }

        for(int rem = 1; rem <= k/2; rem++){
            int counterHalf = k - rem;
            if(freqArr[counterHalf] != freqArr[rem]){
                return false;
            }
        }

        return true;
    }
}
