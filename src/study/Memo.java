package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            bookList.add(new Book(scanner.next(), scanner.nextInt()));
        }
        Books books = new Books(bookList);

        for (Book a : books.getBookList()) {
            System.out.print(a.getName() + ": ");
            Position.position(books);
        }

    }
}

class Position {
    public static void position(Books books) {
        for (Book b : books.getBookList()) {
            int number = b.getNum();
            숫자.hyphen(number);
        }
    }

}

class 숫자 {
    public static void hyphen(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

class Book {
    private final String name;
    private final int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}

class Books {
    private final List<Book> bookList;

    public Books(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
