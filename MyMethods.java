import javax.swing.JOptionPane;

public class MyMethods {
    public static String displayMenu(int catNum) {
        String gameN = null;
        int gameChoice = 0;
        if (catNum == 1)
        {
            System.out.println("You selected card games!");
            gameChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the  card game you would like to play: \n1 - Old Maid \n2 - Rummy \n3 - Kings Cup"));
            switch (gameChoice)
            {
                case 1:
                gameN = "Old Maid";
                break;
                case 2:
                gameN = "Rummy";
                break;
                case 3:
                gameN = "Kings Cup";
                break;
            } //end of switch
        } //end of if
        else if (catNum == 2)
        {
            System.out.println("You selected board games!");
            gameChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the board game you would like to play: \n1 - Game of Life \n2 - Sorry! \n3 - Candyland"));
            switch (gameChoice)
            {
                case 1:
                gameN = "Game of Life";
                break;
                case 2:
                gameN = "Sorry!";
                break;
                case 3:
                gameN = "Candyland";
                break;
            } //end of switch
        } //end of if
        else
        {
            System.out.println("You selected casino games!");
            gameChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the casino game you would like to play: \n1 - Blackjack \n2 - Poker \n3 - Craps"));
            switch (gameChoice)
            {
                case 1:
                gameN = "Blackjack";
                break;
                case 2:
                gameN = "Poker";
                break;
                case 3:
                gameN = "Craps";
                break;
            } //end of switch
        } //end of if

        return gameN;
    }// end of method
}
