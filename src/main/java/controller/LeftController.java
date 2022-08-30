package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;

public class LeftController implements Initializable {

    @FXML public AnchorPane rightL;

    public boolean isClick = false;

    @FXML public AnchorPane scrollPanContent;

    @FXML public Accordion accordion;

    @FXML public AnchorPane parent;
    @FXML
    public AnchorPane test;
    public Button testA;
    public Button testB;

    @FXML private Button bt1;

    public ScrollPane scrollPane;

    public ScrollPane spId;

    public void initMenu(){

        //菜单栏的选项
        Map<String,List> menus = new HashMap<>();
        String titl1 = "密钥工具";
        String titl2 = "系统工具";
        //密钥1的选项
        List<Button> list1 = new ArrayList<>();
        List<Button> list2 = new ArrayList<>();
        TitledPane titled = new TitledPane();
        titled.setText(titl1);

        titled.setOnMouseClicked(event -> {
            AnchorPane ap = new AnchorPane();
            for (int i=0;i<10;i++){
                Button bt = new Button();
            }
        });

        TitledPane titled2 = new TitledPane();
        titled2.setText(titl2);
        AnchorPane ap1 = new AnchorPane();
        ap1.setPrefHeight(200);
        ap1.setPrefWidth(200);
        ap1.getChildren().addAll(list1);
        ///
        TitledPane titledPane = new TitledPane();
        titledPane.setText("密钥工具");

        AnchorPane ap = new AnchorPane();
        ap.setPrefHeight(200);
        ap.setPrefWidth(200);
        Button bn = new Button("00000000000000");
        Button bn2 = new Button("111111111111");

        bn2.setLayoutY(100);
        bn.setId("btn1");

        bn.setOnMouseMoved(event -> {
            bn.setStyle("-fx-text-fill: red");
        });
        bn.setOnMouseExited(event -> {
            bn.setStyle("-fx-text-fill: #000");
        });
        //看方法
        ap.getChildren().addAll(bn,bn2);
        titledPane.setContent(ap);
        accordion.getPanes().add(titledPane);
        System.out.println("=========");

    }

    public void initMenu2(){
        TitledPane tp1 = new TitledPane();
        tp1.setText("密钥工具");
        tp1.setPrefWidth(163.0);
        tp1.setPrefHeight(258);

        ScrollPane scP = new ScrollPane();
        scP.setPrefHeight(400);
        scP.setPrefWidth(142);

        AnchorPane ap = new AnchorPane();
        ap.setPrefHeight(200);
        ap.setPrefWidth(200);

        Button bt1 = new Button("生成密钥");
        Button bt2 = new Button("签名");
        Button bt3 = new Button("同步验签");
        Button bt4 = new Button("异步验签");
        Button bt5 = new Button("格式转换");
        Button bt6 = new Button("密钥匹配");
        ap.getChildren().add(bt1);
        scP.setContent(ap);
        tp1.setContent(scP);
        accordion.getPanes().add(tp1);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    //点击事件
    //1观看 Elementui 用css实现
    //3菜单
    public void leftmenu3(){
        MenuButton bt1 = new MenuButton();
        MenuButton bt2 = new MenuButton();
        bt2.setLayoutY(23);
        bt1.getItems().add(new MenuItem("TETE1"));
        parent.getChildren().addAll(bt1,bt2);
        bt1.setOnAction(event -> {
            bt2.setLayoutY(46);
            parent.getChildren().addAll(bt1,bt2);
        });
    }
    //2级菜单
    public static List<Button> getCommTools(){
        List<Button> list = new ArrayList<>();
        Button bt1 = new Button("我的API查询");
        Button bt2 = new Button("API再线调试");

        bt1.setOnAction(event -> {

        });
        bt1.setId("bt1");
        list.add(bt1);
        list.add(bt2);
        return list;
    }

    public void testA(ActionEvent event) {
        if (!isClick){
            /*
              Java代码：label.setVisible(false);
              label.setManaged(false);
             */
            scrollPane.setVisible(true);
            scrollPane.setManaged(true);
            isClick = true;
            testB.setLayoutY(400);
        }
        else{
            scrollPane.setVisible(false);
            scrollPane.setManaged(false);
            testB.setLayoutY(48);
            isClick = false;
        }


    }
}
