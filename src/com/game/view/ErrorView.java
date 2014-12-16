package com.game.view;

import com.game.KingdomGame;
import java.io.PrintWriter;

public class ErrorView {
    
    private static final PrintWriter errorFile = KingdomGame.getOutFile();
    private static final PrintWriter logFile = KingdomGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "--------------------------------------------------"
                    +"\n- ERROR  -" + errorMessage
                    +"\n------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}