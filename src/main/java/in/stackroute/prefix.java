package in.stackroute;
/*
Given a set of strings, find the longest common prefix.
        Examples:

Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
Output: "gee"

Input: {"apple", "ape", "april"}
Output: "ap"*/
public class prefix {

    public static void main(String[] args) {

        //String arr[] ={"geeksforgeeks", "geeks", "geek", "geezer"};
        String arr[] ={"apple", "ape", "april"};
        int n = arr.length;
        String prefix=arr[0];
        for(int i=1;i< arr.length;i++){
            prefix=longestString(prefix,arr[i]);
        }

        if (prefix.length() > 0) {
            System.out.printf(prefix);
        } else {
            System.out.printf("There is no common prefix");
        }

    }
    static String longestString(String str1, String str2){
        int n1=str1.length();
        int n2=str2.length();
        String res="";

        for(int i=0, j=0; i<=n1-1 && j<=n2-1;i++,j++){
            if(str1.charAt(i)!=str2.charAt(j)){
                break;
            }
            res+=str1.charAt(i);
        }
        return res;
    }
}
