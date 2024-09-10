package AlgorithmsLeetcode;

import java.util.Arrays;

public class mergeSortArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1+n2];
        int i = 0;
        int pt1 = 0, pt2 = 0;
        while(pt1 < n1 && pt2 < n2){
            if(arr1[pt1] < arr2[pt2]){
                result[i++] = arr1[pt1++];
            } else{
                result[i++] = arr2[pt2++];
            }
        }

        if(pt1 < n1){
            while(pt1 < n1){
                result[i++] = arr1[pt1++];
            }
        } else{
            while(pt2 < n2){
                result[i++] = arr2[pt2++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13};
        System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));
    }
}
