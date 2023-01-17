//package baekjoon;
//// Int 안되서 next 로 바꿈
//import java.io.*;
//import java.util.*;
//
//public class Q10816 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuffer bf = new StringBuffer();
//        String n = st.nextToken();
//        st = new StringTokenizer(br.readLine());
//        List<String> cardStorage = new ArrayList<>();
//        for (int i = 0; i < Integer.parseInt(n); i++) {
//            cardStorage.add(st.nextToken());
//        }
//        st = new StringTokenizer(br.readLine());
//        int m = Integer.parseInt(st.nextToken());
//
//        List<String> cards = new ArrayList<>();
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < m; i++) {
//            cards.add(st.nextToken());
//        }
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < cards.size(); i++) {
//            int count = 0;
//            String s = cards.get(i);
//            cardStorage.indexOf();
//            if (cardStorage.contains(s)) {
//                for (String value : cardStorage) {
//                    if (value.equals(s)) {
//                        count++;
//                    }
//                }
//                list.add(i, count);
//            } else {
//                list.add(i, count);
//            }
//        }
//        for (int i : list) {
//            System.out.println(i + " ");
//        }
//    }
//
//}
