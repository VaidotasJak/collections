package groupWork;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class BasketballManager {
    private Set<Coach> coachSet;
    private Set<Team> teamSet;
    private Set<Player> playersSet;

    public Set<Player> createPlayersSet(Player... players){
        return new HashSet<>(Arrays.asList(players));
    }

    public Set<Team> createTeamsSet(Team... teams){
        return new HashSet<>(Arrays.asList(teams));
    }

    public Set<Player> createListOfPlayers(){
        Player kobe = new Player("Kobe", 28.4, 6.5, 17, 2000000);
        Player james = new Player("James", 31.5, 8.9, 21, 3000000);
        Player duncan = new Player("Duncan", 24.5, 12.5, 15, 1500000);
        Player paul = new Player("Paul", 26.7, 5.5, 13, 1800000);
        Player shaq = new Player("Shaq", 31.5, 14.5, 15, 2500000);
        Player durant = new Player("Durant", 32.5, 7, 13, 3500000);
        Player manu = new Player("Manu", 23, 6.5, 16, 1200000);
        Player luka = new Player("Luka", 34, 7, 4, 4000000);

        playersSet = new HashSet<>(Arrays.asList(kobe, james, duncan, paul, shaq, durant, manu, luka));
        return playersSet;
    }


}
