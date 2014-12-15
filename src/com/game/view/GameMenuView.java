
package com.game.view;

public class GameMenuView extends MenuView {

    public GameMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Game Menu                          |"
                + "\n--------------------------------------"
                + "\nV - View map"
                + "\nI - View Inventory"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n--------------------------------------"
                + "\n\n* Make your selection");
    }

    @Override
    public void doAction(String value) {
        char selection = value.charAt(0);
        switch (selection) {
            case 'V':
                com.game.KingdomGame.getMapView().display();
                break;
            case 'H':
                com.game.KingdomGame.getHelpMenuView().display();
                break;
            case 'I':
                //Add two options here. One is this.viewInventory() and the other calling PrincessBride.getInventoryQuery().display(), which would provide a for loop inquiring of the user for a specific item to give quantity.
                System.out.println("\nWould you like to search for an item or see an entire inventory list?");
                char selection1 = value.charAt(0);
                switch (selection1) {
                    case '1':
                        this.viewInventory();
                        break;
                    case '2':
                        this.getInventoryQuery();
                        break;
                }
                
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void saveGame() {
        System.out.println("\n*** calling saveGame ***");
    }

    void viewInventory() {
        InventoryControl inventoryControl = new InventoryControl();
        Item[] printList = GameControl.getSortedInventoryList();
        int itemsAcquired = 0;
        itemsAcquired = inventoryControl.playerProgress();
        System.out.println("\n****************************************");
        System.out.println("* You have  " + itemsAcquired + " out of 3 necessary items.*");
        System.out.println("****************************************");

        for (int i = 0; i < printList.length; i++) {
            System.out.println(printList[i].getDescription());
            System.out.println("    Actual Amount: " + printList[i].getActualAmount());
            System.out.println("    Required Amount: " + printList[i].getRequiredAmount());
        }
    }

    void getInventoryQuery() {
        System.out.println(" Inventory ");
    }
    
}
