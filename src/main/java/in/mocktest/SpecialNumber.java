package in.mocktest;
/*
1. Most Special number

You are given an array arr of positive integers of length n, and you need to find the most special number in arr.
Let x, y be two positive integers, let dis_x, dis_y be the number of distinct digits in x, y (in decimal numeral
system) respectively. Here, x is considered to be more special than y if either dis_x > dis_y, or dis_x = dis_y
and x > y.
Your task is to find the most special number in arr.

Function description
Complete the MostSpecialNumber function in the editor below. It has the following parameter(s):
Name	Type	        Description
n	INTEGER	        The length of the array.
arr	INTEGER ARRAY	An array of positive integers
Return
The function must return an INTEGER denoting the special number in the array arr

Sample Testcases
Input
2
33
12
output:12
Output Description: 12 has more distinct digits than 33, so it's more special.
        5
        28
        19
        41
        56
        84
output:84
Output Description: All of the numbers have the same number of distinct digits, so the most special number is
the greatest in the array, which 84.
        11
        43225
        12342
        34252
        4612
        54532
        41753
        12327
        53134
        16435
        32532
        12122
output:41753
Output Description: Large test case to debug your solution.*/

import java.util.Scanner;

public class SpecialNumber {
    public static int MostSpecialNumber(int n,int[] arr){
        int MAX = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            String size=String.valueOf(arr[i]);
            for(int j=0;j<size.length();j++){
                for(int k=j+1;k<size.length();k++){
                    if(size.charAt(j)==size.charAt(k)){
                        count++;
                        break;
                    }
                }
            }
            if(count==0){
                if(MAX<arr[i]){
                    MAX = arr[i];
                }
            }
        }
        return MAX;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int result;
        result = MostSpecialNumber(n,arr);
        System.out.print(result);
        return ;
    }
}
