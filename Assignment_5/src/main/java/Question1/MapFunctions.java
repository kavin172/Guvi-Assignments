package Question1;

import java.util.ArrayList;
import java.util.List;

public class MapFunctions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("aBc","c","ae"));
        System.out.println("List before processing "+ list);
        List<String> uppercase = list.stream().map(String::toUpperCase).toList();
        System.out.println("upper case list "+uppercase);
    }
}
