package sec10.exam02;

public class Cat extends Animal {
    @Override
    public void breath(){
        System.out.println("고양이가 숨을 쉽니다.");
    }
    public void sound(){
        System.out.println("냐옹");
    }
}
