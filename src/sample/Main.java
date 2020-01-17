package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VideoPlayer videoPlayer=new VideoPlayer("file:///G:/Movies/The%20Dark%20Knight%20(2008)/The.Dark.Knight.2008.720p.BluRay.x264.YIFY.mp4");//Change Filepath here
        Scene scene=new Scene(videoPlayer,1280,760, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
