package Programs.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
//Find All Anagrams in a String*: Find all start indices of anagrams of a pattern in a string.
    public  static List findAnagrams(String s, String p) {
        ArrayList <Integer> res = new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(isAnagram(s.substring(i,i+p.length()),p)){
                res.add(i);
            }else{
                continue;
            }
        }
        return res;
    }
    public static boolean isAnagram(String  s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<String,Long> data1 = Stream.of(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
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
        // TODO: Implement the solution for CheckAnagram
        System.out.println("This is the CheckAnagram class.");
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));

    }
}
