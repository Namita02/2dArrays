public class MatrixMultiplication {
        public static int[][] matrixmultiplication(int[][]a1 , int[][]a2){
            int[][] multiply = new int[a1.length][a2[0].length];
            for(int i = 0; i<a1.length;i++){
                for (int j = 0;j<a2[0].length;j++){
                    for(int k = 0;k<a2.length;k++){
                        multiply[i][j] =  multiply[i][j] + a1[i][k] * a2 [k][j];
                    }

                }
            }
            return multiply;
        }

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        MatrixMultiplication abc = new MatrixMultiplication();
//        Scanner scn = new Scanner(System.in);
//        int n1 = scn.nextInt();
//        int m1 = scn.nextInt();
//        int[][] array1 = new int[n1][m1];
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < m1; j++) {
//                array1[i][j] = scn.nextInt();
//            }
//        }
//        int n2 = scn.nextInt();
//        int m2 = scn.nextInt();
//        int[][] array2 = new int[n2][m2];
//        for (int i = 0; i < n2; i++) {
//            for (int j = 0; j < m2; j++) {
//                array2[i][j] = scn.nextInt();
//            }
//        }
//        int [][] m =  abc.matrixmultiplication(array1,array2);
//        display(m);
//    }
//    public static void display(int[][] arr){
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0 ; j < arr[0].length;j++){
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}
}
