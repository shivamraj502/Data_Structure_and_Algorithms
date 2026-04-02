/**
 * In class Calculator, write method add(int a, int b) and add(int a, int b, int c). Use overloading.
 * */ 

class Calculator {
    
    // Method to add two integer numbers
    public int add(int a, int b) {
        // Calculate the sum of two numbers
        int result = a + b;
        // Print the addition operation with result
        System.out.println(a + " + " + b + " = " + result);
        // Return the result to the caller
        return result;
    }
    
    // Overloaded method to add three integer numbers
    public int add(int a, int b, int c) {
        // Calculate the sum of three numbers
        int result = a + b + c;
        // Print the addition operation with result
        System.out.println(a + " + " + b + " + " + c + " = " + result);
        // Return the result to the caller
        return result;
    }
    
    // Bonus overloaded method to add four integer numbers
    public int add(int a, int b, int c, int d) {
        // Calculate the sum of four numbers
        int result = a + b + c + d;
        // Print the addition operation with result
        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);
        // Return the result to the caller
        return result;
    }
}

// Main class to test the Calculator
public class MethodOverloadingDemo {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create an object of Calculator class
        Calculator calc = new Calculator();
        
        // Print header message
        System.out.println("=== Method Overloading in Calculator ===");
        
        // Calling add method with two parameters
        System.out.println("\n1. Adding two numbers:");
        // Store the result of two-number addition
        int result1 = calc.add(10, 20);
        
        // Calling overloaded add method with three parameters
        System.out.println("\n2. Adding three numbers:");
        // Store the result of three-number addition
        int result2 = calc.add(5, 15, 25);
        
        // Calling overloaded add method with four parameters
        System.out.println("\n3. Adding four numbers:");
        // Store the result of four-number addition
        int result3 = calc.add(2, 4, 6, 8);
        
        // More examples to demonstrate method overloading
        System.out.println("\n4. More examples:");
        // Call two-number addition
        calc.add(100, 200);
        // Call three-number addition
        calc.add(1, 2, 3);
        // Call four-number addition
        calc.add(10, 20, 30, 40);
        
        // Display summary of all results
        System.out.println("\n=== Results Summary ===");
        // Print result of two-number addition
        System.out.println("Two numbers result: " + result1);
        // Print result of three-number addition
        System.out.println("Three numbers result: " + result2);
        // Print result of four-number addition
        System.out.println("Four numbers result: " + result3);
    }
}