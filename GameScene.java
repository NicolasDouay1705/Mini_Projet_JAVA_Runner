import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    public Camera camera;
    StaticThing Background_left;
    StaticThing Background_rigth;

    public GameScene(Pane pane, double width, double height, Camera camera){
        super(pane,width,height);
        this.camera = camera;
        this.Background_left = new StaticThing(800,400,"./ressources/img/desert.png");
        this.Background_rigth = new StaticThing(800,400,"./ressources/img/desert.png");
        this.Background_left.getImage().setX(0);
        this.Background_left.getImage().setY(0);
        this.Background_rigth.getImage().setX(800);
        this.Background_rigth.getImage().setY(0);
        pane.getChildren().addAll(Background_left.getImage(), Background_rigth.getImage());
    }

}
