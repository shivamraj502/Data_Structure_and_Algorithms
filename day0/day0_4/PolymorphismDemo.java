/**In Shape class, method draw(). Then Circle extends Shape, Rectangle extends Shape, 
 * override draw() each. In main, use Shape s1 = new Circle(); s1.draw(); to test overriding. 
 * */

class Shape {
    // Method to draw a generic shape
    public void draw() {
        // Print message for generic shape
        System.out.println("Drawing a generic shape");
    }
}

// Circle class extending Shape
class Circle extends Shape {
    // Override the draw method for Circle
    @Override
    public void draw() {
        // Print message for drawing circle
        System.out.println("Drawing a Circle ⭕");
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    // Override the draw method for Rectangle
    @Override
    public void draw() {
        // Print message for drawing rectangle
        System.out.println("Drawing a Rectangle ▭");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    // Override the draw method for Triangle
    @Override
    public void draw() {
        // Print message for drawing triangle
        System.out.println("Drawing a Triangle △");
    }
}

// Main class to test method overriding
public class PolymorphismDemo {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Print header message
        System.out.println("=== Method Overriding Demonstration ===");
        
        // Create Shape reference but Circle object (Polymorphism)
        System.out.println("\n1. Shape reference with Circle object:");
        // Parent class reference, child class object
        Shape s1 = new Circle();
        // This will call Circle's draw() method due to runtime polymorphism
        s1.draw();
        
        // Create Shape reference but Rectangle object
        System.out.println("\n2. Shape reference with Rectangle object:");
        // Parent class reference, child class object
        Shape s2 = new Rectangle();
        // This will call Rectangle's draw() method
        s2.draw();
        
        // Create Shape reference but Triangle object
        System.out.println("\n3. Shape reference with Triangle object:");
        // Parent class reference, child class object
        Shape s3 = new Triangle();
        // This will call Triangle's draw() method
        s3.draw();
        
        // Create actual Shape object
        System.out.println("\n4. Actual Shape object:");
        // Parent class reference, parent class object
        Shape s4 = new Shape();
        // This will call Shape's original draw() method
        s4.draw();
        
        // Demonstrate with array of shapes (Polymorphism in action)
        System.out.println("\n5. Array of different shapes:");
        // Create array of Shape references
        Shape[] shapes = new Shape[4];
        // Store different objects in Shape array
        shapes[0] = new Circle();      // Circle object in Shape reference
        shapes[1] = new Rectangle();   // Rectangle object in Shape reference
        shapes[2] = new Triangle();    // Triangle object in Shape reference
        shapes[3] = new Shape();       // Actual Shape object
        
        // Loop through all shapes and call draw() method
        for (int i = 0; i < shapes.length; i++) {
            // This will call appropriate draw() method for each object
            shapes[i].draw();
        }
        
        // Direct object creation and method calls
        System.out.println("\n6. Direct object creation:");
        // Create Circle object with Circle reference
        Circle circle = new Circle();
        // Call Circle's draw method
        circle.draw();
        
        // Create Rectangle object with Rectangle reference
        Rectangle rectangle = new Rectangle();
        // Call Rectangle's draw method
        rectangle.draw();
    }
}