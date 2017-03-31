/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pow;

/**
 *
 * @author BM
 */
public class Pow {

    public static void power( int base , int exp ) {
        int acc = 1 ;
        int e = exp ;
        int b = base ;
        int i=1;
        int result=0;
        if ( exp == 0 ) {
            result=1 ;
        }
        if ( base == 0 ) {
            result=1 ;
        }
        else{
            while ( e != 1 ) {
                if (e%2==1 ) {
                acc*= b;
                }
                b*= b;
                e /= 2 ;
                i++;
            }
        }
            result= acc * b ;
            System.out.println(base+"^"+exp+"="+result);
            System.out.println("\nÇarpma Sayisi="+i);
        
    }
    public static void main(String[] args) {
        power(0,10);
    }
    
}
