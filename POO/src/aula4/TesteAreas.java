/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author faller
 */
public class TesteAreas {
    
    public static void main(String[] args) {
        
        //retangulo
        
        AreaRetangulo objRetangulo1 = new AreaRetangulo();
        
        objRetangulo1.setBase(5.3);
        objRetangulo1.setAltura(2.5);
        
        System.out.println("Area Retangulo = " + objRetangulo1.CalcularAreaRetangulo());
        

        //Triangulo
        
        AreaTriangulo objTriangulo1 = new AreaTriangulo();
        objTriangulo1.setBase(5.3);
        objTriangulo1.setAltura(2.5);
        
        System.out.println("Area Triangulo = " + objTriangulo1.CalcularAreaTriangulo());
    }
    
}
