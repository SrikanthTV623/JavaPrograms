package in.mocktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String[] array={"Java","Python","PHP","C++"};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        //System.out.println("Printing Array: "+ Arrays.toString(array));
        //Converting Array to List
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+list);
    }
}
