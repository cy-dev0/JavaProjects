import javax.swing.JOptionPane;
import java.util.Arrays;

public class ParallelArray1 {
    public static void main(String [] args) {
        //use parallel arrays to simulate a vending machine
        
        String vCode[] = {"A01", "A02", "A03", "B01", "B02", "B03"};
        String product[] = {"Snickers", "Skittles", "Crunch", "Redbull", "Monster", "Starbucks"};

        String userIn = null;
        int index = 0;

        userIn = JOptionPane.showInputDialog(null, "Select a product code:");

        //continue looping while we have not hit the end of the array AND we have not found a match
        while ((index < vCode.length) && (!userIn.equalsIgnoreCase(vCode[index])))
        {
            index++;
        }

        if (index == vCode.length)
        {
            System.out.println("ERROR - NO PRODUCT");
        }
        else
        {
            System.out.println("Vending .... " + product[index]);
        }
    }
}
