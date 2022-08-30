import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * @Author LeiYc
 * @Date 2022/8/27 16:50
 **/

public class TestMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //加载
        FXMLLoader loader = new FXMLLoader();
        //相对路径解析成本地路径
        loader.setLocation(Main.class.getResource("/leftMenu.fxml"));

        AnchorPane ap = loader.load();
        Scene scene = new Scene(ap,600,600);
        primaryStage.setScene(scene);
        //大小不可调整  ?场景绑定？true
        primaryStage.setResizable(false);
        //stage.initStyle(StageStyle.DECORATED);   窗口样式
        primaryStage.show();
    }

}