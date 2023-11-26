package groupWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    private String name;
    private int budget;
    private Coach coach;
    private Set<Player> playerList;
}
