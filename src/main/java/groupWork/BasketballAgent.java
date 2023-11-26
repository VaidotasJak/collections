package groupWork;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasketballAgent {
    private final double RPG_COF = 0.2;
    private final double PPG_COF = 0.35;
    private final double EXP_COF = 0.15;
    private final double SAL_COF = 0.30/100000;

    public Player findMostExpensivePlayer(League league){
        Player theMostExpensive = new Player();
        for (Division division : league.getDivisionsList()) {
            for (Team team : division.getTeamList()) {
                for (Player player : team.getPlayerList()) {
                    if(player.getSalary() > theMostExpensive.getSalary()){
                        theMostExpensive = player;
                    }
                }
            }
        }
        return theMostExpensive;
    }

    public Player findMostValueblePlayer(Team... teams){
        Player mvp = new Player();
        double mvpScore = 0;
        for (Team team : teams) {
            for (Player player : team.getPlayerList()) {
                double playerMvpScore = getPlayerMvpScore(player);
                if(mvpScore < getPlayerMvpScore(player)) {
                    mvp = player;
                    mvpScore = playerMvpScore;
                }
            }
        }
        return mvp;
    }

    private double getPlayerMvpScore(Player player) {
        return player.getRpg() * RPG_COF + player.getPpg() * PPG_COF +
                player.getExperienceInYears() * EXP_COF - player.getSalary() * SAL_COF;
    }

    public Coach findMostExperienceCoach(League league){
        Coach theMostExperience = new Coach();
        for (Division division : league.getDivisionsList()) {
            for (Team team : division.getTeamList()) {
                    if(team.getCoach().getExperienceInYears() > theMostExperience.getExperienceInYears()){
                        theMostExperience = team.getCoach();
                }
            }
        }
        return theMostExperience;
    }

    public List<Coach> getCoachedByGivenNationality(String nationality, League league){
        return league.getDivisionsList().stream()
                .flatMap(x -> x.getTeamList().stream())
                .map(Team::getCoach)
                .filter(coach -> coach.getNationality().equals(nationality)).collect(Collectors.toList());
    }


}

