/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_18_2023_java;

/**
 *
 * @author Renn
 */
public class WarmUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point start = new Point(2, 2);
        Point end = new Point(4, 6);
        Line line = new Line(start, end);
        System.out.println("The length is " +  line.findLength());
    }
    
    static class Point {
        private int a;
        private int b;
        static int numOfPoints = 0;
        
        Point(int a, int b) {
            this.a = a;
            this.b = b;
            numOfPoints++;
        }
    }
    static class Line {
        Point a;
        Point b;
        Line(Point start, Point end) {
            this.a = start;
            this.b = end;
        }
        
        double findLength() {
            return Math.sqrt(Math.pow(this.a.a - this.b.a, 2) + Math.pow(this.a.b - this.b.b, 2));
        }
    }
}
