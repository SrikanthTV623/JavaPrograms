package in.mocktest;

import java.util.*;
/*
*To rotate a matrix by 90 degrees, we can transpose the matrix and then reverse each row.
*
*  Matrix        Transpose    Rotated
* 1  2  3        1 4 7         7 4 1
* 4  5  6        2 5 8         8 5 2
* 7  8  9        3 6 9         9 6 3
*
* Transpose the matrix
* Swap the element at position (i,j)(i,j) with the element at position
* (j,i)(j,i).
* */


/*public class MatrixRotations {
    public static void rotate(List<List<Integer>> matrix){
        int n=matrix.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }
        for (int i = 0; i < n; i++) {
            Collections.reverse(matrix.get(i));
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);

    }
    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}*/

public class MatrixRotations {
    public static List<List<Integer>> findMatrix(int N, List<List<Integer>> A) {
        List<List<Integer>> B = new ArrayList<>(N);

        // Initialize matrix B with all elements set to 0
        for (int i = 0; i < N; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                row.add(0);
            }
            B.add(row);
        }

        // Iterate over each cell in A
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Check A and its rotations
                for (int k = 0; k < 4; k++) {
                    // Calculate corresponding indices in A rotation
                    int new_i = i;
                    int new_j = j;
                    if (k == 1) {
                        new_i = N - 1 - j;
                        new_j = i;
                    } else if (k == 2) {
                        new_i = N - 1 - i;
                        new_j = N - 1 - j;
                    } else if (k == 3) {
                        new_i = j;
                        new_j = N - 1 - i;
                    }
                    // Update B if corresponding cell in A or its rotation is 1
                    if (A.get(new_i).get(new_j) == 1) {
                        B.get(i).set(j, 1);
                    }
                }
            }
        }

        return B;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        List<List<Integer>> A = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            List<Integer> row = new ArrayList<>();
            String[] rowValues = scan.nextLine().trim().split(" ");
            for (String value : rowValues) {
                row.add(Integer.parseInt(value));
            }
            A.add(row);
        }

        List<List<Integer>> result = findMatrix(N, A);

        for (List<Integer> row : result) {
            for (int i = 0; i < row.size(); i++) {
                System.out.print(row.get(i));
                if (i < row.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

