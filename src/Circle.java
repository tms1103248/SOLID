public class Circle implements Shape{
    int radius;

    @Override
    public int getPerimeter() {
        return 6*radius;
    }
}
