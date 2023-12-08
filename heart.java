import javafx.geometry.Rectangle2D;

public class heart extends AnimatedThing{
    public int life = 5;

    public heart(int x, int y, String path){
        super(x,y,path,0,5,5,500,60,80,54,5);
    }

    public void update_life(int life){
        getSpriteSheet().setViewport(new Rectangle2D(offsetx,offsety+(windowY+betweenLine)*(5-life),windowX,windowY));
    }

}
