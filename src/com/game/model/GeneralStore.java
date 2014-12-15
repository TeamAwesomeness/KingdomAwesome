package com.game.view;

public class GeneralStore extends MenuView {
    //
    public GeneralStore() {
        super("\n"
                + "\n\t======================================="
              //+ "\n\t|  XP: " + XP + "                     |"
              //+ "\n\t======================================="
                + "\n\t|          The General Store          |"
                + "\n\t======================================="
                + "\n\t1 - Moldy Bread               @5XP    |"
                + "\n\t2 - Slimy Chicken             @7XP    |"
                + "\n\t3 - Potions of Health         @10XP   |"
                + "\n\t4 - Extra Life                @30XP   |"
                + "\n\t                                      |"
                + "\n\tq - Exit to Map                       |"
                + "\n\t=======================================");}
    /*
    public Dungeon2View() {
        super("\n"
                + "\n\t========================================="
                + "\n\t=             Fiery Depths              =");
        CombatControlView startCombat = new CombatControlView();
        startCombat.startCombat();
    }
    */
    public void display() {
        String value = " ";
        this.GeneralStore();
        value = this.getInput();
        this.doAction(value);
    }
    
    
    void display() {
        char option = ' ';
        do {            
            String input = user_input.next();
            option = input.charAt(0);           
            
            this.doAction(option);
            
        } while (option != 'q');
    }
    
    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //create and start a new game
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Moldy Bread"
                                 + "\nfor 5XP.");
                break;
                
            case '2': //load an existing game
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Slimy Chicken for"
                                  +"\n7XP.");
                break;
                
            case '3': //display the options menu
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Potions of Health for"
                                  +"\n10XP.");
                break;
                
            case '4': //display the help menu
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Extra Life"
                                 + "\nfor 30XP.");
                break;
                
            case 'q': //exit to in-game Map View
                
                GameMapView mapView = new GameMapView();
                mapView.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

}
