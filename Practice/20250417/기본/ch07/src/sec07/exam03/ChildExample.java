package sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        Child child = (Child)parent;
        child.field2="data2";
        child.method3();
    }
//   형 변형을 진행하기전에는 parent class의 객체이므로 field2와 method3을 참조할 수 없음.
}
