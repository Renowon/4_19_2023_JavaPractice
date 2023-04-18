/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

/** The difference between class variables (data field) and method variables (local variables)
 *
 * @author Renn
 */
public class Student {
    String name;    // name has default value null
    int age;    // age has defualt value 0
    boolean isScienceMajor; //isScienceMajor has default value false
    char gender;    // gender has default value '\u0000'
    
    public static void main(String[] args) {
       Student student = new Student();
       
        System.out.println("name: " + student.name);
        System.out.println("age: " + student.age);
        System.out.println("isScienceMajor: " + student.isScienceMajor);
        System.out.println("gender: " + student.gender);
        
        /**
         * int a;
         * System.out.println("a: " + a);
         * compile error! Java does not assign default value to local variable inside method
         */
    }
}
