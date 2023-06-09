package zerobase;

import static zerobase.Pager.printNextPageMessage;
import static zerobase.Pager.printPreviousPageMessage;

public class MiniTask_3_230608 {

    public static void main(String[] args) {
        long totalCount = 127L;
        long pageIndex = 1L;

        Pager pager = new Pager(totalCount);
        printPreviousPageMessage();
        System.out.println(pager.html(pageIndex));
        printNextPageMessage();
    }
}

class Pager {

    private final long totalCount;

    public Pager(long totalCount) {
        this.totalCount = Math.round((double) totalCount / 10);
    }

    public StringBuilder html(long totalCount) {
        long page = checkPage(totalCount);

        StringBuilder stringBuilder = new StringBuilder();

        for (long i = page; i <= this.totalCount; i++) {
            if (i % 10 == 0) {
                if (totalCount == 10) {
                    stringBuilder.append("<a href='#' class='on'>").append(i).append("</a>").append("\n");
                    break;
                }
                stringBuilder.append("<a href='#'>").append(i).append("</a>").append("\n");
                break;
            }
            if (totalCount == i) {
                stringBuilder.append("<a href='#' class='on'>").append(i).append("</a>").append("\n");
                continue;
            }
            stringBuilder.append("<a href='#'>").append(i).append("</a>").append("\n");
        }
        return stringBuilder;
    }

    private long checkPage(long totalCount) {
        int page = 1;
        int MaxPage = 10;
        while (totalCount > MaxPage) {
            page += 10;
            MaxPage += 10;
        }
        return page;
    }

    public static void printPreviousPageMessage() {
        System.out.println("<a href='#'>[처음]</a>");
        System.out.println("<a href='#'>[이전]</a>" + "\n");
    }

    public static void printNextPageMessage() {
        System.out.println("<a href='#'>[다음]</a>");
        System.out.println("<a href='#'>[마지막]</a>");
    }
}