package in.stackroute;

import java.util.Scanner;
/*
Given a number, find its corresponding Roman numeral.

        Examples:

Input : 9
Output : IX
Input : 40
Output : XL
Input :  1904
Output : MCMIV

Following is the list of Roman symbols which include subtractive cases also:

SYMBOL       VALUE
I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900
M             1000

 */

public class IntegertoRoman {
    public static void main(String[] args) {
        int num;
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.println("Enter an Integer: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        System.out.println(roman);
    }
}
