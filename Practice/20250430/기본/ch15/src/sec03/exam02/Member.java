package sec03.exam02;

import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
import java.util.TreeSet;

@Data // getter, setter, toString 등 포함
@AllArgsConstructor // 생성자 자동 생성
@EqualsAndHashCode

public class Member {
    public String name;
    public int age;

}
