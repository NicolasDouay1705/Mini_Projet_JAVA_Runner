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
        Hero emmet = new Hero(200,250,"./ressources/img/heros.png",0,0);
        emmet.getSpriteSheet().setX(emmet.x);
        emmet.getSpriteSheet().setY(emmet.y);
        pane.getChildren().add(emmet.getSpriteSheet());
    }

    void render(){
        this.Background_left.getImage().setX(this.Background_left.getImage().getX()-this.camera.getCameraX());
        this.Background_left.getImage().setY(this.Background_left.getImage().getY()-this.camera.getCameraY());
        this.Background_rigth.getImage().setX(this.Background_rigth.getImage().getX()-this.camera.getCameraX());
        this.Background_rigth.getImage().setY(this.Background_rigth.getImage().getY()-this.camera.getCameraY());
    }

}
