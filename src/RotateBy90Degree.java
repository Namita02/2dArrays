public class RotateBy90Degree {
    public static void rotate(int[][] arr){

       for(int i = 0  ; i < arr.length  ; i++){
           for(int j = i ; j < arr[0].length ; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
           }
           }
       for(int i = 0 ; i<arr.length;i++){
          int leftindex = 0;
          int rightindex = arr[i].length - 1;
          while(leftindex < rightindex){
              int temp = arr[i][leftindex];
              arr[i][leftindex] = arr[i][rightindex];
              arr[i][rightindex] = temp;
              leftindex++;
              rightindex--;
          }
           }
    }
}