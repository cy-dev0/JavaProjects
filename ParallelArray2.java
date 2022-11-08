import javax.swing.JOptionPane;

public class ParallelArray2 {
    public static void main(String[] args) {
        //use parallel arrays to simulate a television channels
        
        int cNum[] = {13, 17, 20, 25, 33, 40};
        String cName[] = {"ESPN", "HBO", "Discovery", "CNN", "NBC", "FOX"};

        int userIn = 0;
        int index = 0;

        userIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a channel:"));

        //use java binary search method to find matching value
        index = java.util.Arrays.binarySearch(cNum, userIn);

        if (index < 0)
        {
            System.out.println("ERROR - INVALID CHANNEL");
        }
        else
        {
            System.out.println(cName[index]);
        }

    }
}
