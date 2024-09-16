package in.mocktest;

import java.util.Scanner;

/*
Make lexicographically Minimum
You are given a string Str of length N consisting of lowercase English letters.
In one step you can shift a letter by D steps. This means that if D = 1 then a -> b, b->c, ..., z->a. Similarly, if D = 2 then a->c, c->d, ... z->b.
Find the lexicographically minimum string possible in at most K steps.

Function description
Complete the calculateString function in the editor below. It has the following parameter(s):
Name	Type	Description
N	INTEGER	The length of given string.
Str	STRING	The given string.
D	INTEGER	The given shift distance.
K	INTEGER	The maximum number of shifts allowed.
Return
The function must return a STRING denoting the lexicographically minimum possible string.
Constraints
Input format for debugging
The first line contains an integer, N, denoting the length of given string.
The next line contains a string, Str, denoting the given string.
The next line contains an integer, D, denoting the shift distance.
The next line contains an integer, K, denoting the maximum number of shifts allowed.
Sample Testcases
Input
2
vy
3
3
Output: bb
Output Description:
y->b => 1 step
v->y->b => 2 steps
Hence the answer is 3.

input:
3
ugs
2
3
output:
ags
Output Description:
u->w->y->a => 3 steps.
Hence ags can be achieved in 3 steps.

input:
3
cqi
3
2
output:
cqi
output description:
The given string is already lexicographically minimum.
*/
public class lexicographicallyMinimum {
    public static String solve(String s,int d,int k){
        char[] arr = s.toCharArray();
        char[] abc = new char[26];
        for(int i=0;i<26;i++){
            abc[i]= (char) ('a'+i);
        }
        while(k>0){
            char max = 'a';
            int j = 0;
            for(int i=0;i< arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                    j=i;
                }
            }
            char c= (char) (max+d);
            if(c>'z'){
                c= abc[c-'a'-26];
            }
            arr[j] = c;
            k--;
        }
        if(s.compareTo(new String(arr)) < 0){
            return s;
        }
        else{
            return new String(arr);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("ugs",2,3));
        System.out.println(solve("vy",3,3));
        System.out.println(solve("cqi",3,3));
    }
}
