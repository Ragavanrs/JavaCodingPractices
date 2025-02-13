package Programs.Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByFrequency {
//*Sort Characters by Frequency*: Sort characters in a string by their frequency of occurrence.
    public static void main(String[] args) {
        // TODO: Implement the solution for SortByFrequency
        System.out.println("This is the SortByFrequency class.");
        String s="ragavan";
        Map<String,Long> m = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Map.Entry<String,Long>> lt = new LinkedList<>(m.entrySet());
        Collections.sort(lt,(a1,a2)->a2.getValue().compareTo(a1.getValue()));
        for(Map.Entry<String,Long> x : lt ){
            int z=0;
            while (z<x.getValue()) {
                System.out.print(x.getKey());
            z++;
            }
        }
    }



}
