package in.mocktest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
write a JAVA Program for given input
input format: input is given in list format
input: ccbbaa
output: 12
explanation:
first we have to convert the each letter in the given alphabet order like a=1,b=2,c=3 ..soon then
we need to asign those characters to their respective value then we need sum that entire string.
3+3+2+2+1+1 = 12

input: abcdeefg
output: 20
explanation:
first we have to convert the each letter in the given alphabet order like a=1,b=2,c=3 ..soon then
we need to asign those characters to their respective value. If the length of string is greater
than 6 then we need to sort the list then we need sum that string till 6th element.
        1+2+3+4+5+5=20
*/

public class StringContribution {
    public static int alphabetSum(List<String> input) {
        // ArrayList to store the values of each character
        ArrayList<Integer> charValues = new ArrayList<>();
        int sum =0;

        // Convert each letter to its corresponding alphabet value and store in charValues
        for (String str : input) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                charValues.add(c - 'a' + 1);
            }
        }
        if(charValues.size()>6){
            Collections.sort(charValues);
            for (int i = 0; i < 6; i++) {
                sum += charValues.get(i);
            }
            //return  sum;
        }else {
            for (int value : charValues) {
                sum += value;
            }
            //return sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        //input.add("ccbbaa");
        input.add("cbadeefg");
        int result = alphabetSum(input);
        System.out.println("Output: " + result);
    }
}
