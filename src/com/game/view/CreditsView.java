package com.game.view;

import java.util.Scanner;

public class CreditsView {
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|       WELCOME TO THE CREDITS        |"
            + "\n---------------------------------------"
            + "\n|     [DR]  Sterling Grant            |"
            + "\n|  DR Grant doesn't have a bio yet.   |"
            + "\n---------------------------------------"
            + "\n|      [MR]  Moses Accinelli          |"
            + "\n| Moses has led a life in the criminal|"
            + "\n| underground most of his life, owning|"
            + "\n| a toyota pickup truck that's been   |"
            + "\n| punked out. He's a sugar momma daddy|"
            + "\n| and loves all that glitters. Today, |"
            + "\n| he spends most of his time chilling |"
            + "\n| with his mates, kicking down trash  |"
            + "\n| cans with his siblings or out in the|"
            + "\n| back alley with his .22.            |"
            + "\n---------------------------------------"
            + "\nq - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MENU);           
            
            String input = user_input.next();   
            option = input.charAt(0);           
            
            this.doAction(option);           
            
        } while (option != 'q');             
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case 'q': //Go Back to Menu
                
                MenuView Menu = new MenuView();
                Menu.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
}
