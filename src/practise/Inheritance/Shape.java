package Git.src.practise.Inheritance;

public class Shape {
    public void draw(){
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw Circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw rectangle");
    }
}
class Mainn{
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.draw();
        Circle circle=new Circle();
        circle.draw();
    }
}