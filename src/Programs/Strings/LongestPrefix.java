package Programs.Strings;

import java.util.Arrays;

public class LongestPrefix {
//*Longest Common Prefix*: Find the longest common prefix among an array of strings.

    public static String findPrefix(String[] arr){
      String firstString =arr[0];
      String res = "";
      for (int i=0;i<firstString.length();i++){
          String prefix = res+firstString.charAt(i);
          //System.out.println(prefix);
          //System.out.println(Arrays.stream(arr).allMatch(x->x.startsWith(prefix)));
          if(Arrays.stream(arr).allMatch(x->x.startsWith(prefix))){
              res = prefix;
          }else {
              return res;
          }
      }
      return res;
    };
    public static void main(String[] args) {
        // TODO: Implement the solution for LongestPrefix
        System.out.println("This is the LongestPrefix class.");
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(findPrefix(arr));
        String[] arr1 = {"dog", "racecar", "car"};
        System.out.println(findPrefix(arr1));
        String[] arr2 = {"ab", "a"};
        System.out.println(findPrefix(arr2));

    }
}
