package Question3;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Arun", "Ajay", "Kavin", "Raj", "Amar"));
        System.out.println("Student Name List " + nameList);
        List<String> specialGift = nameList.stream().filter(a -> a.startsWith("A")).toList();
        System.out.println("Student is going to get special gift "+ specialGift);
    }

}
