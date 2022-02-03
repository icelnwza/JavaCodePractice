public class SortArrayOdd {

        public static int[] sortDesc(int[] array) {


            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int temp = 0;
                        if (array[j] < array[i] && array[i]%2 !=0 && array[j]%2 !=0) {
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                }
                System.out.print(array[i]);//

            }
            System.out.println();
            return array;
        }

        public static void main(String[] args) {
                sortDesc(new int[]{ 5, 3, 1, 8, 0 }); //13580
                sortDesc(new int[]{ 5,4,3,2,1}); //13580
        }
    }
