/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pboperulangan;

/**
 *
 * @author DELL
 */
public class segitigaAbjad {
     public static void main(String[] args) {       

        char abjad = 'A';
        char i;
        char j;
        for ( i = 5; i >= 1; i--) {
            for ( j = 1; j <= i; j++) {
                System.out.print((char)(64+j)+ "");
                abjad++;
            }
            System.out.println();
        }
        
        
}
}