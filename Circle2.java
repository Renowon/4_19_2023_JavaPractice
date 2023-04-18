/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

/**
 *
 * @author Renn
 */
public class Circle2 {
    double radius;   
    static int numberOfObjects = 0;
    
    Circle2() {
        this.radius = 1;
        numberOfObjects++;
    }
    
    Circle2(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(3);
        
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Number of circle2 objects created: " + Circle2.getNumberOfObjects());   // as getNumberOfObjects method is static   
                                                                                                    // so ClassName.MethodName(); should be used
                                                                                                    
    }
}
