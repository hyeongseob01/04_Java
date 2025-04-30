package ch15.sec05.exam04;

import sec05.exam04.Fruit;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("포도", 3000));
        fruitList.add(new Fruit("수박", 10000));
        fruitList.add(new Fruit("딸기", 6000));

        Collections.sort(fruitList, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return Integer.compare(f1.getAge(), f2.getAge());
            }
        });

        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getName() + " : " + fruit.getAge());
        }
    }
}
