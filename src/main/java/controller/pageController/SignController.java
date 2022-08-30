package controller.pageController;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

public class SignController implements Initializable {

    public RadioButton utf8Radio;
    public RadioButton gbkRadio;
    public RadioButton rsa2Radio;
    public RadioButton rsaRadio;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    //选择utf8
    public void chooseUTF8(ActionEvent event) {
        utf8Radio.setSelected(true);
        gbkRadio.setSelected(false);
    }
    //选择GBK
    public void chooseGBK(ActionEvent event) {
        gbkRadio.setSelected(true);
        utf8Radio.setSelected(false);
    }
    //选择RSA2
    public void chooseRSA2(ActionEvent event) {
        rsa2Radio.setSelected(true);
        rsaRadio.setSelected(false);
    }
    //选择RSA
    public void chooseRSA(ActionEvent event) {
        rsaRadio.setSelected(true);
        rsa2Radio.setSelected(false);
    }
}
