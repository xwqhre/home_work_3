import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class zU {
    public static void main(String[] args) {
        double[] numbers = {16.3, 2.0, -14.5, 54.0, 91.4, -4.3, -32.0, 9.0, 22.1, 9.9, -33.1, 7.3, -13.1, -2.2};
        double num1 = 0.0;
        int num = 0;
        for (int a1 = 0; a1 < numbers.length; a1++) {
            if (numbers[a1] < 0) {
                for (int a2 = a1 + 1; a2 < numbers.length; a2++) {
                    if (numbers[a2] > 0) {
                        num1 = num1 + numbers[a2];
                        num++;
                    }
                }
                break;
            }

        }
        System.out.println("average  " + num1);
        System.out.println("count  " + num);
        System.out.println("average/count " + num1 / num);
    }

    int[] array = {-7, -4, -2, 2, 3, 6, 8};
            System.out.println(Arrays.toString(array));

}



