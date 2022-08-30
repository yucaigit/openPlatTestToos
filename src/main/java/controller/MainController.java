package controller;

import controller.pageController.GenKeyController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class MainController implements Initializable {


    private static ObservableList menu = FXCollections.observableArrayList();//创建一个可观察的ArrayList对象

    @FXML public Tab content;
    @FXML public AnchorPane parent;

    @FXML public AnchorPane leftMenu;
    public Boolean isClick;
    //变化的组件
    @FXML public Button tap1;
    @FXML public MenuButton tap2;
    @FXML public Button tap3;
    //第一个滚动栏
    @FXML public ScrollPane scp1;
    public boolean isClickKeyTools;
    public boolean isClickCommonTools;
    //第一个Pan
    @FXML public Pane pan1;
    //常用工具
    @FXML public ScrollPane scp2;
    //三级不展开菜单
    public AnchorPane pan2;

    FXMLLoader loader = null;
    AnchorPane ap = null;

    public MainController() {

    }



    public static MainController getInstance(){
        return new MainController();
    }

//初始化方法
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        isClickKeyTools = false;
        isClickCommonTools = false;
    }

    //初始化左边菜单
    public void initLeftMenu(){

    }


    public void dianji(ActionEvent event) {
        System.out.println("000");
    }

    /*
    切换页面的方法 没用
     */
    public void changeView(String url){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(url));
        try {
            AnchorPane ap = loader.load();
            content.setContent(ap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //传递参数到提示栏 显示当前页面
    public void showNowView(String str,String str2){
        content.setText("当前页面: "+str+"-"+str2);
    }
//测试方法
    @FXML
    public final void Testf(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/sign.fxml"));
        try {
           AnchorPane pn = loader.load();
            content.setContent(pn);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //生成密钥页面
    public  void genKey(ActionEvent event) {
        showNowView("密钥工具","生成密钥页面");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/generateKey.fxml"));
        try {
            ap = loader.load();
            content.setContent(ap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //签名页面
    public final void signView(){
        showNowView("密钥工具","签名页面");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/sign.fxml"));
        try {
            AnchorPane ap = loader.load();
            content.setContent(ap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //同步验签
    public void synVerfiy(ActionEvent event) {
        showNowView("密钥工具","同步验签页面");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/synVerfiy.fxml"));
        try {
             ap = loader.load();
            content.setContent(ap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //异步验签
    public void asyncView(ActionEvent event) {
        showNowView("密钥工具","异步验签");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/asyncView.fxml"));
        try {
            ap = loader.load();
            content.setContent(ap);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

//格式转换页面
    public void fmtCov(ActionEvent event) {
        showNowView("密钥工具","格式转换");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/fmtcoverView.fxml"));
        try {
            ap = loader.load();
            content.setContent(ap);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //密钥匹配页面
    public void keyMatch(ActionEvent event) {
        showNowView("密钥工具","密钥匹配");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/keyMatch.fxml"));
        try {
            ap = loader.load();
            content.setContent(ap);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //API在线调试
    public void apiOLTest(ActionEvent event) {
        showNowView("常用工具","API在线调试");
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/page/apiOlTest.fxml"));
        try {
            ap = loader.load();
            content.setContent(ap);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //设置scp隐藏
    public void hideScp(){
        scp1.setVisible(false);
        scp1.setManaged(false);
        pan1.setLayoutY(57);
    }
    //设置 Scp显示
    public void showScp(){
        scp1.setVisible(true);
        scp1.setManaged(true);
        pan1.setLayoutY(320);
    }
    //设置 scp2的显示与隐藏
    public void showScp2(){
        scp2.setVisible(true);
        scp2.setManaged(true);
        pan2.setLayoutY(260.0);
    }
    public void hideScp2(){
        scp2.setVisible(false);
        scp2.setManaged(false);
        pan2.setLayoutY(44);
    }
    //密钥工具点击
    public void ketTools(MouseEvent mouseEvent) {
        if (!isClickKeyTools){
            showScp();
            isClickKeyTools = true;
        }else {
            hideScp();
            isClickKeyTools = false;
        }
    }
    //点击常用工具布局
    public void commonTools(MouseEvent mouseEvent) {
        if (!isClickCommonTools){
            showScp2();
            isClickCommonTools = true;
        }else {
            hideScp2();
            isClickCommonTools = false;
        }
    }
}