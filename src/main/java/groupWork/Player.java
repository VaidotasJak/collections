package groupWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private String name;
    private double ppg;
    private double rpg;
    private int experienceInYears;
    private int salary;
}
