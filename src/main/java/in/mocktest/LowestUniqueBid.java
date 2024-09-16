package in.mocktest;

import java.util.*;

/*
3. Auction Winner

You are at a fine art auction and are looking for a specific painting. There are N people who have gathered to place a
bid on that same painting. The rules of at this auction are a bit different, such that, the person with the lowest
unique bid wins the auction.
People are numbered from 1 to N. You are given an array bids which depicts the bidding price of the i-th person.
Your task is to find the index of the person who will win the auction. If there is no winner, return -1.

Function description
Complete the auction function in the editor below. It has the following parameter(s):
Name	Type	        Description
bids	INTEGER ARRAY	bid price of i-th participant
Return
The function must return an INTEGER denoting the Index of winner

Sample Testcases
Input
2
        1
        1
output:-1
Output Description:There are 2 people at auction. Both have placed a bid of same amount, hence nobody wins.
        3
        2
        1
        3
output:2
Output Description:The lowest unique bid is of person 2.
        4
        2
        2
        2
        3
output:4
Output Description:The lowest bid is of persons 1,2,3 but lowest unique bid is of person 4.
*/



public class LowestUniqueBid {
    public static int auction(int[] bids){
        /*
        //this program has more complexity
        List<Integer> list = new ArrayList<>();
        for(int item:bids){
            list.add(item);
        }
        Set<Integer> set = new HashSet<>(list);
        int MIN = Integer.MAX_VALUE;
        for(int values:set){
            int counter =0;
            for(int check:list){
                if(values == check){
                    counter++;
                }
            }
            if(counter<=1){
                if(MIN>values){
                    MIN = values;
                }
            }
        }
        for(int i:bids){
            int count=0;
            for(int j:bids){
                if(i==j){
                    count++;
                }
            }
            if(count<=1){
                return list.indexOf(MIN)+1;
            }
        }
        return -1;*/
        Map<Integer, Integer> map = new HashMap<>();
        //this loop used to store this 2,2,2,3 as (element:frequency) 2:3,3:1
        for(int bid : bids){
            if(!(map.containsKey(bid))){
                map.put(bid, 1);
            } else{
                map.put(bid, (map.get(bid) + 1));
            }
        }
        //assume minimum bid as -1, compare with the each frequency of the value == 1,
        //for case 2:3, it compares map.get(bid)==1, 3==1 its correct loop works or else no (no)
        //for case 3:1, 1 == 1 true it returns minbid as 3
        //returns minbid
        int minBid = -1;
        for(int bid : bids){
            if( map.get(bid) == 1){
                if(minBid == -1 || bid < minBid){
                    minBid = bid;
                }
            }
        }
        //here it checks the minbid value is present in the bids array and it returns that elements index.
        if(minBid != -1){
            for(int i = 0; i < bids.length; i++){
                if(bids[i] == minBid){
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] bids = new int[N];
        for(int j=0;j<N;j++){
            bids[j]=scan.nextInt();
        }
        int result;
        result = auction(bids);
        System.out.print(result);
        return ;
    }
}
