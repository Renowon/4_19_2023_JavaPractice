/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

/**
 *
 * @author Renn
 */
public class Circle1 {
    
    double radius;
    
    /** Construct a circle with radius 1*/
    Circle1() {
        this.radius = 1;
    }
    
    Circle1(double radius) {
        this.radius = radius;
    }
    
    /** Return the area of this circle */
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1(5);
        
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Area of c2 " + c2.getArea());
        
    }
}
