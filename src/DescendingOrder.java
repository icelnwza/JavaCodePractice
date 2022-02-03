import java.util.Arrays;
import java.util.LinkedList;

public class DescendingOrder {
    public static int sortDesc(int num) {

        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                int temp = 0;
                if (digits[i] < digits[j]) {
                    temp = digits[j];
                    digits[j] = digits[i];
                    digits[i] = temp;
                }
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i : digits) {
            s.append(i);
        }

        return Integer.parseInt(s.toString());
    }


    public static void main(String[] args) {
        sortDesc(12345);

    }
}