abstract class Shape
{
    protected int x,y;
    Shape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public abstract void erase();
    public abstract void draw();
    public void moveTo(int newX, int newY)
    {
        erase();
        this.x=newX;
        this.y=newY;
        draw();
    }
}
class Circle extends Shape
{
    Circle(int x,int y)
    {
        super(x,y);
    }
    @Override
    public void erase()
    {
        System.out.println("Xoa hinh tron tai: "+this.x +" "+this.y);
    }
    @Override
    public void draw()
    {
        System.out.println("Ve hinh tron tai: "+this.x +" "+this.y);
    }
}
class Square extends Shape
{
    Square(int x, int y)
    {
        super(x,y);
    }
    @Override
    public void erase()
    {
        System.out.println("Xoa hinh vuong tai: "+this.x +" "+this.y);
    }
    @Override
    public void draw()
    {
        System.out.println("Ve hinh vuong tai: "+this.x +" "+this.y);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle(10,10);
        c.moveTo(20,20);
    }
}
