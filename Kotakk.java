/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotakk;

/**
 *
 * @author ravih
 */
public class Kotakk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int panjang = 5, lebar = 8 , luas, keliling;
        
      
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");
        System.out.println("Panjang = "+panjang);
        System.out.println("Lebar = "+lebar);
       
        
        luas=panjang*lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang : "+luas);
        System.out.println("Keliling Persegi Panjang: "+keliling );
    }
    
}
