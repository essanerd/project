import java.awt.*;

public class primitivetypesvsreferencetypes1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}