/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author DUNDI
 */
import java.util.Scanner;
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int [] bilangan;
        int kuadrat;
        
        System.out.print("Nilai awal : ");
        int awal = input.nextInt();
        System.out.print("Nilai akhir : ");
        int akhir = input.nextInt();
        bilangan = new int [awal + akhir + 1];
        for (int i = awal; i <= akhir; i++){
            bilangan [i] = i;
        }
        for (int i = awal; i >= akhir; i--){
            bilangan [i] = i;
        }
       if ( awal == akhir && (awal % 2 == 0 || akhir %2 ==0)) {
           System.out.println("Angka ganjil tidak ditemukan");
       } else if ( awal < akhir){
           for (int i = 0; i < bilangan.length; i++){
               kuadrat = bilangan [i]* bilangan[i];
               if (bilangan [i] % 2 != 0){
                   System.out.println(bilangan [i] + "kuadrat : " + kuadrat);
               }
           }
       } else {
           for (int i = bilangan.length - 1; 1 > 0; i--){
               kuadrat = bilangan [i] * bilangan [i];
               if (bilangan [i] % 2 != 0){
                   System.out.println(bilangan [i] + "kuadrat : " + kuadrat);
           }
           }
       }
    }
    
}
