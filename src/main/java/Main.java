import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

/*
程序主入口
 */
public class Main extends Application {
    private Stage stage;
    private Scene scene;

    //制定左侧菜单属性
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
        MainController instance = MainController.getInstance();
        instance.initLeftMenu();

        Thread.sleep(2000);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        //加载
        FXMLLoader loader = new FXMLLoader();
        //相对路径解析成本地路径
        loader.setLocation(Main.class.getResource("/main.fxml"));
        AnchorPane ap = loader.load();
        scene = new Scene(ap);
        stage.setScene(scene);
        //大小不可调整  ?场景绑定？true
        stage.setResizable(false);
        //stage.initStyle(StageStyle.DECORATED);        窗口样式
        primaryStage.show();
    }

}