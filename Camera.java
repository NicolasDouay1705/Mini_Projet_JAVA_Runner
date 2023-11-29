public class Camera {
    int x;
    int y;

    private double k_sur_m = 1;
    private double f_sur_m = 1.3;
    private double acc_camera;
    private double vit_camera;

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

    public void update_camera(){
        //ggg
    }

}
