package AlgorithmsLeetcode;

public class SquareRootOfN {

    public static void main(String[] args) {
        System.out.println(findSquareRoot(0));
    }

    public static int findSquareRoot(int num){
        if(num == 1){
            return 1;
        }
        long start = 1, end = num/2;
        long mid = 0;
        while(start <= end){
            mid = start + (end-start) / 2;
            if((mid*mid) == num){
                return (int) mid;
            } else if ((mid*mid) > num) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return (int) end; // Return the largest integer whose square is less than or equal to num
    }
}
