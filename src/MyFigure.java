import java.util.Random;

public class MyFigure implements Shape{
    @Override
    public int getPerimeter() {
        return new Random().nextInt();
    }
}
