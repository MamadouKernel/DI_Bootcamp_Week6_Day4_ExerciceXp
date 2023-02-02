/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek6day4.exercice4;


/**
 *
 * @author KONATE-MK
 *@date 29/01/2023
 */

public class Area {
    
    private double length;
    private double breadth;
    
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double returnArea() {
        return this.length * this.breadth;
    }
    
}


/**
 *
 * @author KONATE-MK
 *@date 29/01/2023
 */
