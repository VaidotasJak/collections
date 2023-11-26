package groupWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BasketballManager bm = new BasketballManager();

//        bm.createListOfPlayers();
        Player kobe = new Player("Kobe", 28.4, 6.5, 17, 2000000);
        Player james = new Player("James", 31.5, 8.9, 21, 3000000);
        Player duncan = new Player("Duncan", 24.5, 12.5, 15, 1500000);
        Player paul = new Player("Paul", 26.7, 5.5, 13, 1800000);
        Player shaq = new Player("Shaq", 31.5, 14.5, 15, 2500000);
        Player durant = new Player("Durant", 32.5, 7, 13, 3500000);
        Player manu = new Player("Manu", 23, 6.5, 16, 1200000);
        Player luka = new Player("Luka", 34, 7, 4, 4000000);


        Coach maskvytis = new Coach("Maskvytis", 350000, 25, "Lithuanian");
        Coach kemzura = new Coach("Kemzura", 100000, 30, "Spain");
        Coach krapikas = new Coach("Krapikas", 60000, 35, "Lithuanian");
        Coach grigas = new Coach("Grigas", 30000, 20, "Latvian");

        Team neptunas = new Team("Neptunas", 5_000_000, maskvytis, bm.createPlayersSet(duncan, manu));
        Team zalgiris = new Team("Zalgiris", 8_000_000, kemzura, bm.createPlayersSet(kobe, luka));
        Team rytas = new Team("Rytas", 6_000_000, krapikas, bm.createPlayersSet(durant, paul));
        Team kkRadviliskis = new Team("KkRadviliskis", 7_000_000, grigas, bm.createPlayersSet(james, shaq));

        Division divisionA = new Division("A div", bm.createTeamsSet(kkRadviliskis, zalgiris));
        Division divisionB = new Division("B div", bm.createTeamsSet(neptunas, rytas));

        League league = new League("FANTASY LEAGUE", new HashSet<>(Arrays.asList(divisionA, divisionB)));

        BasketballAgent basketballAgent = new BasketballAgent();
        Player mostExpensivePlayer = basketballAgent.findMostExpensivePlayer(league);
        System.out.println(mostExpensivePlayer);


        Player mostValueblePlayer = basketballAgent.findMostValueblePlayer(neptunas, zalgiris, rytas, kkRadviliskis);
        System.out.println(mostValueblePlayer);

        Coach mostExperiencedCoach = basketballAgent.findMostExperienceCoach(league);
        System.out.println(mostExperiencedCoach);

        System.out.println(basketballAgent.getCoachedByGivenNationality("Lithuanian", league));







    }
}
