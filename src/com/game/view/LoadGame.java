package com.game.view;

import java.util.Scanner;

public class LoadGame {
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n\t---------------------------------------"
            + "\n\t|            Saved Games              |"
            + "\n\t---------------------------------------"
            + "\n\t1 - [Player Save Slot One]            |"
            + "\n\t                                      |"
            + "\n\tq - Back to the Main Menu             |"
            + "\n\t---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MENU);
            
            String input = user_input.next();
            option = input.charAt(0);           
            
            this.doAction(option);
            
        } while (option != '6'); //OPTION 6::GO BACK TO MENU
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //[SLOT ONE] LOAD SAVED GAME...
                
                System.out.println("Loading Slot One... ... ...");
                return;
                
            case 'q': //GO BACK TO MENU
                
                MenuView Menu = new MenuView();
                Menu.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
}
