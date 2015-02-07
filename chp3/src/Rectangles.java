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

        for (int x = 0; x < 5; x++){
            arr[x] = new Rectangles();
            arr[x].height = x + 1;
            arr[x].width = x + 1;
            sumAreas += arr[x].area();
        }

        averageArea = sumAreas / arr.length;

        System.out.println("The average area of all rectangles is " + averageArea);
    }
}
