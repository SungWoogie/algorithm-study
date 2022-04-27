package baekjoon;

import java.util.*;

public class Q9934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 트리의 노드 개수
        int k = (int) Math.pow(2, scanner.nextInt()) - 1;

        // 인오더 탐색의 결과로 방문한 노드
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(scanner.nextInt());
        }

        Node root = buildTree(list, 0, list.size() - 1);
        printTree(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node buildTree(List<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int i = (start + end) / 2;
        Node node = new Node(inorder.get(i)); // root node

        if (start == end) {

            return node;
        }

        node.left = buildTree(inorder, start, i - 1);
        node.right = buildTree(inorder, i + 1, end);
        return node;
    }

    static void printTree(Node root) {
        StringBuilder result = new StringBuilder();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node node = queue.poll();
                result.append(node.data + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
