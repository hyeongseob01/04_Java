package sec07.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동",30));
        list.add(new Student("신용권",10));
        list.add(new Student("유미선",20));

        System.out.println("오름차순:");
        list.stream()
                .sorted(Comparator.comparingInt(Student::getScore))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        System.out.println();

        System.out.println("내림차순:");
        list.stream()
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }

}
