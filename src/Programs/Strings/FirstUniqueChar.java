package Programs.Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// *Find First Non-Repeating Character*: Find the first unique character in a string using HashMap.
public class FirstUniqueChar {

    public static void main(String[] args) {
        // TODO: Implement the solution for FirstUniqueChar
        System.out.println("This is the FirstUniqueChar class.");
        String  a = "abacabad";
        Map<String,Long> x= Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        String res="-1";
        for(Map.Entry<String,Long> ab: x.entrySet()){
            System.out.println(ab.getKey());
            if(ab.getValue()==1){
                res = ab.getKey();
                break;
            }
        }
        System.out.println("res : "+ res);
        }
    }


