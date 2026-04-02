/**Create a list/array of Shape references pointing to different subclass objects; loop through and call their draw() method. 
 * See polymorphic behaviour. */

import java.util.ArrayList;
import java.util.List;

// Base class Shape
class Shape {
    // Method to draw a generic shape
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Circle class extending Shape
class Circle extends Shape {
    // Override the draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle ⭕");
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    // Override the draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle ▭");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    // Override the draw method for Triangle
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle △");
    }
}

// Hexagon class extending Shape
class Hexagon extends Shape {
    // Override the draw method for Hexagon
    @Override
    public void draw() {
        System.out.println("Drawing a Hexagon ⎔");
    }
}

// Main class to demonstrate polymorphic behavior
public class PolymorphicShapes {
    public static void main(String[] args) {
        
        System.out.println("=== Polymorphic Behavior with Shape List ===");
        
        // Create a list of Shape references
        List<Shape> shapes = new ArrayList<>();
        
        // Add different subclass objects to the Shape list
        shapes.add(new Circle());       // Circle object in Shape reference
        shapes.add(new Rectangle());    // Rectangle object in Shape reference
        shapes.add(new Triangle());     // Triangle object in Shape reference
        shapes.add(new Hexagon());      // Hexagon object in Shape reference
        shapes.add(new Shape());        // Actual Shape object
        shapes.add(new Circle());       // Another Circle
        shapes.add(new Rectangle());    // Another Rectangle
        
        System.out.println("\nTotal shapes in list: " + shapes.size());
        
        // Loop through the list and call draw() method - POLYMORPHISM IN ACTION!
        System.out.println("\n--- Calling draw() on all shapes ---");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.print("Shape " + (i + 1) + ": ");
            // This is where polymorphism happens!
            // Java calls the appropriate draw() method based on actual object type
            shapes.get(i).draw();
        }
        
        // Alternative: Enhanced for loop
        System.out.println("\n--- Using enhanced for loop ---");
        int count = 1;
        for (Shape shape : shapes) {
            System.out.print("Shape " + count + ": ");
            shape.draw();  // Polymorphic call
            count++;
        }
        
        // Demonstrate with array as well
        System.out.println("\n--- Using Array instead of List ---");
        Shape[] shapeArray = new Shape[5];
        shapeArray[0] = new Circle();
        shapeArray[1] = new Rectangle();
        shapeArray[2] = new Triangle();
        shapeArray[3] = new Hexagon();
        shapeArray[4] = new Circle();
        
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.print("Array Shape " + (i + 1) + ": ");
            shapeArray[i].draw();  // Polymorphic call
        }
        
        // Show what type of objects are actually stored
        System.out.println("\n--- Actual Object Types ---");
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            System.out.println("Shape " + (i + 1) + " is actually: " + 
                             shape.getClass().getSimpleName());
        }
    }
}