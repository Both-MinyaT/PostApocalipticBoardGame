package src.bmtamas;

import java.util.List;

public class GameSpace {
    private List<Player> playerList;
    private List<CommonEnemy> commonEnemiesDrawDeck;
    private List<CommonEnemy> discardedCommonEnemies;
    private List<BossEnemy> bossEnemiesDrawDeck;
    private List<BossEnemy> discardedBossEnemies;
    private List<ActionCard> actionCardsDrawDeck;
    private List<ActionCard> discardedActionCards;
    private List<CommonGoal> commonGoalDeck;
    private CommonGoal theCommonGoal;
    private List<PersonalMission> personalMissionDeck;
    private List<Tile> tileList;
    private WorldMap map;

    public void newGame() {

    }
}
