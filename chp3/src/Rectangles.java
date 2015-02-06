/**
 * Created by sebass on 2/6/15.
 */
public class Rectangles {
    float height;
    float width;

    float area() {
        return height * width;
    }

    public static void main(String []args){
        Rectangles[]arr = new Rectangles[5];
        float sumAreas = 0;
        float averageArea;

        for (int x = 1; x < 6; x++){
            arr[0] = new Rectangles();
            arr[0].height = x;
            arr[0].width = x;
            sumAreas += arr[0].area();
        }

        averageArea = sumAreas / arr.length;
 
        System.out.println("The average area of all rectangles is " + averageArea);
    }
}
