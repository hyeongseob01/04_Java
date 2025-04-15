package self_study;

public class Code01 {
    public static void main(String[] args) {
        Student a = new Student();
        Person b = new Student();
        Person c = new Person();
        a.study();
        b.study();
        c.study();
    }
}

class Person {
    void study(){
        System.out.println("인생공부");
    }
}


class Student extends Person {
    void study(){
        System.out.println("학교공부");
    }
}