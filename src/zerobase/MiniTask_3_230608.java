package zerobase;

public class MiniTask_3_230608 {

    public static void main(String[] args) {
        long totalCount = 127L;
        long pageIndex = 1L;

        Pager pager = new Pager(totalCount);
        pager.html(pageIndex);
    }
}

class Pager {

    private final long totalCount;

    public Pager(long totalCount) {
        this.totalCount = Math.round((double) totalCount / 10);
    }

    public void html(long totalCount) {
        long page = checkPage(totalCount);

        printPreviousPageMessage();

        for (long i = page; i <= this.totalCount; i++) {
            if (i % 10 == 0) {
                if (totalCount == 10) {
                    System.out.println("<a href='#' class='on'>" + i + "</a>");
                    break;
                }
                System.out.println("<a href='#'>" + i + "</a>");
                break;
            }
            if (totalCount == i) {
                System.out.println("<a href='#' class='on'>" + i + "</a>");
                continue;
            }
            System.out.println("<a href='#'>" + i + "</a>");

        }
        printNextPageMessage();
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

    private void printPreviousPageMessage() {
        System.out.println("<a href='#'>[처음]</a>");
        System.out.println("<a href='#'>[이전]</a>" + "\n");
    }

    private void printNextPageMessage() {
        System.out.println("\n" + "<a href='#'>[다음]</a>");
        System.out.println("<a href='#'>[마지막]</a>");
    }
}