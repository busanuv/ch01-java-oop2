package ex01;

class 지구인{
    String name = "지구인";
}
class 아시아인 extends 지구인{
    String name = "아시아인";
}
class 아프리카인 extends 지구인{
    String name = "아프리카인";
}
class 일본인 extends 아시아인{
    String name = "일본인";
}
class 한국인 extends 아시아인{
    String name = "한국인";
}
class 소말리아인 extends 아프리카인{
    String name = "소말리아인";
}

/**
 * 타입에 따라 변수를 찾아간다.
 * 상속을 통해 메모리 구조를 디자인할 수 있다.
 */
public class MemEx01 {
    public static void main(String[] args) {
        한국인 n1 = new 한국인(); // (한국인) - 아시아인 - 지구인
        System.out.println("타입 한국인 : " +n1.name);
        
        지구인 n2 = new 한국인(); // 한국인 - 아시아인 - (지구인)
        System.out.println("타입 지구인 : " +n2.name);

        지구인 n3 = new 소말리아인(); // 소말리아인 - 아프리카인 - (지구인)
        System.out.println("타입 지구인 : " +n3.name);
    }
}
