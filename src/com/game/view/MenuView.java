package com.game.view;

import java.util.Scanner;

public class MenuView implements ViewInterface {

    public String promptMessage;

    public MenuView() {
    }

    public MenuView(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        String value = " ";
        do {
            System.out.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        } while (!value.equals("E"));
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("Invalid input - the input must not be blank."
                        + "\n Enter new input.");
                continue;
            }

            break;
        }
        return selection;
    }
    
    @Override
    public void doAction(String value) {
    }
    
}//END
