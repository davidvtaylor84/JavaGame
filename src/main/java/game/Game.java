package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;

public class Game {

    DecisionHandler decisionHandler = new DecisionHandler();
    UserInterface userInterface = new UserInterface();
    VisibilityManager visibilityManager = new VisibilityManager(userInterface);

    Story story = new Story(this, userInterface, visibilityManager);

    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        userInterface.createInterface(decisionHandler);
        story.playerDefault();
        visibilityManager.showTitleScreen();
    }

    public class DecisionHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String yourDecision = e.getActionCommand();

            switch (yourDecision){
                case "start": visibilityManager.showIntroScreen();break;
                case "startAfterIntro": visibilityManager.showGameScreen(); story.enterTheTown();break;
                case "c1": break;
                case "c2": break;
                case "c3": break;
                case "c4": break;
                case "c5": break;
            }

        }
    }

}
