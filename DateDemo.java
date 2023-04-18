/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_18_2023_java;

import java.util.Date;

/**
 *
 * @author Renn
 */
public class DateDemo {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()+ 60 * 60 *1000));
    }
}
