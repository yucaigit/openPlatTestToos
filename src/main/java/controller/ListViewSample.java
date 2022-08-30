package controller;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewSample extends Application {

    public static final ObservableList names = FXCollections.observableArrayList();//创建一个可观察的ArrayList对象
    public static final ObservableList data = FXCollections.observableArrayList();//创建一个客观擦的ArrayList对象

    public static void main(String[] args) {
        launch(args);//启动javaFX程序
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ListView例子");

        final ListView listView = new ListView(data);//创建一个ListView组件，绑定集合对象data
        listView.setPrefSize(200, 250);//设置listView对象的大小
        listView.setEditable(true);//设置listView对象的可编辑属性

        names.addAll(
                "Adam", "Alex", "Alfred", "Albert",
                "Brenda", "Connie", "Derek", "Donny",
                "Lynne", "Myrtle", "Rose", "Rudolph",
                "Tony", "Trudy", "Williams", "Zach"
        );//将可观察的ArrayList数组对象添加相关值

        for (int i = 0; i < 18; i++) {
            data.add("选项" + i);//将可观察的ArrayList类型对象上添加数据值
        }

        listView.setItems(data);//将listView对象上面添加data集合中的数据元素作为选项

        listView.setCellFactory(ComboBoxListCell.forListView(names));//将listView组件的选项条目上添加一个ComboBoxListCell外观其上面挂载了一个可以被观察的ArrayList对象names中的数据

        StackPane root = new StackPane();//堆栈样式布局面板对象的创建
        root.getChildren().add(listView);//stackPane对象上添加listView组件
        primaryStage.setScene(new Scene(root, 200, 250));//创建场景对象并将场景上添加stackPane面板对象，并将舞台对象上添加场景
        primaryStage.show();//舞台展现
    }
}