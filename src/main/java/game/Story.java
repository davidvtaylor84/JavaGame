package game;

public class Story {

    Game game;
    UserInterface userInterface;
    VisibilityManager visibilityManager;
    Player player;

    public Story(Game game, UserInterface userInterface, VisibilityManager visibilityManager){
        this.game = game;
        this.userInterface = userInterface;
        this.visibilityManager = visibilityManager;
    }

    public void playerDefault(){
        player.setHealthPoints(10);
        player.setInsight(0);
        player.setDefence(3);
        player.setInspiration(0);
        player.setIntelligence(4);
        userInterface.healthLabelStat.setText(Integer.toString(player.getHealthPoints()));
        userInterface.insightLabelStat.setText(Integer.toString(player.getInsight()));
        userInterface.defenceLabelStat.setText(Integer.toString(player.getDefence()));
        userInterface.inspirationLabelStat.setText(Integer.toString(player.getInspiration()));
        userInterface.intelligenceLabelStat.setText(Integer.toString(player.getIntelligence()));
    }

}
