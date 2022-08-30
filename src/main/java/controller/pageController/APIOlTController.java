package controller.pageController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/*
 * @Author LeiYc
 * @Date 2022/8/26 14:11
 **/
public class APIOlTController implements Initializable {

    public URL location;

    @FXML public AnchorPane leftScrollPan;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    //初始化左边选项栏
    public void initMenu(){
        //每个TitlePan的长度都应该是由它的内容多少而变化
        Accordion an = new Accordion();
        an.setLayoutX(15);
        an.setLayoutY(29);
        an.setPrefHeight(300);
        an.setPrefWidth(166);
        TitledPane tl =  new TitledPane();
        tl.setPrefHeight(180);
        tl.setPrefWidth(166);
        tl.setText("点击");
        an.getPanes().add(tl);
        leftScrollPan.getChildren().add(an);
    }
    public void hTest(){
        Double layoutY = 8.0;
        for (int i=1;i<20;i++){
            Label label = new Label("雷");
            HBox hBox =  new HBox();
            hBox.onMouseClickedProperty().set(event -> {
                System.out.println("处理事件！");
            });
            hBox.getChildren().add(label);
            leftScrollPan.getChildren().add(hBox);
            hBox.setLayoutX(10.0);
            System.out.println(layoutY*i);
            hBox.setLayoutY(layoutY*i*10);
            hBox.setPrefHeight(94.0);
            hBox.setPrefWidth(180.0);
        }
    }
    public void hBoxfun(MouseEvent mouseEvent) {
    }

}
