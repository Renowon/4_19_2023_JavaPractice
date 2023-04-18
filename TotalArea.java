/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

import java.util.Scanner;

/**
 * 1. The reason why methods of Circle3 can be defined in the TotalArea class is because these methods are static methods
 * that operate on an array of Circle3 objects. The TotalArera class serve as a container for these methods,which are related to
 * Circle3 class. However, in general, it is considered best practice to define methods related to a particular class within 
 * that class itself, rather than in a separate class, for better encapsulation and maintainability
 * 2. The syntax Circle3[] is used to declare an array of Circle objects.The [] indicates that the variable being declared
 * is an array, and the CIrcle3 before the [] indicates the type of object that the array can hold. In other words, Circle3[]
 * is not a separate class, but rather a way of declaring an array of Circle3 objects
 * 
 * -> we can create not only an object of the CIrcle3 class, but also an array of objects of the CIrcle3 
 * class using the Circle3[]. Important! Circle3[] is not a separate class, but rather a way of declaring an array of objects 
 * of the Circle3 class.
 * 
 * In Java, a method can return any valid data type, including primitive types, object types, and array types.
 * Important! : When a method returns an object type or an array type, it returns a reference to the object or array,
 * rather than the object or array itself.
 * 
 * @author Renn
 */

public class TotalArea {
    public static void main(String[] args) {
        // Declare circleArray
        Circle3[] circleArray;  // we can create not only the object but also object array
        
        // Create Array
        circleArray = createArray();
        
        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
        
    }
    
    public static Circle3[] createArray() { // return type is Circle3[]. array object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of circles: ");
        String num_str = scanner.nextLine();
        int num_int = Integer.parseInt(num_str);
        
        Circle3[] array = new Circle3[num_int]; // Reference variable that points to Object array of class Circle3
        
        for(int i = 0; i < num_int; i++) {
            array[i] = new Circle3(10 + Math.random() * 90);    // array initialization
        }
        return array;   // the reference of array would be given to circleArray in main method. Then 
                        // circleArray will point to the same object array
                        // So if we want to create array, we should first create object array in the main method and then
                        // create a array in the method and assign its reference to the circleArray.
    }
    
    /** Print an array of circles and their total area */
    public static void printCircleArray(Circle3[] array) {
        System.out.println("Radius\t\t Area");
        
        for(int i = 0 ;i < array.length; i++) {
            System.out.printf("%.2f \t\t %.2f%n", array[i].getRadius(), array[i].getArea());
        }
        
        System.out.printf("The total areas of circles is \t %.2f", sum(array));
    }
    
    public static double sum(Circle3[] array) {
        double sum = 0;
        
        for(int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum;
    }
}