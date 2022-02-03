import java.util.Arrays;

import static java.util.Arrays.stream;

public class Maps {
//    public static int[] map(int[] arr) {
//          return Arrays.stream(arr).map(number -> number * 2).toArray();
////        System.out.println(arrrr);
////          return arrrr;
//
//    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }


    public static void main(String[] args) {
       System.out.println(map(new int[]{1,2,3}));
    }
}