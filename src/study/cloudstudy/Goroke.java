package study.cloudstudy;

public class Goroke {
    public static void main(String[] args) {
        /* 1. TOP 3 고로케를 객체로 만드세요. */
        Goroke1 goroke1 = new Goroke1("피자", 1000);
        Goroke1 goroke2 = new Goroke1("야채", 800);
        Goroke1 goroke3 = new Goroke1("팥", 500);

        /* 2. 고로케 정보를 출력하세요. */
        System.out.println(goroke1.str());
        System.out.println(goroke2.str());
        System.out.println(goroke3.str());
    }
}

class Goroke1 {
    // 필드
    String name;
    int price;

    // 생성자
    Goroke1(String n, int p) {
        name = n;
        price = p;
    }

    // 메소드
    String str() {
        return String.format("Goroke { name: %s, price: %d원 }", name, price);
    }
}

