/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmanalysis2;

import javax.sound.midi.Soundbank;

/**
 *
 * @author BMB
 */
public class AlgorithmAnalysis2 {

 
    static int step=0;
    public static void main(String[] args) {
        
        System.out.println("O(b)=>"+usAlOb(5,3)+"\n\n");
        System.out.println("O(logb)=>"+usAlLogb(5, 3)+"  Adım sayisi:"+step);
                       
    }
    public static int usAlOb(int a,int b){
        
        int us=1;
        for(int i=0;i<b;i++){
            us=a*us;
        }
        return us;
    }
    
    public static long usAlLogb(long a,long b){
        step++;
        if(b==0)
            return 1;
        else if(b==1)
            return a;
        else if(b%2==0)
            return usAlLogb(a*a,b/2);
        else 
            return usAlLogb(a*a,b/2)*a;
    }
    
}
