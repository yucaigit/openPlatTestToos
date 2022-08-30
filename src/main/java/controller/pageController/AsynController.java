package controller.pageController;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;

/*
异步验签控制器
 */
public class AsynController {

    public RadioButton rsa2Radio;
    public RadioButton rsaRadio;
    public RadioButton utf8Radio;
    public RadioButton gbkRadio;

    public void chooseRSA2(ActionEvent event) {
        rsa2Radio.setSelected(true);
        rsaRadio.setSelected(false);
    }

    public void chooseRSA(ActionEvent event) {
        rsaRadio.setSelected(true);
        rsa2Radio.setSelected(false);
    }

    public void chooseUTF8(ActionEvent event) {
        utf8Radio.setSelected(true);
        gbkRadio.setSelected(false);
    }

    public void chooseGBK(ActionEvent event) {
        gbkRadio.setSelected(true);
        utf8Radio.setSelected(false);
    }
}
