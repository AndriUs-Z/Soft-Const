public class Box {
    public double width;
    public double height;
    public double depth;
    public double getVolume(){
        return width * height * depth;
    }
    
    public void setDimension(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /*public void calculation(double x, double y, double z){
        width = x;
        height = y;
        depth = z;
    }*/
}
