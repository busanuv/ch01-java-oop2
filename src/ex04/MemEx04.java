package ex04;

/**
 * 1. 지구인, 아시아인, 아프리카인은 오브젝트가 아니다.
 * 2. 지구인, 아시아인, 아프리카인을 new 해서 메서드 인수에 집어 넣으면 프로그램은 망가진다.
 * 3. 아시아인과 아프리카인이 재정의를 안하게 된다면 프로그램이 망가진다.
 * 4. 지구인, 아시아인, 아프리카인에 추상 메서드를 만들어서 메서드 재정의를 강제시킨다.
 */

abstract class 지구인{
    public void walk(){
        System.out.println("걷는다");
    }
    public abstract void speak();
    public abstract String getSkin();
}
abstract class 아시아인 extends 지구인{
    String skin = "황색피부";

    @Override
    public String getSkin() {
        return skin;
    }
}
abstract class 아프리카인 extends 지구인{
    String skin = "검정색피부";

    @Override
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
class 중국인 extends 아시아인{
    @Override
    public void speak() {
        System.out.println("중국어로 말한다");
    }
}

public class MemEx04 {

    public static void start(지구인 obj) {
        System.out.println(obj.getSkin());
        obj.walk();
        obj.speak();
    }

    public static void main(String[] args) {
        start(new 한국인());
        start(new 일본인());
        start(new 소말리아인());
        start(new 중국인());
    }
}
