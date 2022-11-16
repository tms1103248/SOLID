import java.util.Random;

public class MyBestFigure implements Shape{

    @Override
    public int getPerimeter() {
        return new Random().nextInt() +100;
    }
}
