package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;

public class Game {

    DecisionHandler decisionHandler = new DecisionHandler();
    UserInterface userInterface = new UserInterface();
    VisibilityManager visibilityManager = new VisibilityManager(userInterface);

    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        userInterface.createInterface(decisionHandler);
        visibilityManager.showTitleScreen();
    }

    public class DecisionHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String yourDecision = e.getActionCommand();

            switch (yourDecision){
                case "start": break;
                case "c1": break;
                case "c2": break;
                case "c3": break;
                case "c4": break;
                case "c5": break;
            }

        }
    }

}