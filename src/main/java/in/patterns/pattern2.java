package in.patterns;

//     1
//    121
//   12321
//  1234321
// 123454321


public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int rev = n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=rev;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>0;l--) {
                System.out.print(l);
            }
            System.out.println();
            rev--;
        }
    }
}
