public class RingRotate {
    public static void ringrotate(int[][] arr, int s, int r) {
        int[] onedarray = fromshelltooned(arr, s);
//        for (int i=0;i<onedarray.length;i++){
//            System.out.print(onedarray[i]+"\t");
//        }
        rotate(onedarray, r);
        fromonedtoshell(arr, s, onedarray);
    }
    public static int[] rotate(int[] array, int r){
       r = r % array.length;
       if(r < 0){
           r = r + array.length;
       }
       reverse(array,0 , array.length - r - 1);
       reverse(array,array.length - r, array.length - 1);
       reverse(array,0,array.length-1);
       return array;
    }
    public static int[] reverse(int[] array , int leftindex , int rightindex){

        while(leftindex < rightindex) {
            int temp = array[leftindex];
            array[leftindex] = array[rightindex];
            array[rightindex] = temp;
            leftindex++;
            rightindex--;
        }
        return array;
    }
    public static int[]  fromshelltooned( int[] [] arr, int s){
        int minrow = s - 1;
        int mincolumn = s - 1;
        int maxrow = arr.length - s;
        int maxcolumn = arr[0].length - s;
        int size = 2 * (maxrow - minrow + maxcolumn - mincolumn);
        int [] oned = new int[size];
        int index = 0;
        for(int i = minrow ; i <= maxrow ; i++){
            int j = mincolumn;
            oned [index] = arr[i][j];
            index++;
        }
        mincolumn++;
        for(int j = mincolumn ; j<= maxcolumn ; j++){
            int i = maxrow;
            oned[index] = arr[i][j];
            index ++;
        }
        maxrow--;
        for(int i = maxrow ; i>= minrow; i--){
           int j = maxcolumn;
            oned[index] = arr[i][j];
            index ++;
        }
        maxcolumn--;
        for(int j = maxcolumn ; j >= mincolumn ; j--){
            int i = minrow;
            oned[index] = arr[i][j];
            index ++;
        }
        return oned;
    }
    public static int[][] fromonedtoshell( int[] [] arr,int s,int[] oned){
        int minrow = s - 1;
        int mincolumn = s - 1;
        int maxrow = arr.length - s;
        int maxcolumn = arr[0].length - s;

        int index = 0;
        for(int i = minrow ; i <= maxrow ; i++){
            int j = mincolumn;
            arr[i][j] =  oned[index];
            index++;
        }
        mincolumn++;
        for(int j = mincolumn ; j<= maxcolumn ; j++){
            int i = maxrow;
            arr[i][j] =  oned[index];
            index ++;
        }
        maxrow--;
        for(int i = maxrow ; i>= minrow; i--){
            int j = maxcolumn;
            arr[i][j] =  oned[index];
            index ++;
        }
        maxcolumn--;
        for(int j = maxcolumn ; j >= mincolumn ; j--){
            int i = minrow;
            arr[i][j] =  oned[index];
            index ++;
        }
        return arr;
    }
}
