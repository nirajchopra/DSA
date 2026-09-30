import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
    Set<Integer> resultSet = new HashSet<>();

    for (int i = 0; i < digits.length; i++) {
        for (int j = 0; j < digits.length; j++) {
            if (j == i) continue;

            for (int k = 0; k < digits.length; k++) {
                if (k == i || k == j) continue;

                int d1 = digits[i];
                int d2 = digits[j];
                int d3 = digits[k];

                if (d1 == 0) continue;
                int number = d1 * 100 + d2 * 10 + d3;

                if (number % 2 == 0) {
                    resultSet.add(number);
                }
            }
        }
    }

    List<Integer> list = new ArrayList<>(resultSet);
    Collections.sort(list);

    // Convert List<Integer> to int[]
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        result[i] = list.get(i);
    }

    return result;
}


    public static void main(String[] args) {
    int[] digits = {2, 1, 3, 0};
    int[] result = findEvenNumbers(digits);
    System.out.println(Arrays.toString(result));
}

}