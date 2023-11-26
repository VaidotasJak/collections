package collections.gropWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skydiver {
    private String name;
    private int noOfJumps;
    private List<Equipment> Items;

}
