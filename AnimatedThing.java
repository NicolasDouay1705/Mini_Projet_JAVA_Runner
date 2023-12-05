import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public abstract class AnimatedThing {
    double x;
    double y;
    ImageView spriteSheet;
    int attitude;
    int index;
    int max_index;
    int windowX;
    int windowY;
    int offsetx;
    int offsety;
    int betweenLine;

    public AnimatedThing(int x, int y, String path,int attitude,int index,int max_index,int windowX,int windowY,int offsetx,int offsety,int betweenLine){
        this.x = x;
        this.y = y;
        Image image = new Image(path);
        this.spriteSheet = new ImageView(image);
        this.attitude = attitude;
        this.index = index;
        this.max_index = max_index;
        this.windowX = windowX;
        this.windowY = windowY;
        this.offsetx = offsetx;
        this.offsety = offsety;
        this.betweenLine = betweenLine;
    }

    public ImageView getSpriteSheet() {
        return spriteSheet;
    }

}


