/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float euros = 0, dolar ,conversion = 0;
        
        System.out.println("Teclea la conversion : ");
        conversion = ler.nextFloat();
        System.out.println("Teclea los euros : ");
        euros = ler.nextFloat();
        dolar = euros * conversion;
        System.out.println(euros + "€" +  " equivale a " + dolar + "$");
    }
    
}
