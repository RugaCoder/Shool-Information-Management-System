package sample;

import javax.swing.*;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;




public class Controller {

    @FXML
    private JFXButton loginButton;
    @FXML
    public JFXTextField emailTextField;
    @FXML
    public JFXPasswordField passwordField;

   public Controller() {
        System.out.println ("hi ");
    }
    @FXML
    public void setOnAction(ActionEvent e) {
        if (e.getSource ( ) == loginButton) {
            System.out.println ("Hello World");
            // JFXTextField emailTextField = new JFXTextField ();
            //  JFXPasswordField passwordField = new JFXPasswordField ();
            String emailAddress = emailTextField.getText ( );
            String emailPassword = passwordField.getText ( );
            System.out.println (emailAddress + "\n");
            System.out.print (emailPassword + "\n");
            if (emailAddress.indexOf (" ") > 0) {
                JOptionPane.showMessageDialog (null, "Email address does not exist ");
            }

                else if (!emailAddress.contains ("@")) {
                    System.out.println (" very bad");
                    JOptionPane.showMessageDialog (null, "Email address does not exist ");
                } else if ((emailPassword.length ( )) < 6) {
                    JOptionPane.showMessageDialog (null, "Wrong password ");
                    System.out.println ("not accepted");
                }
        else {
                //Check user address and password if the internet connection is petty good for authentication from the mail server
                System.out.print ("You are waiting for internet connection to continue");
            }
        }

        }


    @FXML
    public void initialize() {
        JFXTextField emailTextField = new JFXTextField ();
        JFXPasswordField PasswordField = new JFXPasswordField ();
        JFXButton loginButton = new JFXButton ();
    }

}
