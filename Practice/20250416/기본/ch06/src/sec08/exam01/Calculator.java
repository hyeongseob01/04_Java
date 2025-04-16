package sec08.exam01;

public class Calculator {
    // 리턴값 없는 메서드: 전원 켜기
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 더하기: 두 정수의 합을 반환
    int plus(int x, int y) {
        return x + y;
    }

    // 나누기: 두 정수를 나눠서 실수(double)로 반환
    double divide(int x, int y) {
        return (double) x / y;
    }

    // 리턴값 없는 메서드: 전원 끄기
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
