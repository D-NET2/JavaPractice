import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SmartCombining{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
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
        list2.add(4);
        list2.add(14);
        smartCombine(list1, list2);
        System.out.println(list1);
    }
    
    public static void smartCombine(ArrayList<Integer> firstList, ArrayList<Integer> Secondlist){
        int Firstlistsize = (firstList.size()-1);
        int extender = (Secondlist.size());
        for(int items : Secondlist){
            int i=0;
            if (i<extender){
                if(!(firstList.contains(items))){
                    firstList.add(i+Firstlistsize, items);
                }
                else{
                    //skip
                }
            }
            extender++;
        }
    }
        

}


