/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import com.jfoenix.controls.JFXButton;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private PasswordField pin;
String Pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton satu;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton delapan;

    @FXML
    private JFXButton enol;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton ok;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void tekan1(javafx.event.ActionEvent event) {
       Pin +="1";
        pin.setText(Pin);
    }

    @FXML
    private void tekan2(javafx.event.ActionEvent event) {
     Pin +="2";
        pin.setText(Pin);
    }

    @FXML
    private void tekan3(javafx.event.ActionEvent event) {
       Pin +="3";
        pin.setText(Pin);
    }

    @FXML
    private void tekan4(javafx.event.ActionEvent event) {
         Pin +="4";
        pin.setText(Pin);
    }

    @FXML
    private void tekan5(javafx.event.ActionEvent event) {
        Pin +="5";
        pin.setText(Pin);
    }

    @FXML
    private void tekan6(javafx.event.ActionEvent event) {
        Pin +="6";
        pin.setText(Pin);
    }

    @FXML
    private void tekan7(javafx.event.ActionEvent event) {
        Pin +="7";
        pin.setText(Pin);
    }

    @FXML
    private void tekan8(javafx.event.ActionEvent event) {
        Pin +="8";
        pin.setText(Pin);
    }

    @FXML
    private void tekan9(javafx.event.ActionEvent event) {
         Pin +="9";
        pin.setText(Pin);
    }

    private void tekanc(javafx.event.ActionEvent event) {
         Pin +="";
        pin.setText(Pin);
    }

    @FXML
    private void tekan0(javafx.event.ActionEvent event) {
      Pin +="0";
        pin.setText(Pin);
    }

    private void tekanOk(javafx.event.ActionEvent event) {
        if(Pin.equals(PIN)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Lanjutan.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ProjectATM");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }else {
            kesempatan -=1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + kesempatan
                    + " Kesempatan lagi!");
            pin.setText("");
            Pin="";
            if(kesempatan == 0 ){
                System.exit(0);
            }
        }
        
    }

    @FXML
    private void ulang(javafx.event.ActionEvent event) {
    }

    @FXML
    private void oke(javafx.event.ActionEvent event) {
    }
}
