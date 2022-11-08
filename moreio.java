import java.util.Scanner;
import java.io.File;

public class moreio {
    public static void main(String[] args) throws Exception {
        //read/scan and output data from 2 txt files

        String aCode[] = new String[8];
        String aCity[] = new String[8];
        int count1 = 0;
        int count2 = 0;
        int index = 0;

        //create file object for codes
        File file1 = new File("aircodes.txt");

        //create file object for cities
        File file2 = new File("cities.txt");

        //create scanner objects
        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);

        //loop to scan all data from the file and output it
        while (scan1.hasNext())
        {
            //scan a record of data from txt file
           aCode[index] = scan1.nextLine();
           aCity[index] = scan2.nextLine();
           index++;
        }
        
        scan1.close();
        scan2.close();
        System.out.println(java.util.Arrays.toString(aCode));
        System.out.println(java.util.Arrays.toString(aCity));

        System.out.println("Record count for File1: " + count1);
        System.out.println("Record count for File2: " + count2);
        
    }
}
