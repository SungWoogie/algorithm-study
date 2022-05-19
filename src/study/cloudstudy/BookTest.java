package study.cloudstudy;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        // 객체 생성
        Song s0 = new Song("별헤는 밤", "유재하");
        Song s1 = new Song("비상", "임재범");
        Song s2 = new Song("비밀", "박완규");

        // 객체 배열 생성
        Song[] songs = {s0, s1, s2};


        // 모든 배열 속 객체 출력
        for (Song song : songs) {
            /* 2. 객체 정보를 출력하세요. */
            System.out.println(song.toStr());
        }
    }
}

class Song {
    String name;
    String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    String toStr() {
        return String.format("Song { name: %s, singer: %s }", name, singer);
    }
}
