package com.game.view;

import com.game.control.InventoryControl;
import com.game.model.GeneralStore;
import com.game.model.Kingdom;
import java.util.Scanner;

public class MapView extends MenuView {
    
    Scanner user_input = new Scanner(System.in);
    GameMenuView gameMenuView = com.game.KingdomGame.getGameMenuView();

    @Override
    public void display() {

        System.out.println("\n"
            + "\n\t---------------------------------------"
            + "\n\t    Map                               |"
            + "\n\t---------------------------------------"
            + "\n\t1 - Go to the Kingdom                 |"
            + "\n\t2 - Go to the General Store           |"
            + "\n\t3 - Go to the Icy Caves               |"
            + "\n\t4 - Go to the Fiery Depths            |"
            + "\n\t5 - Go to the Spooky Hollow           |"
            + "\n\t6 - Inventory                         |"
            + "\n\t                                      |"
            + "\n\ts - Save                              |"
            + "\n\tq - Exit to Main Menu                 |"
            + "\n\t---------------------------------------");

        String input = " ";
        input = this.getInput();
        this.doAction(input);
        
    }//End display

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
                
                Dungeon1View dungeon1 = new Dungeon1View();
                dungeon1.display();
                break;
                
            case '4': //Go to the Fiery Depths
                
                Dungeon2View dungeon2 = new Dungeon2View();
                dungeon2.display();
                break;
                
            case '5': //Go to the Spooky Hollow
                
                Dungeon3View dungeon3 = new Dungeon3View();
                dungeon3.display();
                return;
                
            case '6': //Inventory
                
                InventoryControl inventory = new InventoryControl();
                inventory.display();
                return;

            case 's': //Save Game
                
                System.out.println("\n\tGame Saved!");
                return;
                
            case 'q': //Exit to Main Menu
                
                MenuView mainMenu = new MenuView();
                mainMenu.display();
                
            default:
                
                System.out.println("\n\t Invalid selection!");
                break;
                
        }//End switch
        
    }//End doAction
    
}//END
