package Programs.Strings;

public class SortStringsByLength {
//*Sort Strings by Length*: Sort a list of strings based on their lengths.
    public static String[] sortArrayByLength(String[] arr){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<= arr.length-1;j++){
                //System.out.println(arr[i]+" "+arr[j]);
                if(arr[i].length()>arr[j].length()){
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }else if(arr[i].length() == arr[j].length()  &&  arr[i].compareTo(arr[j]) == 1 )  {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    };

    public static void main(String[] args) {
        // TODO: Implement the solution for SortStringsByLength
        System.out.println("This is the SortStringsByLength class.");
        String[] arr = {"abc", "", "aaa", "a", "zz"};
        String[] res = sortArrayByLength(arr);
        System.out.println("Sorted array by length:");
        for (String a : res){
            System.out.println(a);
        }
        String[] arr1 = {"abc", "abcd", "ab", "a"};
        String[] res1 = sortArrayByLength(arr1);
        System.out.println("Sorted array by length:");
        for (String a : res1){
            System.out.println(a);
        }

    }
}
