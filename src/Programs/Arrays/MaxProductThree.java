package Programs.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MaxProductThree {
//Find Maximum Product of Three Numbers*: Find the maximum product of three numbers in an array.
    public int MaxProduct(int[] nums){
       if(nums.length<3){
           return 0;
       }else if (nums.length==3){
           int res= Arrays.stream(nums).reduce(1,(a, b)->a*b);
           return res;
       }
       boolean isNegative = Arrays.stream(nums).anyMatch(num -> num < 0);
       if(isNegative){
           int[] sortedNums = Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray();
           int res1= Arrays.stream(sortedNums).skip(sortedNums.length-3).reduce(1, (a, b)->a*b);
           int res2= Arrays.stream(sortedNums).limit(2).reduce(1, (a, b)->a*b)*sortedNums[sortedNums.length-1];
           return Math.max(res1,res2);
       }else{
           int[] sortedNums = Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray();
           int res= Arrays.stream(sortedNums).skip(sortedNums.length-3).reduce(1, (a, b)->a*b);
           return res;
       }
    } ;
    public static void main(String[] args) {
        // TODO: Implement the solution for MaxProductThree
        System.out.println("This is the MaxProductThree class.");
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] nums = {1, 2, 3};
        int res = maxProductThree.MaxProduct(nums);
        System.out.println(res);
        int[] nums1 = {-5, -4, -3, 1, 2};
        System.out.println(maxProductThree.MaxProduct(nums1));

    }
}
