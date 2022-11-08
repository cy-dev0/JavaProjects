import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;

public class ArrayConvo {
    public static void main(String[] args) throws Exception {

        
        int arrLength = 0;
        String fileName = null;

        fileName = JOptionPane.showInputDialog(null, "Enter the full .txt file name: ");
        arrLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the array: "));

        String [] aPhrase = new String[arrLength];

        aPhrase = loadStrArr(fileName, arrLength);

        System.out.println(java.util.Arrays.toString(aPhrase));
        
    } // end of main

    public static String[] loadStrArr(String file1, int arraySize) throws Exception
    {
        //create file object
        File f1 = new File(file1);

        //create scanner object
        Scanner scanf1 = new Scanner(f1);

        String [] strArr = new String[arraySize];

        for (int i = 0; i < strArr.length; i++)
        {
            strArr[i] = scanf1.nextLine();
        }
        scanf1.close();
        return strArr;

    }

}// end of classS
