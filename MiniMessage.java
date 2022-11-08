/**  Project - Phase 2
 *   Seth Seibel
 *   MiniMessage is an application where users can enter their names and a message they would like to send, once user has entered inputs message will print with the date and time the message was sent.
*/
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class MiniMessage {
    public static void main(String[] args) {

        System.out.println("Programmed by Seth Seibel");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        
        int count = 1;
        int userYN = 0;

        String userName = JOptionPane.showInputDialog(null, "Please enter your name:");
        userName = valName(userName);

        do {
        
        String userMessage = JOptionPane.showInputDialog(null, "Enter the message you would like to send:");
        userMessage = valMessage(userMessage);
        LocalDateTime now = LocalDateTime.now();

        JOptionPane.showMessageDialog(null, dtf.format(now) + "\nUser: " + userName + "\nMessage: " + userMessage + "\nYou have sent this many messages: " + count);
        
        count++;

        userYN = JOptionPane.showConfirmDialog(null, "Would you like to send another message?");

        } while (userYN == 0);

    } //end of main method

    public static String valName(String userName1) {
        while (userName1.isEmpty() && userName1.isBlank())
        {
            userName1 = JOptionPane.showInputDialog(null, "ERROR: You have not entered your name. \nPlease enter your name:");
        }
        return userName1;
    }
    public static String valMessage(String userMessage1) {
        while (userMessage1.isEmpty() && userMessage1.isBlank()) 
        {
            userMessage1 = JOptionPane.showInputDialog(null, "ERROR: You have not entered a message. \nEnter the message you would like to send:");
        }
        return userMessage1;
    }    
    
}// end of class