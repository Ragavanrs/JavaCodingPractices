package Programs.Strings;

public class StringCompression {
//*String Compression*: Compress a string by replacing consecutive repeating characters with their count.
    public static void main(String[] args) {
        // TODO: Implement the solution for StringCompression
        System.out.println("This is the StringCompression class.");
        String st= "aabcccccaaa";
        String[] arr = st.split("");
        StringBuilder res= new StringBuilder();
        for(int i=0;i<st.length();i++){
            int count =1;
            for(int j=i+1;j<st.length();j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    if(j ==st.length()-1){
                        i=j;
                        break;
                    }
                }else {
                    i=j-1;
                    break;
                }

            }
            res.append(arr[i]).append(count);
        }
        System.out.println(res);
    }
}
