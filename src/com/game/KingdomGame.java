package com.game;

import com.game.model.Game;
import com.game.model.Player;
import com.game.view.GameMenuView;
import com.game.view.HelpMenuView;
import com.game.view.InventoryMenuView;
import com.game.view.MenuView;
import com.game.view.StartProgramView;
import java.io.Serializable;

public class KingdomGame implements Serializable {

    private static Game                     currentGame         = null;
    private static Player                   player              = null;

    private static final StartProgramView   startProgramView    = new StartProgramView();
    private static final MenuView           MenuView            = new MenuView();
    private static final HelpMenuView       helpMenuView        = new HelpMenuView();
    private static final GameMenuView       gameMenuView        = new GameMenuView();
    private static final InventoryMenuView  inventory           = new InventoryMenuView();
    
    public static void main(String[] args) {
        try {
            startProgramView.startProgram(); 
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
        }
        
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        KingdomGame.currentGame     = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        KingdomGame.player          = player;
    }

    public static MenuView getMenuView() {
        return MenuView;
    }

    public static HelpMenuView getHelpMenuView() {
        return helpMenuView;
    }

    public static GameMenuView getGameMenuView() {
        return gameMenuView;
    }

    public static InventoryMenuView getInventoryMenuView() {
        return inventory;
    }

}
