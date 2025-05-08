package sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        System.out.println("오름차순 정렬:");
        studentList.stream()
                .sorted(Comparator.comparingInt(Student::getScore))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        System.out.println();

        System.out.println("내림차순 정렬:");
        studentList.stream()
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}

