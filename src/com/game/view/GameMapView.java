package com.game.view;

import com.game.KingdomGame;
import com.game.control.GameControl;
import com.game.control.InventoryControl;
import com.game.model.Item;

public class GameMapView extends MenuView {

    public GameMapView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n    Map                               |"
            + "\n---------------------------------------"
            + "\n1 - Go to the Kingdom                 |"
            + "\n2 - Go to the General Store           |"
            + "\n3 - Go to the Icy Caves               |"
            + "\n4 - Go to the Fiery Depths            |"
            + "\n5 - Go to the Spooky Hollow           |"
            + "\n6 - Inventory                         |"
            + "\ns - Save                              |"
            + "\nq - Exit to Main Menu                 |"
            + "\n---------------------------------------");

    @Override
    public void doAction(String value) {
        char option = value.charAt(0);
        switch(option) {
            
            case '1': //Go to the Kingdom
                
                Kingdom castle = new Kingdom();
                castle.display();
                break;
                
            case '2': //Go to the General Store
                
                GeneralStore genStore = new GeneralStore();
                genStore.display();
                break;
                
            case '3': //Go to the Icy Caves
                
                DungeonView1 dungeon1 = new DungeonView1();
                dungeon1.display();
                break;
                
            case '4': //Go to the Fiery Depths
                
                DungeonView2 dungeon2 = new DungeonView2();
                dungeon2.display();
                break;
                
            case '5': //Go to the Spooky Hollow
                
                DungeonView3 dungeon3 = new DungeonView3();
                dungeon3.display();
                return;
                
            case '6': //Inventory
                
                System.out.println("\n\tPress 1 to see inventory, otherwise press 2.");
                char option1 = value.charAt(0);
                switch (option1) {
                    case '1':
                        this.viewInventory();
                        break;
                    case '2':
                        this.getInventoryQuery();
                        break;
                }
                //com.game.view.InventoryControl inventory = new com.game.view.InventoryControl();
                //inventory.display();
                return;

            case 's': //Save Game
                
                this.saveGame();
                System.out.println("Game Saved!");
                return;
                
            case 'q': //Exit to Main Menu
                
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;

            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }//End switch()
        
    }//End doAction()

    public void displayMenu() {
        System.out.println("If you see this, this is the displayMenu(). Not the GameMapView.");
    }
    
}//END
