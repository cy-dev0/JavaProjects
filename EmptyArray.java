import javax.swing.JOptionPane;

public class EmptyArray {
    public static void main(String[] args) {
        double [] piggy = new double[7];

        for (int i = 0; i < piggy.length; i++)
        {
            piggy[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the deposit for day " + (i+1)));
        }

        System.out.println(java.util.Arrays.toString(piggy));

    }
}
