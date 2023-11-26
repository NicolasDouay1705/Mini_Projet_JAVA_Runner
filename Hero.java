import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{

    /*
    attitude=0 -> RUN => max_index=5
    attitude=1 -> JUMP => max_index=1
    attitude=2 -> RUN AND SHOOT => max_index=5
    attitude=3 -> JUMP AND SHOOT => max_index=1
     */
    public Hero(int x, int y, String path,int attitude,int index){
        super(x,y,path,attitude,index);
        switch (attitude){
            case 0:
                max_index = 5;
                switch (index){
                    case 0:
                        this.spriteSheet.setViewport(new Rectangle2D(20,0,65,100));
                        break;
                    case 1:
                        this.spriteSheet.setViewport(new Rectangle2D(96,0,65,100));
                        break;
                    case 2:
                        this.spriteSheet.setViewport(new Rectangle2D(172,0,85,100));
                        break;
                    case 3:
                        this.spriteSheet.setViewport(new Rectangle2D(265,0,65,100));
                        break;
                    case 4:
                        this.spriteSheet.setViewport(new Rectangle2D(347,0,65,100));
                        break;
                    case 5:
                        this.spriteSheet.setViewport(new Rectangle2D(423,0,85,100));
                        break;
                }
                break;
            case 1:
                max_index = 1;
                switch (index) {
                    case 0:
                        this.spriteSheet.setViewport(new Rectangle2D(20, 161, 65, 100));
                        break;
                    case 1:
                        this.spriteSheet.setViewport(new Rectangle2D(96, 161, 65, 100));
                }
                break;
            case 2:
                max_index = 5;
                switch (index){
                    case 0:
                        this.spriteSheet.setViewport(new Rectangle2D(12,330,65,100));
                        break;
                    case 1:
                        this.spriteSheet.setViewport(new Rectangle2D(80,330,80,100));
                        break;
                    case 2:
                        this.spriteSheet.setViewport(new Rectangle2D(162,330,85,100));
                        break;
                    case 3:
                        this.spriteSheet.setViewport(new Rectangle2D(257,330,65,100));
                        break;
                    case 4:
                        this.spriteSheet.setViewport(new Rectangle2D(340,330,85,100));
                        break;
                    case 5:
                        this.spriteSheet.setViewport(new Rectangle2D(423,330,85,100));
                        break;
                }
                break;
            case 3:
                max_index = 1;
                switch (index) {
                    case 0:
                        this.spriteSheet.setViewport(new Rectangle2D(17, 493, 65, 100));
                        break;
                    case 1:
                        this.spriteSheet.setViewport(new Rectangle2D(96, 493, 75, 100));
                        break;
                }
                break;
        }
    }
}
