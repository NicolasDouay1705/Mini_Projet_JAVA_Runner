import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    public Camera camera;
    StaticThing Background_left;
    StaticThing Background_rigth;

    public int vers_Droite = 1;

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
                    emmet.update_Hero(time);
                    emmet.gravity(time);
                    //camera.update_camera(time);
                    update_Scene();

                }
        };

        timer.start();

        pane.requestFocus();

        pane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE || event.getCode() == KeyCode.UP || event.getCode() == KeyCode.Z) {
                if (emmet.getSpriteSheet().getY() == 250 ) {
                    emmet.jump();
                }
            }

            if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.D) {
                vers_Droite = 1;
                emmet.jumping = 0;
                emmet.attitude = 0;
                emmet.max_index = 5;
                if ((emmet.spriteSheet.getX()+10) >= 516){
                    camera.x += 10;
                    Background_left.getImage().setX(Background_left.getImage().getX()-10);
                    Background_rigth.getImage().setX(Background_rigth.getImage().getX()-10);
                }
                else {
                    emmet.getSpriteSheet().setX(emmet.spriteSheet.getX() + 10);
                }
            }

            if (event.getCode() == KeyCode.LEFT || event.getCode() == KeyCode.Q) {
                vers_Droite = 0;
                emmet.jumping = 0;
                emmet.attitude = 0;
                emmet.max_index = 5;
                if ((emmet.spriteSheet.getX()-10) <= 0){
                    camera.x -= 10;
                    Background_left.getImage().setX(Background_left.getImage().getX()+10);
                    Background_rigth.getImage().setX(Background_rigth.getImage().getX()+10);
                }
                else {
                    emmet.getSpriteSheet().setX(emmet.spriteSheet.getX() - 10);
                }
            }
        });

    }
    
    public void switch_Background(){
        if (vers_Droite == 1) {
            StaticThing temp = Background_left;
            Background_left = Background_rigth;
            Background_rigth = temp;

            Background_left.getImage().setX(-10);
            Background_rigth.getImage().setX(790);

        } else if (vers_Droite == 0) {
            StaticThing temp = Background_rigth;
            Background_rigth = Background_left;
            Background_left = temp;

            Background_rigth.getImage().setX(10);
            Background_left.getImage().setX(-790);
        }
    }

    public void update_Scene(){
        if (((Background_rigth.getImage().getX() == -10) && (vers_Droite == 1)) || ((Background_left.getImage().getX() == 10) && (vers_Droite == 0))){
            switch_Background();
        }
    }
}
