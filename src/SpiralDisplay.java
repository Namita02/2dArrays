public class SpiralDisplay {
    public static void spiraldisplay(int[][]arr){
        int rowstart = 0;
        int rowend = arr[0].length - 1;
        int columnstart = 0;
        int columnend = arr.length - 1;
        int elements = arr.length * arr[0].length;
        int start = 0;
        while(start<=elements) {
            for (int i = columnstart; i <= columnend; i++) {
                int j = rowstart;
                System.out.println(arr[i][j]);
                start++;
            }
            rowstart++;
            for (int j = rowstart; j <= rowend; j++) {
                int i = columnend;
                System.out.println(arr[i][j]);
                start++;
            }
            columnend--;
            for (int i = columnend; i >= columnstart; i--) {
                int j = rowend;
                System.out.println(arr[i][j]);
                start++;
            }
            rowend--;
            for (int j = rowend; j >= rowstart; j--) {
                int i = columnstart;
                System.out.println(arr[i][j]);
                start++;
            }
            columnstart++;
        }

    }
}
//  0 1 2 3 4 5
//0 1 2 3 4 5 5
//1 1 2 3 4 5 5
//2 1 1 1 1 1 1
//3 1 1 1 1 1 1
