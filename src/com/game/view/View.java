package com.game.view;

import com.game.KingdomGame;
import java.io.BufferedReader;
import java.io.PrintWriter;

public abstract class View implements ViewInterface {
    
    final String promptMessage;
    protected final BufferedReader keyboard = KingdomGame.getInFile();
    protected final PrintWriter console = KingdomGame.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
     public void display () {
        char option = ' ';
        this.console.println(this.promptMessage);
        this.console.println("Select an option: ");
        String input = this.getInput().toUpperCase();
        
        option = input.charAt(0);
            
        this.doAction(option);
    }
     
     public void displayMenu () {
        char selection = ' ';
        do {
            this.console.println(this.promptMessage);
            this.console.println("Select an option: ");
            String input = this.getInput().toUpperCase();
            
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E'&& selection != 'N');
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
        
        while (!valid) {

            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                ErrorView.display(this.getClass().getName(),"Inconcievable! Please enter a valid selection.");
                continue;
            }
            else {
                break;
            }
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return selection;
    }

    public int getNumInput() {
        Integer number = null;
        while (number == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();
            try{
                number = Integer.parseInt(value);
            }catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "\nError reading input: You must enter a valid number.");
            }
        }
        return number;
    }
    
    public String getFileInput() {
        boolean valid = false;
        String filePath = null;
        try {
        
        while (!valid) {
            this.console.println("Enter the filepath where the report will be printed:");
            
            filePath = this.keyboard.readLine();
            filePath = filePath.trim();
            
            if (filePath.length() < 1){
                ErrorView.display(this.getClass().getName(),"Inconcievable! Please enter a valid file path.");
                continue;
            }
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return filePath;
    }

    private void doAction(char option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
