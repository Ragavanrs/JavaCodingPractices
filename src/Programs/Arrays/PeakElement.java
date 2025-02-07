package Programs.Arrays;
//find peak element in array where neighbor element are smaller
public class PeakElement {

    public static void main(String[] args) {
        // TODO: Implement the solution for PeakElement
        System.out.println("This is the PeakElement class.");
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int res= findPeakElement(nums);
        System.out.println(res);
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
