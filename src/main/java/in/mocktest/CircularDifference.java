package in.mocktest;
import java.util.Scanner;
/*
write a jave program for this circular difference
input format: N as a size of array and A[] as array
Sample input:
        3
        1
        2
        3
Output: 7
Explanation:
As this elements are stored in the circular queue and it subtract there consective elements in that queue.
A=[1,2,3]
B=[3-2,3-1,2-1] = [1,2,1]
After this we do xor of each element and sum all those elements
sum(B[i]xori)
=1^0+2^1+1^2
        =7
Sample input:
        3
        1
        1
        1
Output: 3
Explanation: A = [1,1,1] B=[0,0,0] SO, SUM(0^1+0^2+0^3) = 3
*/

public class CircularDifference {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int N = scanner.nextInt();
            int[] A = new int[N];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int result = calculateCircularDifference(N, A);
            System.out.println("Output: " + result);
        }

        public static int calculateCircularDifference(int N, int[] A) {
            int[] B = new int[N];
            int k=0;

            for(int i =N-1;i>=0;i--){
                for(int j=i-1;j>=0;j--){
                    B[k]=A[i]-A[j];
                    k++;
                }
            }

            for(int res : B){
                System.out.println(B[res]);
            }

            int sum = 0;
            for (int i = 0; i < B.length; i++) {
                sum += B[i] ^ i;
            }
            return sum;
        }
}
