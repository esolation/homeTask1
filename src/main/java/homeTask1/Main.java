package homeTask1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
     int [] num = {1,2,3,4,5};
     List<Integer> num1 = IntStream.of(num).boxed().collect(Collectors.toList());
        System.out.println(Collections.max(num1));


    }
}
