package zerobase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MiniTask_1_230605 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Property Information</title>\n" +
                            "    <style>\n" +
                            "        table { border-collapse: collapse; width: 100%; }\n" +
                            "        th, td { border: solid 1px #000; }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "    <h1>자바 환경정보</h1>\n" +
                            "    <table>\n" +
                            "        <tr>\n" +
                            "            <th>키</th>\n" +
                            "            <th>값</th>\n" +
                            "        </tr>\n");

            for (Object key : System.getProperties().keySet()) {
                String propertyKey = key.toString();
                String propertyValue = System.getProperty(propertyKey);
                writer.write(
                        "        <tr>\n" +
                                "            <td>" + propertyKey + "</td>\n" +
                                "            <td>" + propertyValue + "</td>\n" +
                                "        </tr>\n");
            }

            writer.write(
                    "    </table>\n" +
                            "</body>\n" +
                            "</html>");

            writer.close();
            System.out.println("property.html 파일이 성공적으로 생성되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

