package AlgorithmsLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortArray2 {

    public static int[] mergeSorted(int[] arr1, int[] arr2, int m, int n){

        int i = m-1;
        int j = n-1;
        int k = (m+n)-1;

        while(j >= 0){
            if(i >= 0 && arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            } else{
                arr1[k--] = arr2[j--];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(mergeSorted(arr1, arr2, 4, 3)));
    }
}
