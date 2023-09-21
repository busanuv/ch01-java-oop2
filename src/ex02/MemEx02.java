package ex02;

/**
 * 지구인 : 걷는다 (행위 특징), 말한다 (행위 특징)
 * 아시아인 : 황색피부 (상태 특징)
 * 아프리카인 : 검정색피부 (상태 특징)
 * 일본인 (Object) : 일본어로 말한다 (행위 특징)
 * 한국인 (Object) : 한국어로 말한다 (행위 특징)
 * 소말리아인 (Object) : 소말리어어로 말한다 (행위 특징)
 */

class 지구인 {
    public void walk() {
        System.out.println("걷는다");
    }

    public void speak() {
        // ? 어떻게 말하는지 구체적인 것은 모르겠어!
    }
}

class 아시아인 extends 지구인 {
    String skin = "황색피부";
}

class 아프리카인 extends 지구인 {
    String skin = "검정색피부";
}

class 일본인 extends 아시아인 {
    public void speak() {
        System.out.println("일본어로 말한다");
    }
}

class 한국인 extends 아시아인 {
    public void speak() {
        System.out.println("한국어로 말한다");
    }
}

class 소말리아인 extends 아프리카인 {
    public void speak() {
        System.out.println("소말리아어로 말한다");
    }
}

/**
 * 타입에 따라 변수를 찾아간다.
 * 상속을 통해 메모리 구조를 디자인할 수 있다.
 */
public class MemEx02 {

    public static void start(한국인 obj) {
        System.out.println(obj.skin);
        obj.walk();
        obj.speak();
    }

    public static void start(아시아인 obj) {
        System.out.println(obj.skin);
        obj.walk();
        obj.speak(); // 동적바인딩
    }

    public static void start(지구인 obj) {
        //System.out.println(obj.skin); // 문제 : 지구인은 skin 변수를 들고 있지 않음.
        obj.walk();
        obj.speak(); // 동적바인딩
    }

    public static void main(String[] args) {
        // step1
        한국인 obj = new 한국인(); // (한국인) - 아시아인 - 지구인
        System.out.println("step1--------");
        start(new 한국인()); // start(한국인 obj)

        // step2
        System.out.println("step2--------");
        start(new 일본인()); // start(아시아인 obj)

        // step3
        System.out.println("step3--------");
        start(new 소말리아인()); // start(지구인 obj)
    }
}
