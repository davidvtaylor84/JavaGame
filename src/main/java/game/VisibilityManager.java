package game;

import game.UserInterface;

public class VisibilityManager {

    UserInterface userInterface;
    public VisibilityManager(UserInterface userInterface){
        userInterface = userInterface;
    }

    public void showTitleScreen(){
        userInterface.titleNamePanel.setVisible(true);
        userInterface.startButtonPanel.setVisible(true);

        userInterface.mainTextPanel.setVisible(false);
        userInterface.choiceButtonPanel.setVisible(false);
        userInterface.playerStatsPanel.setVisible(false);
        userInterface.locationPanel.setVisible(false);
        userInterface.mainTextPanel.setVisible(false);
        userInterface.choiceButtonPanel.setVisible(false);
        userInterface.imagePanel.setVisible(false);
        userInterface.inventoryPanel.setVisible(false);
        userInterface.playerStatsPanel.setVisible(false);
    }
}

