package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 트리의 부모 찾기
public class B11725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tree.get(a).add(b);
            tree.get(b).add(a);
            System.out.println(tree + " = ");
        }

        int[] parents = new int[n + 1];
        dfs(tree, parents, 1, 0);

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void dfs(List<List<Integer>> tree, int[] parents, int current, int parent) {
        parents[current] = parent;

        for (int child : tree.get(current)) {
            if (child != parent) {
                dfs(tree, parents, child, current);
            }
        }
    }
}