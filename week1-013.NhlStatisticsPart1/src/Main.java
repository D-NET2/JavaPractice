import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Stats for Sidney");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Team stats for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        
        System.out.println("Team stats for Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
