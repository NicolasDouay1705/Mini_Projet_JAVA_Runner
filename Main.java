import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Super Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        //Scene theScene = new Scene(pane,600,400,true);
        Camera camera = new Camera(800,0);
        GameScene theGame = new GameScene(pane,600,400,camera);
        theGame.render();
        primaryStage.setScene(theGame);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
