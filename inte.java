// 2) Create a program to manage different shapes. 
//Define an interface Shape' with a method calculate Area(). 
//Implement a superclass 'AbstractShape' with a method 'displayDetails()' that provides a generic display for shapes. 
//Implement subclasses (e.g., 'Circle', 'Rectangle") that extend 'AbstractShape' and implement 'Shape'. 
//Add a method 'initialize()' in the 'AbstractShape' class. Implement subclasses to initialize specific attributes when an object is created.
// Add a method 'initialize()' in the 'AbstractShape' class to set default values.
// - Implement subclasses that extend 'AbstractShape' and implement "Shape".
// - Access the superclass constructor and the 'initialize() method to set attributes when an object is created.
// Demonstrate how the subclasses utilize both superclass constructors and initialization methods.



public class inte{
    public static void main(String[] args) {

        Circle  s =new Circle(10);
        s.initialize();
        s.displayDetails();
        
        Rectangle  r =new Rectangle(10,10);
        r.initialize();
        r.displayDetails();
    }
    
}

interface Shape{
   double CalculateArea();
}
abstract class AbstractShape implements Shape{
    double area;

    AbstractShape(){
        initialize();
    }

    abstract void initialize();

    void displayDetails(){
        System.out.println("Area is " + area);
        
    }
}
class Circle extends AbstractShape{
    final double pi = 3.14;
    double radius;

    Circle(double radius){

        this.radius = radius;
    }

    void initialize(){
        area = CalculateArea();
    }
    public double CalculateArea(){
        return pi*(radius*radius);
    }


}
class Rectangle extends AbstractShape{
    double length;
    double width;

    Rectangle(double length,double width){

        this.length = length;
        this.width = width;
    }

    void initialize(){
        area = CalculateArea();
    }
    public double CalculateArea(){
        return length*width;
    }


}
