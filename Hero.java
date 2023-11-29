import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{

    /*
    attitude=0 -> RUN => max_index=5
    attitude=1 -> JUMP => max_index=1
    attitude=2 -> RUN AND SHOOT => max_index=5
    attitude=3 -> JUMP AND SHOOT => max_index=1
     */
    public Hero(int x, int y, String path){
        super(x,y,path,0,0,5,84,100,5,0,64);
    }

    public void jump(){
        getSpriteSheet().setY(getSpriteSheet().getY()-30);
    }

    public void gravity(){
        if (getSpriteSheet().getY() < 250 ){
            System.out.println("GRAVITY");
            getSpriteSheet().setY(getSpriteSheet().getY()+1);
        }
    }
}
