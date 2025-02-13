package Programs.Strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAnagrams {
    //*Check Anagram*: Check if two strings are anagrams of each other.
    public static boolean isAnagram(String  s1, String s2){
      if(s1.length() != s2.length()){
          return false;
      }
        Map<String,Long> data1 =Stream.of(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> data2 =Stream.of(s2.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for ( Map.Entry<String, Long> entry : data1.entrySet()) {
            String key = entry.getKey();
            if(entry.getValue() == data2.get(key)){
                continue;
            }else{
                return false;
            }

            // do something with key and/or tab
        }
        return true;

    };
    public static void main(String[] args) {
        // TODO: Implement the solution for FindAnagrams
        System.out.println("This is the FindAnagrams class.");
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));



    }
}
