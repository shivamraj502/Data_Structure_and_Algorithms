package day0_4;
// 3. Create a class Circle with field radius; methods getArea() 
//    and getPerimeter(). In main, create a circle and print area/perimeter.
public class Circle {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI *radius*radius;
    }

    public double getPerimeter(){
        return Math.PI *2 *radius;
    }

    public static void main(String args[]){
        Circle circle = new Circle(7);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: "+ circle.getPerimeter());

    }
}
