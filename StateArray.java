import java.util.Scanner;
import java.io.File;

public class StateArray {
    public static void main(String[] args) throws Exception {

        //create file object for codes
        File file1 = new File("states.txt");

        //create file object for cities
        File file2 = new File("capitols.txt");

        //create scanner objects
        Scanner scan1 = new Scanner(file1);

        Scanner scan2 = new Scanner(file2);
       
        String [] state = new String[5];
        String [] capitol = new String[5];

        int index = 0;

        //use this method when scanning from FILE
        while (scan1.hasNext())
        {
            //scan record from the txt files and assign into arrays
            state [index] = scan1.nextLine();
            capitol [index] = scan2.nextLine();
            index++;
        }
        scan1.close();
        scan2.close();
        System.out.println(java.util.Arrays.toString(state));
        System.out.println(java.util.Arrays.toString(capitol));

    }
}
