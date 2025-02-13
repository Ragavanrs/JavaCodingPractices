package Programs.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
//*Reverse Words in a String*: Reverse the order of words in a string.
    public static void main(String[] args) {
        // TODO: Implement the solution for ReverseWords
        System.out.println("This is the ReverseWords class.");
        Scanner sc=new Scanner(System.in);
        String data= sc.nextLine();
        String[] arr=data.split(" ");
        StringBuilder res= new StringBuilder();
        for (String a : arr){
            res.insert(0, a + " ");
        }

        System.out.println(res);

    }
}
