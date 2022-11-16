public class Triangle implements Shape{
    int a,b,c;

    @Override
    public int getPerimeter() {
        return a+b+c;
    }
}
