/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author BMB
 */
public class JavaApplication1 {

    
    public static void main(String[] args) {
        double[] data={5,3,56,34,123,6};
        Statistics std=new Statistics(data);
        System.out.println("En kucuk:"+std.getMin()+"\nEn buyuk:"+std.getMax()+"\nOrtalama:"+std.getMean());
        System.out.println("\nVaryans:"+std.getVariance());
        
    }
    
    public static class Statistics 
    {
        double[] data;
        int size;  
        public Statistics(double[] data) 
        {
            this.data = data;
            this.size=data.length;
        }
        double getMin(){
            double min = data[0];
            for(int i=0; i<data.length; i++){
                if(min > data[i]){
                    min = data[i];
                }
            }
            return min;
        }
        double getMax(){
            double max = data[0];
            for(int i=0; i<data.length; i++){
                if(max < data[i]){
                    max = data[i];
                }
            }
            return max;
        }

        double getMean(){
            double sum = 0.0;
            for(double a : data)
                sum += a;
            return sum/size;
        }

        double getVariance(){
            double mean = getMean();
            double temp = 0;
            for(double a :data)
                temp += (a-mean)*(a-mean);
            return temp/size;
        }
        public ArrayList<Double> normalDagilim(){
		ArrayList<Double> nm = new ArrayList<>();
		double varyans = getVariance();
		double average = getMean();
		for(int i=0; i<data.length; i++){
		 nm.add(1/varyans*Math.sqrt(2*Math.PI)*(Math.pow(Math.E, (-1)*(Math.pow(data[i]-average, 2)/(2*varyans*varyans)))));
		}
		return nm;
	}
    }
}
