// Lab #5
// Seth Seibel

import javax.swing.JOptionPane;

public class Lab5 {
    public static void main(String [] args) {
        //declare variables
        int bet = 0;
        int game = 0;
        String gamePrint = null;

        //begin program logic
        game = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a game: \n1 - Poker \n2 - Blackjack"));

        //validates game input
        while (game != 1 && game != 2) 
        {
            game = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR: YOU MUST SELECT 1 OR 2. \nSelect a game: \n1 - Poker \n2 - Blackjack"));
        }

        //assigns naming value to game
        if (game == 1)
        {
            gamePrint = "Poker";
        }
        else
        {
            gamePrint = "Blackjack";
        }

        //gets user bet then validates input
        bet = Integer.parseInt(JOptionPane.showInputDialog(null, "How much would you like to bet?"));
        bet = Validation.validBet(game, bet);

        //prints returned value
        JOptionPane.showMessageDialog(null,"Your bet of $" + bet + " for " + gamePrint + " has been placed!");

    } //end of main

} //end of class
