/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek6day4.exercice3;

/**
 *
 * @author ezekielkouassi
 */
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle() {
        this.width = 4;
        this.height = 5;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return this.height * this.width;
    }
}
