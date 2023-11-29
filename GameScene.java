import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    public Camera camera;
    StaticThing Background_left;
    StaticThing Background_rigth;

    private double lastUpdate = 0;

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
        Hero emmet = new Hero(200,250,"./ressources/img/heros.png");
        emmet.getSpriteSheet().setX(emmet.x);
        emmet.getSpriteSheet().setY(emmet.y);
        pane.getChildren().add(emmet.getSpriteSheet());

        AnimationTimer timer = new AnimationTimer(){
            @Override
            public void handle(long time) {
                if (time-lastUpdate > 100000000) {
                    emmet.update_animatedThing();
                    camera.update_camera();
                    update_Scene();
                    emmet.gravity();
                    lastUpdate = time;
                }
            }
        };

        timer.start();

        pane.requestFocus();

        pane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE || event.getCode() == KeyCode.UP || event.getCode() == KeyCode.Z) {
                emmet.jump();
            }
            if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.D) {
                emmet.getSpriteSheet().setX(emmet.spriteSheet.getX()+10);
            }
            if (event.getCode() == KeyCode.LEFT || event.getCode() == KeyCode.Q) {
                emmet.getSpriteSheet().setX(emmet.spriteSheet.getX()-10);
            }
        });

    }

    void render(){
        this.Background_left.getImage().setX(this.Background_left.getImage().getX()-this.camera.getCameraX());
        this.Background_left.getImage().setY(this.Background_left.getImage().getY()-this.camera.getCameraY());
        this.Background_rigth.getImage().setX(this.Background_rigth.getImage().getX()-this.camera.getCameraX());
        this.Background_rigth.getImage().setY(this.Background_rigth.getImage().getY()-this.camera.getCameraY());
    }

    public void update_Scene(){
        //ggg
    }

}
