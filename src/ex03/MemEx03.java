package ex03;

/**
 * 지구인 : 걷는다 (행위 특징), 말한다 (행위 특징)
 * 아시아인 : 황색피부 (상태 특징)
 * 아프리카인 : 검정색피부 (상태 특징)
 * 일본인 (Object) : 일본어로 말한다 (행위 특징)
 * 한국인 (Object) : 한국어로 말한다 (행위 특징)
 * 소말리아인 (Object) : 소말리어어로 말한다 (행위 특징)
 */

class 지구인{
    public void walk(){
        System.out.println("걷는다");
    }
    
    // 오버라이드
    public void speak(){
        // ? 어떻게 말하는지 구체적인 것은 모르겠어!
    }
    
    // 오버라이드
    public String getSkin(){
        return ""; // 내가 무슨 색인지 모르겠어
    }
}
class 아시아인 extends 지구인{
    String skin = "황색피부";

    // 재정의
    public String getSkin() {
        return skin;
    }
}
class 아프리카인 extends 지구인{
    String skin = "검정색피부";

    // 재정의
    public String getSkin() {
        return skin;
    }
}
class 일본인 extends 아시아인{
    public void speak(){
        System.out.println("일본어로 말한다");
    }
}
class 한국인 extends 아시아인{
    public void speak(){
        System.out.println("한국어로 말한다");
    }
}
class 소말리아인 extends 아프리카인{
    public void speak(){
        System.out.println("소말리아어로 말한다");
    }
}

/**
 * 타입에 따라 변수를 찾아간다.
 * 상속을 통해 메모리 구조를 디자인할 수 있다.
 */
public class MemEx03 {

    // DIP를 지켰음 (구체적인 것이 아닌 추상적인 것에 의존함)
    // OCP를 지켰음 (코드 변경이 일어나지 않음)
    public static void start(지구인 obj) {
        System.out.println(obj.getSkin()); // 동적바인딩
        obj.walk();
        obj.speak(); // 동적바인딩
    }

    public static void main(String[] args) {
        start(new 한국인());
        start(new 일본인());
        start(new 소말리아인());
    }
}
