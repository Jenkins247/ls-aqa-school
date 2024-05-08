package point;

public class PointTask {
    public static void main(String[] args) {
        Point pointTwo = new Point(4,5);
        Point pointOne = new Point(3,2);

        System.out.println(pointOne.distance(pointTwo));
    }
}
