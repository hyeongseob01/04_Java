package sec10.exam02;

public class Dog extends Animal {
    @Override
    public void breath() {
        System.out.println("강아지가 숨을 쉽니다.");
    }
    public void sound(){
        System.out.println("멍멍");
    }
}
