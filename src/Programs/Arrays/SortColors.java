package Programs.Arrays;

import java.util.Arrays;

public class SortColors {
//sort an array with elements 0,1,2 (dutch national flag problem)
//Dutch National Flag (DNF) - It is a programming problem proposed by Edsger Dijkstra.
// The flag of the Netherlands consists of three colors: white, red, and blue. The task is to randomly
// arrange balls of white, red, and blue in such a way that balls of the same color are placed together.
// For DNF (Dutch National Flag), we sort an array of 0, 1, and 2's in linear time that does not consume any extra space.
// We have to keep in mind that this algorithm can be implemented only on an array that has three unique elements.
//
//    ALGORITHM -
//    Take three-pointers, namely - low, mid, high.
//    We use low and mid pointers at the start, and the high pointer will point at the end of the given array.
    public static void main(String[] args) {
        // TODO: Implement the solution for SortColors
        System.out.println("This is the SortColors class.");
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        int[] arr = {0, 1, 2, 0, 1, 2,1,2,1,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                arr[mid]=arr[low];
                arr[low]=0;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
    }
}
