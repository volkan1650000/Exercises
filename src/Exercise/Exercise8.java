package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

    //The method that adds space between each character (not to the end or to the beginning) in an integer list and then prints it

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(3);
        addSpaceBetweenElements(list);
    }
    public static void addSpaceBetweenElements(List<Integer> list){
        String s = "";
        for(int w : list){
            s=s+w+" ";
        }
        System.out.println(s.trim());
    }
}
