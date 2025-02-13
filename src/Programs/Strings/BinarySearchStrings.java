package Programs.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearchStrings {
//*Binary Search in Strings*: Use binary search to find a word in a sorted list of strings.
    public static void main(String[] args) {
        // TODO: Implement the solution for BinarySearchStrings
        System.out.println("This is the BinarySearchStrings class.");
        Scanner i = new Scanner(System.in);
        String data = i.nextLine();
        System.out.println("ENTER STRING TO SEARCH");
        String res = i.nextLine();
        List<String> lt = Arrays.stream(data.split(" ")).sorted().toList();
        int high= lt.size();
        int index = -1;
        int left = 0;
        int right = lt.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (lt.get(mid).compareTo(res) == 0) {
                index = mid;
                break;
            } else if (lt.get(mid).compareTo(res) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(" index : " + index );
    }
}
