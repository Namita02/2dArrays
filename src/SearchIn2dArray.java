public class SearchIn2dArray {
    public static void search(int[][] arr, int number) {
        int i = 0;
        int j = arr.length - 1;
        while (j >= 0 && i < arr.length) {
            if(number == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }
          else if (number > arr[i][j]) {
                i++;
            } else  {
                j--;
            }
        }

            System.out.println("not found");


    }
}