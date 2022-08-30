package controller.pageController;

import commonProperty.CommonProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/*
 * @Author LeiYc
 * @Date 2022/8/25 15:45
 **/
public class GenKeyController implements Initializable {
    public CommonProperty commonProperty;

    @FXML public RadioButton pkcs8;
    @FXML public RadioButton pkcs1;
    boolean isLoad = false;
    public AnchorPane panParent;
    FXMLLoader fxmlLoader = null;
    AnchorPane anchorPane = null;
    @FXML public RadioButton rsa2Rdn;
    @FXML public RadioButton ctyRdn;
    @FXML public RadioButton rsaRdn;
    //pan 1 选中radion 取消
    @FXML public Pane pan1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        commonProperty  = CommonProperty.getInstance();
    }
    public static GenKeyController getInstance(){
        return new GenKeyController();
    }

    public GenKeyController() {

    }
    //按钮1处理
    public void rSa2fn(ActionEvent event) {
        rsa2Rdn.setSelected(true);
        setFalse(ctyRdn,rsaRdn);
        commonProperty.setRsa_2(true);
        switchPage("/page/genkey/genkey1.fxml");
    }
    //按钮2处理
    public void chKeyfn(ActionEvent event) {
        ctyRdn.setSelected(true);
        commonProperty.setStateSecret(true);
        setFalse(rsa2Rdn,rsaRdn);
        switchPage("/page/genkey/genkey2.fxml");
    }
    //设置按钮为False操作 并且清空当前布局内容
    public void setFalse(RadioButton red1,RadioButton red2){
        if (red1.equals(rsa2Rdn) || red2.equals(rsa2Rdn)){
            commonProperty.setRsa_2(false);
        }else if (red1.equals(rsaRdn) || red2.equals(rsaRdn)){
            commonProperty.setRsa(false);
        }else if (red1.equals(ctyRdn) || red2.equals(ctyRdn)){
            commonProperty.setStateSecret(false);
        }
        System.out.println("----------");
        red1.setSelected(false);
        red2.setSelected(false);
        panParent.getChildren().removeAll(anchorPane);
    }
    //切换页面处理
    public void switchPage(String url){
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(url));
        try {
            anchorPane = fxmlLoader.load();
            panParent.getChildren().add(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //按钮3处理
    public void rsafn(ActionEvent event) {
        rsaRdn.setSelected(true);
        commonProperty.setRsa(true);
        setFalse(rsa2Rdn,ctyRdn);
        switchPage("/page/genkey/genkey1.fxml");

    }

    //点击PKCS8
    public void clickPKCS8(ActionEvent event) {
        pkcs8.setSelected(true);
        pkcs1.setSelected(false);
        System.out.println(pkcs8);
    }
    //点击PKCS1
    public void clickPKCS1(ActionEvent event){
        pkcs1.setSelected(true);
        pkcs8.setSelected(false);
    }
    //生成密钥方法
    public void generateKey() {

    }
}
