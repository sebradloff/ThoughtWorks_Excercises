/**
 * Created by sebass on 2/6/15.
 */
class Rectangle {
    private float height;
    private float width;

    public Rectangle(float inputHeight, float inputWidth) {
        height = inputHeight;
        width = inputWidth;
    }

    public float perimeter() {
        return (width * 2) + (height * 2);
    }

    public float area() {
        return height * width;
    }

    public static void main(String []args) {
        Rectangle[] arr = new Rectangle[5];
        float sumAreas = 0;
        float sumPerimeters = 0;

        for (int x = 0; x < 5; x++) {
            arr[x] = new Rectangle((x+1),(x+1));
            sumAreas += arr[x].area();
            sumPerimeters += arr[x].perimeter();
        }

        System.out.println("The sum of all areas of all rectangles is " + sumAreas);
        System.out.println("The sum of all perimeters of all rectangles is " + sumPerimeters);
    }
}
