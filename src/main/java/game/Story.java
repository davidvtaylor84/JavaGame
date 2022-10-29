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
//        player.setHealthPoints(10);
//        player.setInsight(0);
//        player.setDefence(3);
//        player.setInspiration(0);
//        player.setIntelligence(4);
        userInterface.healthLabelStat.setText(Integer.toString(10));
        userInterface.insightLabelStat.setText(Integer.toString(0));
        userInterface.defenceLabelStat.setText(Integer.toString(3));
        userInterface.inspirationLabelStat.setText(Integer.toString(0));
        userInterface.intelligenceLabelStat.setText(Integer.toString(4));
    }

    public void enterTheTown(){
        userInterface.mainTextArea.setText("Point Pleasant is a quiet town. \nA quiet fortitude lurks among the people. You wait by your parked car and decide what to do.\nWhere to go next?");
        userInterface.choice1.setText("Go into the newspaper office");
        userInterface.choice2.setText("Go into the hotel");
        userInterface.choice3.setText("Pet the dog");
        userInterface.choice4.setText("Kiss your mother");
        userInterface.choice5.setText("Leave town");
        userInterface.locationTextArea.setText("Point Pleasant Town Centre");
    }

}
