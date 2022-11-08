import javax.swing.JOptionPane;

public class Lab6 {
    public static void main(String[] args) {
        //use parallel arrays to represent directory
        
        String dept[] = {"AA", "BB", "CC", "DD", "EE", "FF"};
        String phone[] = {"111-1111", "222-2222", "333-3333", "444-4444", "555-5555", "666-6666"};
        System.out.println(java.util.Arrays.toString(dept));
        System.out.println(java.util.Arrays.toString(phone));

        String deptNum = find1(dept, phone);

        System.out.println(deptNum);
        
    }

    public static String find1(String dept1[], String phone1[]) 
    {
        String userIn = null;
        String reponse = null;
        int index = 0;
        userIn = JOptionPane.showInputDialog(null, "Select a deparment: \n AA - Accounting \n BB - Business \n CC - Campus Police \n DD - Direct Services \n EE - Electronics \n FF - Executive Services");
        userIn = userIn.toUpperCase();

        //use java binary search method to find matching value
        index = java.util.Arrays.binarySearch(dept1, userIn);

        while ((index < dept1.length) && (!userIn.equalsIgnoreCase(dept1[index])))
        {
            index++;
        }

        if (index < 0)
        {
            System.out.println("ERROR - INVALID DEPARTMENT");
            reponse = "NOT FOUND";
        }
        else
        {
            System.out.println(phone1[index]);
            reponse = phone1[index];
        }

    return reponse;
    }
}

