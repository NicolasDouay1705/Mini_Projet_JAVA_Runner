import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    double sizeX;
    double sizeY;
    ImageView image;

    public StaticThing(double X, double Y, String path){
        this.sizeX = X;
        this.sizeY = Y;
        Image imageSheet = new Image(path);
        this.image = new ImageView(imageSheet);
    }

    public ImageView getImage() {
        return image;
    }

}
