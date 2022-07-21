package office_hours;

import java.util.Arrays;

public class Pracs {

    public static void main(String[] args) {

        char[] arrays = {'d', 'b', 'c', 'a'};
        Arrays.sort(arrays);
        for (char each : arrays) {
            System.out.println(each + " ");
            if (each == 'd') {
                continue;
            }
        }


    }
}
