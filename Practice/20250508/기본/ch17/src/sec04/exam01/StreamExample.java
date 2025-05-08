package sec04.exam01;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            Product product = new Product(i, "상품"+i, "멋진회사", (int)(Math.random()*10000));
            list.add(product);
            Stream stream = list.stream();
            stream.forEach(System.out::println);
        }
    }
}
