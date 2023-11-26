package groupWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {
    private String name;
    private int salary;
    private int experienceInYears;
    private String nationality;
}
