package AlgorithmsLeetcode;

import java.util.HashMap;

public class TwoSum {

    /*Brute force approach where we check each and every combination
    * Time Complexity: O(n^2), Space Complexity: O(1)
    * */
    public int[] bruteForce(int[] arr, int target, int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    /*HashMap approach where we store value as key and index as value in map and search if the
    * compliment exists in the map already or not instead of traversing whole array again and again
    * Time Complexity: O(n), Space Complexity: O(n)
    * */
    public int[] hashMapTwoSum(int[] arr, int target, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }
}
