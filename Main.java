import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Super Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        Camera camera = new Camera(0,0);
        GameScene theGame = new GameScene(pane,600,400,camera);
        primaryStage.setScene(theGame);
        primaryStage.show();
    }



    public static void main(String[] args){
        launch(args);
    }

}