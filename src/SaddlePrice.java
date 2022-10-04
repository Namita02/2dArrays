public class SaddlePrice {
    //    a number is minimum in its row and maximum in its column
    public static void saddlePrice(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][index]) {
                    index = j;
                }
            }
                int max = arr[0][index];
                for (int k = 1 ; k < arr.length; k++) {
                 if(arr[k][index] > max){
                     max = arr[k][index];
                 }
                }
                 if(max == arr[i][index]){
                     System.out.println(max);
                 }

        }
    }
}