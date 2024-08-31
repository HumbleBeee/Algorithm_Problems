package AlgorithmsLeetcode;

public class TwoSum {

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
}
