package zerobase;

import java.util.*;

public class CodingTest_230713_3 {
    public static int solution(String[] ingredients, String[] items) {
        Set<String> ingredientSet = new HashSet<>(Arrays.asList(ingredients));

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        Map<String, Integer> ingredientCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            if (ingredientSet.contains(item)) {
                ingredientCount.put(item, ingredientCount.getOrDefault(item, 0) + 1);
                if (ingredientCount.get(item) == 1) {
                    count++;
                }

                while (count == ingredientSet.size()) {
                    if (i - start + 1 < minLength) {
                        minLength = i - start + 1;
                    }

                    String startItem = items[start];
                    if (ingredientSet.contains(startItem)) {
                        ingredientCount.put(startItem, ingredientCount.get(startItem) - 1);
                        if (ingredientCount.get(startItem) == 0) {
                            count--;
                        }
                    }
                    start++;
                }
            }
        }
        return minLength;
    }


    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"생닭", "인삼", "소주", "대추",},
                new String[]{"물", "인삼", "커피", "생닭", "소주", "사탕", "생닭", "대추", "쌀"})); // 7
    }

}
