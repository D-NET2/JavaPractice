import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class CombiningArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list1.add(4);
        list1.add(5);
        list1.add(14);
        list1.add(51);
        
        
        list2.add(41);
        list2.add(52);
        list2.add(34);
        list2.add(16);
        
        combine(list1, list2);
        Collections.sort(list1);
        System.out.println(list1);
    }
    
    public static void combine(ArrayList<Integer> firstlist , ArrayList<Integer> Secondlist){
        int Firstlistsize = (firstlist.size()-1);
        int extender = (Secondlist.size());
        for(int items : Secondlist){
            int i=0;
            if (i<extender){
                firstlist.add(i+Firstlistsize, items);
            }
            extender++;
        }
    }
    
    
    
    
    
}