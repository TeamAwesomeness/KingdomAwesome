package com.game.view;

import com.game.KingdomGame;
import com.game.model.Game;
import com.game.model.Item;

public class InventoryMenuView extends MenuView {

    Game game = KingdomGame.getCurrentGame();
    GameMenuView gameMenuView = new GameMenuView();

    final int BREAD = 1;
    final int CHICKEN = 0;
    final int POTION = 0;
    final int LIFE = 0;
    //Qued for Found
    final int SPHERES = 0;

    public void displayMenu() {
        
        Item[] inventoryList = game.getInventory();
        
        //Items For Sale
        String breadFood    =   inventoryList[BREAD].getActualAmount() 
                + " : " 
                +               inventoryList[BREAD].getRequiredAmount();
        String chickensFood =   inventoryList[CHICKEN].getActualAmount() 
                + " : " 
                +               inventoryList[CHICKEN].getRequiredAmount();
        String potionsFood  =   inventoryList[POTION].getActualAmount() 
                + " : " 
                +               inventoryList[POTION].getRequiredAmount();
        String lives        =   inventoryList[LIFE].getActualAmount() 
                + " : " 
                +               inventoryList[LIFE].getRequiredAmount();
        
        //Item Not For Sale
        String spheres      =   inventoryList[SPHERES].getActualAmount() 
                + " : " 
                +               inventoryList[SPHERES].getRequiredAmount();

        System.out.println("\n"
                + "\n\t---------------------------------------"
                + "\n\t-             Inventory               -"
                + "\n\t---------------------------------------"
                + "\n\t- Level: " + lvl + ""
                + "\n\t---------------------------------------"
                + "\n\t1- Moldy Bread: " + breadFood
                + "\n\t2- Slimy Chicken: " + chickensFood
                + "\n\t3- Potion of Health: " + potionsFood
                + "\n\t4- Extra Lives: " + lives
                + "\n\t---------------------------------------"
                + "\n\t- Experience: " + xp
                + "\n\t- Magical Spheres: " + spheres
                + "\n\t---------------------------------------"
                + "\n\tq - Go to the Map                     |"
                + "\n\t---------------------------------------"
                + "\n\t\tUse: ");
    }

    public void display() {
        String value = " ";
        this.displayMenu();
        value = this.getInput();
        this.doAction(value);
    }


    @Override
    public void doAction(String value) {
        
        Item[] inventoryList = game.getInventory();
        
        switch (value) {
            
            case "1":
                
                if (inventoryList[BREAD].getActualAmount() == 0) {
                    
                    System.out.println("\n\tYou don't have enough experience to buy this.");
                    
                    break;
                    
                } else {
                    
                    inventoryList[BREAD].setSelected(true);
                    
                    break;
                }
            
            case "2":
                
                if (inventoryList[CHICKEN].getActualAmount() == 0) {
                    
                    System.out.println("\n\tYou don't have enough experience to buy this.");
                    
                    break;
                    
                } else {
                    
                    inventoryList[CHICKEN].setSelected(true);
                    
                    break;
                }
            
            case "3":
                
                if (inventoryList[POTION].getActualAmount() == 0) {
                    
                    System.out.println("\n\tYou don't have enough experience to buy this.");
                    
                    break;
                    
                } else {
                    
                    inventoryList[POTION].setSelected(true);
                    
                    break;
                }
            
            case "4":
                
                if (inventoryList[LIFE].getActualAmount() == 0) {
                    
                    System.out.println("\n\tYou don't have enough experience to buy this.");
                    
                    break;
                    
                } else {
                    
                    inventoryList[LIFE].setSelected(true);
                    
                    break;
                }
            
            case "q": //Go to the Map
                
                GameMapView mapView = new GameMapView();
                mapView.display();
                
                return;
                
            default:
                
                System.out.println("\n\t You fail at this, don't you? Give a new choice.");
                
                break;
                
        }//END switch
        
    }//END doAction
    
}//END