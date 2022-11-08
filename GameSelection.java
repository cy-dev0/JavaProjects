import javax.swing.JOptionPane;


public class GameSelection {
    public static void main(String [] args) {
        
        int categoryNum = 0;
        String gName = null;

        categoryNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the game you would like to play: \n1 - Card games \n2 - Board games \n3 - Casino games"));
        gName = MyMethods.displayMenu(categoryNum);

        System.out.println("Now loading " + gName);

    } //end of main
    

} //end of class
