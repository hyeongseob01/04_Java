package sec05.exam03;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍길동", 35));
        list.add(new Person("감자바", 25));
        list.add(new Person("신용권", 31));

        Collections.sort(list);

        for (Person p : list) {
            System.out.println(p.getName() + ": " + p.getAge());
        }
    }
}
