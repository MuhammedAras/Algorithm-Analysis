/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Random;

/**
 *
 * @author Lenovo-
 */
public class JavaApplication8 {
    
   
   public static void bol(int[] dizi){
        int[] dizi1 = new int[dizi.length/2];
        int[] dizi2=new int[dizi.length-(dizi.length/2)];
        
        for(int i=0;i<dizi.length;i++){
            if(i<dizi.length/2)
                dizi1[i]=dizi[i];
            else
                dizi2[i-dizi1.length]=dizi[i];
        }
        for(int i=dizi1.length-1;i>=0;i--){
            System.out.println("dizi1-->"+dizi1[i]+",");
        }
        System.out.println("\n\n");
        for(int i=0;i<dizi2.length;i++){
            System.out.println("dizi2-->"+dizi2[i]+",");
        }
        int MaxSubSum;
        MaxSubSum = FindMaxSubSum(dizi1, dizi1.length)+FindMaxSubSum(dizi2, dizi2.length);
        System.out.println("\nMaxSubSum="+MaxSubSum);
        
        // ... zaman alan bazı işlemler ... 
        
        
        
       
            
    } 
    public static int FindMaxSubSum(int x[], int n)
    {
    int sum = 0;
    int maxSubSum = 0;
    int i,j,k;
    for (i = 0; i < n; i++)
    {
        for (j = i; j < n; j++)
        {
            sum = 0;
            for (k = i; k <= j; k++)
            {
                sum += x[k];
            }
            if (sum > maxSubSum)
            {
                maxSubSum = sum;
            }
        }
    }
    return maxSubSum;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dizi= new int[5000];
        Random r=new Random();
        for(int i=0;i<dizi.length;i++){
            int a=r.nextInt(10);
            dizi[i]=a;
            //System.out.println(dizi[i]+"\n");
        }
        long startTime = System.currentTimeMillis();
        
        bol(dizi);
        
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime;
        System.out.println("\n\nSure:"+endTime+"-"+startTime+"="+estimatedTime);
    }  
}