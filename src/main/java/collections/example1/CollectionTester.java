package collections.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        List<Integer> luckyNUmber = new ArrayList<>();
        luckyNUmber.add(4);
        luckyNUmber.add(7);
        luckyNUmber.add(1);

        luckyNUmber.forEach(System.out::println);

        Integer sp = luckyNUmber.get(1);
        luckyNUmber.remove(1);

        Set<String> luckynames = new HashSet<>();
        luckynames.add("1. Mantas");
        luckynames.add("2. Tautvis");
        luckynames.add("3. Goda");
        luckynames.add("4. Lukas");

        luckynames.forEach(System.out::println);
        for (String luckyNames : luckynames ) {
                if(luckyNames.contains("Goda")){
                    System.out.println(luckyNames);
                }
        }


        Map<Integer, Computer> computerMap = new HashMap<>();
        computerMap.put(5, new Computer("Dell Cool machine"));

        Computer apple = new Computer("Applte hot mashine");
        computerMap.put(3, apple);

        System.out.println(computerMap);
        Collection<Computer> values = computerMap.values();
        System.out.println("values:" + values);

        Set<Integer> keys = computerMap.keySet();
        System.out.println("keys:" + keys);

        Set<Map.Entry<Integer, Computer>> entries = computerMap.entrySet();
        System.out.println("entries:" + entries);

        for (Map.Entry<Integer, Computer> singleEntry : computerMap.entrySet()) {
            singleEntry.getKey();
            singleEntry.getValue();
        }

    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Computer {
    private String name;
}
