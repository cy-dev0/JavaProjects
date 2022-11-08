import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayPractice {

    public static void main(String[] args) {
        
        int index = 0;
        String [] fMonth = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(java.util.Arrays.toString(fMonth));
        System.out.println(fMonth.length);

        index = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a month 1-12"));
        index = monthValid(index);
        JOptionPane.showMessageDialog(null, "You selected :" + fMonth[--index]);

    }
    public static int monthValid(int month1) {
        while (month1 < 1 || month1 > 12)
        {
            month1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR: Select a month 1-12"));
        }
        return month1;
    }
}
