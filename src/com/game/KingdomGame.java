package com.game;

import com.game.model.Game;
import com.game.model.Player;
import com.game.view.GameMenuView;
import com.game.view.HelpMenuView;
import com.game.view.InventoryMenuView;
import com.game.view.MenuView;
import com.game.view.MapView;
import com.game.view.StartProgramView;

public class KingdomGame {

    private static Game                     currentGame         = null;
    private static Player                   player              = null;

    private static final StartProgramView   startProgramView    = new StartProgramView();
    private static final MenuView           MenuView        = new MenuView();
    private static final MapView            mapView             = new MapView();
    private static final HelpMenuView       helpMenuView        = new HelpMenuView();
    private static final GameMenuView       gameMenuView        = new GameMenuView();
    private static final InventoryMenuView  inventoryMenuView   = new InventoryMenuView();
    
    public static void main(String[] args) {
        try {
            com.game.KingdomGame.startProgramView.display(); 
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
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

    public static MapView getMapView() {
        return mapView;
    }

    public static HelpMenuView getHelpMenuView() {
        return helpMenuView;
    }

    public static GameMenuView getGameMenuView() {
        return gameMenuView;
    }

    public static InventoryMenuView getInventoryMenuView() {
        return inventoryMenuView;
    }

}
