package sec08.exam02;

public class Computer {

    // 가변 인자 메서드 (정수 여러 개를 받을 수 있음)
    int sum(int... values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
