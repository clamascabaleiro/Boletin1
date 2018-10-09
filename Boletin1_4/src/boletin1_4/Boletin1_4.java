/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float num1 = 0,num2 = 0, suma,resta,producto,cociente;
        System.out.println("Teclea el primer numero : ");
        num1 = ler.nextFloat();
        System.out.println("Teclea el segundo numero : ");
        num2 = ler.nextFloat();
        suma = num1 + num2;
        System.out.println("La suma de num 1 + num 2 es : " + suma );
        resta = num1 - num2;
        System.out.println("La resta de num 1 - num 2 es : " + resta );
        producto = num1 * num2;
        System.out.println("El producto de num 1 * num 2 es : " + producto );
        cociente = num1 / num2;
        System.out.println("El cociente de num 1 / num 2 es : " + cociente );
    }
    
}
