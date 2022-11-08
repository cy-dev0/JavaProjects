/**  Project - Phase 2
 *   Seth Seibel
 *   MiniMessage is an application where users can enter their names and a message they would like to send, once user has entered inputs message will print with the date and time the message was sent. Once user is done sending messages, program will ask if there are other users who wish to use the application.
*/
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

//P2-7 Code comments - beginning of class
public class MiniMessage {
    public static void main(String[] args) {

        System.out.println("Programmed by Seth Seibel");

        //Extra feature - formats date and time output for message timestamp
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        //Creates icon from image file - to be used in message display
        ImageIcon icon1 = new ImageIcon("pic1.jpg"); //assumes pic1 is placed in root folder
        
        int userYN = 0;
        int newUser = 0;

        //P2-3 Other loop - main program loop which asks if there are other users, if so resets the message count
        do {
        
            int count = 1; 
            String userName = JOptionPane.showInputDialog(null, "Please enter your name:");
            userName = valName(userName);
        
            //Message loop - asks if current user wants to send another message, if so grabs the current date and time
            do {
        
                String userMessage = JOptionPane.showInputDialog(null, "Enter the message you would like to send:");
                userMessage = valMessage(userMessage);
                LocalDateTime now = LocalDateTime.now();

                //P2-6 Image icon displays with message output
                //P2-8 Extra feature - message will display with timestamp, custom icon, and title will print with users name
                JOptionPane.showMessageDialog(null, 
                                            dtf.format(now) + "\n" + userName + ": " + userMessage + "\nMessage #" + count,
                                            "Message from " + userName, 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            icon1);
        
                //P2-4 abbreviated incrementor - counts the amount of messages current user has sent
                count++;

                userYN = JOptionPane.showConfirmDialog(null, "Would you like to send another message?");

            } while (userYN == 0); //end of message loop

            newUser = JOptionPane.showConfirmDialog(null, "Is there another user who would like to use this application?");

        } while (newUser == 0); //end of user loop

    } //end of main method

    //P2-5 Method 1 - name validation loop
    public static String valName(String userName1) {
        //P2-1 Compound condition 
        //P2-2 Error validation loop - checks to make sure input is not empty or blank space
        while (userName1.isEmpty() || userName1.isBlank())
        {
            userName1 = JOptionPane.showInputDialog(null, "ERROR: You have not entered your name. \nPlease enter your name:");
        }
        return userName1;
    }//end of method 1

    //P2-5 Method 2 - message validation loop
    public static String valMessage(String userMessage1) {
        //P2-2 Error validation loop - checks to make sure input is not empty or blank space
        while (userMessage1.isEmpty() || userMessage1.isBlank()) 
        {
            userMessage1 = JOptionPane.showInputDialog(null, "ERROR: You have not entered a message. \nEnter the message you would like to send:");
        }
        return userMessage1;
    }//end of method 2  
    
}// end of class