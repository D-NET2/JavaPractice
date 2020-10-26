import java.util.Scanner;
import java.util.ArrayList;
public class Variance{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        numList.add(2);
        numList.add(7);
        numList.add(2);
       
        
        
        System.out.println("The variance is: " + variance(numList));
    }
    public static double average(ArrayList<Integer> list){
        double sumX = (double)Sumx(list);
        double numItems = (double)n(list);
        double average = (double)(sumX/numItems) ;
        return average;
    }
    
    public static double variance(ArrayList<Integer> list){
        
//        int sumXsquared = SumxSquared(list);
//          double sumX = (double)Sumx(list);
//          double numItems = (double)n(list);
//          double average = (double)(sumX/numItems) ;
          double numItems = (double)n(list);
          double average = average(list);
//        double x_2 = (((double)sumX)/(numItems));
//        double lastpart = (Math.pow(x_2 , 2));
//        double variance =  ( (((double)sumXsquared)/(numItems)) - (lastpart) );
//        return variance;
          double sum1=0;
          for( double item : list){
              sum1 += Math.pow((item - average),2);
          }
          double variance = (double)sum1/(numItems -1);
          return variance;
    }
    
    public static int SumxSquared(ArrayList<Integer> list){
        int sumXTwo =0;
        for( int item : list){
            sumXTwo += (Math.pow(item , 2));//sumXTwo = sumXTwo +(item^2)
        }
        //sum of x to the power 2
        System.out.println(sumXTwo);
        return sumXTwo; 
    }
    
    public static int Sumx(ArrayList<Integer> list){
        int sumX =0;
        for (int item : list){
            sumX += item;
        }
        System.out.println(sumX);
        return sumX;
    }
    
    public static int n(ArrayList<Integer> list){
        int num =0;
        for(int item : list){
            num++;
        }
        System.out.println(num);
        return num;
    }
}