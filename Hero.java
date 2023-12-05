import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{
    private double lastUpdate = 0;
    int jumping = 0;

    /*
    jumping ====> 0 -> rien | 1 -> saute | -1 -> tombe
    attitude=0 -> RUN => max_index=5
    attitude=1 -> JUMP => max_index=1
    attitude=2 -> RUN AND SHOOT => max_index=5
    attitude=3 -> JUMP AND SHOOT => max_index=1
     */

    public Hero(int x, int y, String path){
        super(x,y,path,0,0,5,84,100,5,0,64);
    }

    public void jump(){
        jumping = 1;
        attitude = 1;
        max_index = 1;
        index = 0;
        getSpriteSheet().setY(getSpriteSheet().getY()-30);
    }

    public void gravity(long time){
        if (getSpriteSheet().getY() < 250 ){
            jumping = -1;
            getSpriteSheet().setY(getSpriteSheet().getY()+1);
        }
        if (getSpriteSheet().getY() == 250){
            jumping = 0;
            attitude = 0;
            max_index = 5;
        }
    }

    public void update_Hero(long time){
        if ((time-lastUpdate) > 100000000){
            if (jumping == 0) {
                spriteSheet.setViewport(new Rectangle2D(offsetx + index * windowX, offsety + attitude * (windowY + betweenLine), windowX, windowY));
                index++;
                if (index > max_index) {
                    index = 0;
                }
            }
            if (jumping == 1){
                index = 0;
                attitude = 1;
                spriteSheet.setViewport(new Rectangle2D(offsetx + index * windowX, offsety + attitude * (windowY + betweenLine), windowX, windowY));
            }
            if (jumping == -1){
                index = 1;
                attitude = 1;
                spriteSheet.setViewport(new Rectangle2D(offsetx + index * windowX, offsety + attitude * (windowY + betweenLine), windowX, windowY));
            }
            lastUpdate = time;
        }
    }
}
