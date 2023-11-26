import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public abstract class AnimatedThing {
    double x;
    double y;
    ImageView spriteSheet;
    int attitude;
    int index;
    int duration;
    int max_index;
    int windowX;
    int windowY;
    int offset;

    public AnimatedThing(int x, int y, String path,int attitude,int index){
        this.x = x;
        this.y = y;
        Image image = new Image(path);
        this.spriteSheet = new ImageView(image);
    }

    public ImageView getSpriteSheet() {
        return spriteSheet;
    }
}
