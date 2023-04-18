/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

/**
 *  Concept emphasized on class Circle is the usage of overloaded constructor and invoking static method.
 * what if the variable is local variable if the method is static?
 * -> There is an error. Non-static variable cannot be referenced from a static context
 * This means static has a return type behavior. AS we should return int type variable in the method whose return type is int,
 * the static type varaible should be returned in the method whose return type is static
 * 
 * Accessing the static variable/method ? -> ClassName.MethodName() or ClassName.VariableName()
 * @author Renn
 */
class Circle3 {
    
    /** The radius of the circle */
    private double radius = 1;
    /** The number of the objects created */
    private static int numberOfObjects = 0;     // You cannot use if outside of this class as you declare it with private
    
    /** construct a circle with radius 1 */
    public Circle3() {
        numberOfObjects++;
    }
    
    /** Construct a circle with a specific radius */
    public Circle3(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    
    /** Return radius */
    public double getRadius() {
        return radius;
    }
    
    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /** Return numberOfObjects
     * @return  */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
}

class Circle3_Test {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3();
        Circle3 c2 = new Circle3(3);
        
        System.out.println("Radius of c1: " + c1.getRadius());
        System.out.println("Radius of c2: " + c2.getRadius());
        
        c2.setRadius(5);
        
        System.out.println("Changed radius of c2: " + c2.getRadius());
        
        System.out.printf("Area of c1: %.2f%n", c1.getArea());
        System.out.printf("Area of c2: %.2f%n", c2.getArea());
        
        System.out.println("Total number of circle objects: " + Circle3.getNumberOfObjects());
        
    }
}
