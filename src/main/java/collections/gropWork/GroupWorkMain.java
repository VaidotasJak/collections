package collections.gropWork;

import java.util.*;

public class GroupWorkMain {
    public static void main(String[] args) {
        List<Equipment> equipment1 = new ArrayList<>();
        List<Equipment> equipment2 = new ArrayList<>();
        List<Equipment> equipment3 = new ArrayList<>();
        List<Equipment> equipment4 = new ArrayList<>();


        Equipment parashute1 = new Equipment("Sybre2", true);
        Equipment parashute2 = new Equipment("Sybre3", true);
        Equipment parashute3 = new Equipment("Sybre3", true);
        Equipment parashute4 = new Equipment("Vigil", true);

        Equipment altimeter1 = new Equipment("Cypress", true);
        Equipment altimeter2 = new Equipment("Cypress", true);
        Equipment altimeter3 = new Equipment("Cypress", true);
        Equipment altimeter4 = new Equipment("Cypress", true);

        Equipment helmet1 = new Equipment("Cookie2", true);
        Equipment helmet2 = new Equipment("Cookie3", true);
        Equipment helmet3 = new Equipment("Cookie3", true);
        Equipment helmet4 = new Equipment("Cookie5", true);

        equipment1.add(parashute1);
        equipment1.add(altimeter1);
        equipment1.add(helmet1);

        equipment2.add(parashute2);
        equipment2.add(altimeter2);
        equipment2.add(helmet2);

        equipment3.add(parashute3);
        equipment3.add(altimeter3);
        equipment3.add(helmet3);

        equipment4.add(parashute4);
        equipment4.add(altimeter4);
        equipment4.add(helmet4);

        Set<Skydiver> skydiverList = new HashSet<>();

        Skydiver skydiver1 = new Skydiver("Vigis", 250, equipment1);
        Skydiver skydiver2 = new Skydiver("Algis", 300, equipment2);
        Skydiver skydiver3 = new Skydiver("Stasys", 1500, equipment3);
        Skydiver skydiver4 = new Skydiver("Alfukas", 10000, equipment4);

        skydiverList.add(skydiver1);
        skydiverList.add(skydiver2);
        skydiverList.add(skydiver3);
        skydiverList.add(skydiver4);

        Map<String, List<Equipment>> equipmentMap = new HashMap<>();
        for (Skydiver skydiver : skydiverList) {
            equipmentMap.put(skydiver.getName(), skydiver.getItems());
        }

        Set<String> skydiverSet = new HashSet<>();
        for (Skydiver skydiver : skydiverList) {
            skydiverSet.add(skydiver.getName());
        }

        Manifest manifest = new Manifest("FreeFallOnly", 12, skydiverList, equipmentMap, skydiverSet);


    }
}
