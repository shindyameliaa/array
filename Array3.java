/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author DUNDI
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] dataLaptop = new String [3];
        dataLaptop [0] = "Lenovo | Thinkpad E470";
        dataLaptop [1] = "Lenovo | Legion Y720 ";
        dataLaptop [2] = "Lenovo | YOGA 520 ";
        
        int [] harga = {11450000, 14999000, 7615000};
        System.out.println("HARGA LAPTOP LENOVO 2020");
        System.out.println("--------------------------");
        
        System.out.println(" 1." + dataLaptop [0]+ " = " + "Rp." + harga [0]);
        System.out.println(" 2." + dataLaptop [1]+ " = " + "Rp." + harga [1]);
        System.out.println(" 3." + dataLaptop [2]+ " = " + "Rp." + harga [2]);
    }
    
}
