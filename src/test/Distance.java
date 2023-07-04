package test;

import java.text.DecimalFormat;

public class Distance {
    public static void main(String[] args) {
        double a = 37.4811992;
        double b = 126.8955438;

        double x1 = 37.480824;
        double x2 = 126.696065;  // 0.0621

        double y1 = 37.480507;
        double y2 = 126.894295;  // 0.1344



        DecimalFormat decimalFormat = new DecimalFormat("#.####"); // 소숫점 네 자리까지 포맷


//        double distance = distance(a, b, x1, x2);
        double distance = Double.parseDouble(decimalFormat.format(calculateDistance(a, b, y1, y2)));
        System.out.println(distance);
    }
    private static final double EARTH_RADIUS = 6371.0; // 지구 반지름 (단위: km)

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = EARTH_RADIUS * c;
        return distance;
    }

//    public static double distance(double lat1, double lon1, double lat2, double lon2) {
//        double theta = lon1 - lon2;
//        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
//        dist = Math.acos(dist);
//        dist = rad2deg(dist);
//        dist = (dist * 60 * 1.1515) * 1609.344;
//        System.out.println("dist1 : " + dist);
//
//
//        double v = dist / 1_000;
//        if (v < 20) {
//            System.out.println(v);
//        }
//        return v; //단위 kilometer
//    }
//
//    //10진수를 radian(라디안)으로 변환
//    private static double deg2rad(double deg) {
//        return (deg * Math.PI / 180.0);
//    }
//
//    //radian(라디안)을 10진수로 변환
//    private static double rad2deg(double rad) {
//        return (rad * 180 / Math.PI);
//    }

}
