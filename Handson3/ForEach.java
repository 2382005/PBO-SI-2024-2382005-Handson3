package Handson3;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        numbers.forEach(number -> {
            if (number % 3 == 0) {
                return;
            }
            System.out.println(number);
        });
    }
}
