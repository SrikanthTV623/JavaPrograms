package in.stackroute;
/*
Given a string, the task is to reverse the order of the words in the given string. Do not use builtin functions.

        Examples:

Input: s = "geeks quiz practice code"
Output: s = "code practice quiz geeks"

Input: s = "i love programming very much"
Output: s = "much very programming love i"

 */
public class reverse {

    public static void main(String[] args) {

        String ar[] = new String[4];
        String str = "geeks quiz practice code";
        String str1 = "";
        int k = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ar[k] = str1;
                k++;
                str1 = "";
            }else{
                str1 += str.charAt(i);
            }
        }
        ar[k]=str1;

        for(int j=ar.length-1;j>=0;j--){
            System.out.print(ar[j] + " ");
        }

    }
}
