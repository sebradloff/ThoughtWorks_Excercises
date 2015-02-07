/**
 * Created by sebass on 2/6/15.
 */
public class Rectangles {
    private float height;
    private float width;

    public Rectangles(float inputHeight, float inputWidth) {
        height = inputHeight;
        width = inputWidth;
    }

    public float perimeter() {
        return (width * 2) + (height * 2);
    }

    public float area() {
        return height * width;
    }

    public static void main(String []args){
        
    }
}
