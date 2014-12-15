package com.game.view;

import com.game.KingdomGame;
import com.game.control.ProgramControl;
import com.game.model.Player;
import static com.game.view.HelpMenuView.waitTime;

public class StartProgramView extends MenuView {

    public StartProgramView() {
        super("\n"
                + "\n\t*<<<<<<<<<<<<<<<<<|>>>>>>>>>>>>>>>>>*"
                + "\n\t@            The Kingdom            @"
                + "\n\t*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*"
                + "\n\t@  The hero has been called to save @"
                + "\n\t@  the kingdom. Go now and collect  @"
                + "\n\t@  the magical orbs and defeat the  @"
                + "\n\t@            evil dragon.           @"
                + "\n\t*<<<<<<<<<<<<<<<<<|>>>>>>>>>>>>>>>>>*"
                + "\n\n"
                + "\n\tPress 1 to listen to the intro, otherwise press 2 and hit enter.");
    }
    
    @Override
    public void doAction(String value) {

        //prompt the player to enter their name && retrieve name
        Player player = ProgramControl.createPlayer(value);
        
        //display IntroMessage()
        this.displayIntroMessage(player);
        
        //display the main menu
        MenuView mainMenu = new MenuView();
        mainMenu.display();

    }
    
    public void displayIntroMessage(Player player) {
        System.out.println("\n\n");
        System.out.println("\n\t==============================================");
        System.out.println("\n\t=#> Welcome to the game, " + player.getPlayerName() + "!");
        System.out.println("\n\t=#> The kingdom is in dire need of your help! ");
        System.out.println("\n\t==============================================");
    }
    
    public void intro() {
        waitTime(50000);
        System.out.print("\n\n\tAccording to our oldest and most ancient scrolls"
                         + "\n\tthe mythical dragons descended from a distant nebula"
                         + "\n\tto the world and created order and life.");
        waitTime(130000);
        System.out.print("\n\n\tThe dragon of power tore the great mountain red with"
                         + "\n\tfire and created land.");    
        waitTime(120000);        
        System.out.print("\n\n\tThe dragon of wisdom brought wizardry and science and"
                         + "\n\tbrought order to nature.");  
        waitTime(120000);        
        System.out.print("\n\n\tAnd the dragon of courage, through justice and vigor,"
                         + "\n\tcreated life - the animals that crawl the land and"
                         + "\n\tthe birds that soar the blue skies.");
        waitTime(140000);
        System.out.print("\n\n\tAfter the dragons had finished their work, they left"
                         + "\n\tthe world, but not without leaving behind three magical"
                         + "\n\tspheres of power, one for each aspect.");
        waitTime(150000);
        System.out.print("\n\n\tThe Sphere of Power, the Sphere of Wisdom and the"
                         + "\n\tSphere of Courage. A small but powerful portion of"
                         + "\n\tthe essence of the dragons was held in these mighty"
                         + "\n\tartifiacts.");
        waitTime(165000);
        System.out.print("\n\n\tIn The Kingdom, there are many kingdom buildings which"
                         + "\n\tare mentioned repeatedly in the legends. These buildings"
                         + "\n\twhich now lie in ruin, pale shadows of their former"
                         + "\n\tsplendor, are closely tied to the magical spheres.");
        waitTime(175000);
        System.out.print("\n\n\tAmong these ruins lies one which has stood the test of time"
                         + "\n\tand it is here that the lost hero must bring the magical"
                         + "\n\tspheres to, and restore peace and prosperity to this land.");
        waitTime(180000);
        
        System.out.print("\n\nLoading");
        waitTime(45000);
        System.out.print("...");
        waitTime(65000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(55000);
        System.out.print("...");
        waitTime(65000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(55000);
        System.out.print("Loaded!");
        waitTime(55000);

    }//End intro()
    
}//END