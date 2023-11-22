public class Camera {
    int x;
    int y;

    public Camera(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getCameraX() {
        return x;
    }

    public int getCameraY() {
        return y;
    }

    @Override
    public String toString(){
        return("("+x+";"+y+")");
    }

}
