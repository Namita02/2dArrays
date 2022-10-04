public class ExitPointOfAMatrix {
    public static void exitpoint(int[][]arr) {
        int direction = 0;
        int i = 0;
        int j = 0;
//            direction = 0(east)
//            direction = 1(south)
//            direction = 2(west)
//            direction = 3(north)
        while (true) {
            direction = (arr[i][j] + direction) % 4;
            if (direction == 0) {
                j++;
            } else if (direction == 1) {
                i++;
            } else if (direction == 2) {
                j--;
            } else if (direction == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
