package Programs.Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinWindowSubstring {

// *Minimum Window Substring*: Find the smallest substring containing all characters of another string.

    public static void main(String[] args) {
        // TODO: Minimum Window Substring*: Find the smallest substring containing all characters of another string.

        System.out.println("This is the MinWindowSubstring class.");
        String s="ADOBECODEBANC";
        String t="ABC";
        int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        String res="";

        while(end<s.length()){
            String temp=s.substring(start,end+1);
            temp = Arrays.stream(temp.split("")).sorted().collect(Collectors.joining());
            t = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
            System.out.println(temp
            + " " + temp.contains(t)
            + " "+start
            + " "+end);
            if(temp.contains(t)){
                if(temp.length()<min){
                    min=s.substring(start,end+1).length();
                    res=s.substring(start,end+1);
                }
                start++;
            }else{
                end++;
            }
        }
        System.out.println(res);
    }
}
