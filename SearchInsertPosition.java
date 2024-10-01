package AlgorithmsLeetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,10,12,14,17,19};
        int target = 15;
        System.out.println("found at "+searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target){
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int result = 0;
        int low = 0, high = nums.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                low = mid+1;
            } else{
                high = mid - 1;
            }
        }
        return low;
    }
}
