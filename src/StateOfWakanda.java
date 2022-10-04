public class StateOfWakanda {
    public static void stateOfWakanda(int[][] arr){
       // SOLUTION
//        for(int i = 0 ; i < arr.length ; i++){
//            for (int j = 0 ; j < arr.length ; j++){
//                if(i == j){
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }
//        int a = arr.length - 2;
//        int b = 1;
//        while (a >= 0) {
//            for (int i = 0; i <= a; i++) {
//                int j = i + b;
//                System.out.println(arr[i][j]);
//            }
//            b++;
//            a--;
//        }
//        OPTIMIZE SOLUTION
        for(int a = 0 ; a < arr.length ; a++){
            int i = 0;
            for(int j = a ; j < arr.length ; j++){
                System.out.println(arr[i][j]);
                i++;
            }
        }
    }
}
