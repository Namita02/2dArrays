public class Wakanda {
    public static void wakanda(int[][] array){
        for(int j = 0;j<array[0].length;j++){
            if(j%2==0){
                for(int i = 0 ; i < array.length;i++){
                    System.out.println(array[i][j]);
                }
            }else{
                for(int i = array.length - 1;i >= 0;i--){
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Wakanda abc = new Wakanda();
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//        int[][] array = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                array[i][j] = scn.nextInt();
//            }
//        }
//
//        abc.wakanda(array);
//
//    }
//}


