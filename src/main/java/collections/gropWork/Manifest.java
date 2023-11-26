package collections.gropWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manifest {
    private String name;
    private int loadNumber;
    private Set<Skydiver> skydiverList;
    private Map<String, List<Equipment>> equipmentMap;
    private Set<String> skydiverSet;
}
