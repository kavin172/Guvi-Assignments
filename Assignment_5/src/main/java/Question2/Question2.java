package Question2;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("abc","","bc","ef","abcd","","jkl"));
        System.out.println("String before processing"+list);
        List<String> newList = list.stream().filter(a -> a.length()>0).toList();
        System.out.println("String after processing"+newList);
    }
}
