package zerobase;

import java.util.Arrays;

public class CodingTest_230811_1 {
    public static String[] solution(int n) {
        String[] result = new String[5];

        String[] numbers = {
                "##### --#-- #### #### ##### ##### ##### ##### ##### #####",
                "#---# --#-- ---# ---# #---# #---- #---- ----# #---# #---# #---#",
                "##### --#-- #### #### ##### ##### ----# ##### ##### --#-- #####",
                "#---# --#-- #--- ---# ----# ----# #---# ----# #---# --#-- #---#",
                "##### --#-- #### #### ----# ##### ##### ----# ##### --#-- #####"
        };

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();
            int digit = n % 10;
            n /= 10;

            for (int j = 0; j < 5; j++) {
                line.append(numbers[i], digit * 6, digit * 6 + 5).append(" ");
            }

            result[4 - i] = line.toString().trim();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(132)));
        /*
         {"--#-- #### ####",
          "--#-- ---# ---#",
          "--#-- #### ####",
          "--#-- ---# #---",
          "--#-- #### ####"}
        */
    }

}
