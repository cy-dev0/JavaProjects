import java.util.Scanner;
import java.io.File;

public class iopractice {
    public static void main(String[] args) throws Exception {
        //read/scan and output data from 2 txt files

        String code = null;
        String city = null;
        int count1 = 0;
        int count2 = 0;

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
           code = scan1.nextLine();
           System.out.println(code);
           count1++;
           city = scan2.nextLine();
           System.out.println(city);
           count2++;
        }
        
        scan1.close();
        scan2.close();
        System.out.println("Record count for File1: " + count1);
        System.out.println("Record count for File2: " + count2);
        
    }
}
