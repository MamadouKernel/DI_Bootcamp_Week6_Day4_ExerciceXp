/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek6day4.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    
    public Triangle() {
        this.firstSide = 3;
        this.secondSide = 4;
        this.thirdSide = 5;
    }
    
    public void getPerimeter() {
        System.out.println(this.firstSide + this.secondSide + this.thirdSide);
    }
    
    public void getArea() {
        System.out.println();
    }
}
