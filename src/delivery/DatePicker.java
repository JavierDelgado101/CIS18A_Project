package src.delivery;
//Abstract Window Toolkit imports for GUI
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Swing imports for GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import Time Check from Welcome text file
import src.startend.Welcome;

public class DatePicker extends Welcome {
    String date;
    public void userDate() {
        //Display date pick instructions
        System.out.println("Delivery Date:");
        System.out.println("- Only Press the 'Submit' button when you are done entering the desired date.");
        //Create the frame
        JFrame frame = new JFrame("REGULAR RESTAURANT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(250, 150));
        //Create the label and text field for the date
        JLabel label = new JLabel("Enter date (MM/DD/YYYY):");
        JTextField dateField = new JTextField(10);
        //Create the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                date = dateField.getText();
                System.out.println("Your delivery date is: " + date);
                System.exit(0);
            }
        });
        //Add the label, text field, and button to the frame
        frame.add(label);
        frame.add(dateField);
        frame.add(submitButton);
        //Show the frame
        frame.setVisible(true);
    }
}
