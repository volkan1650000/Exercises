package Exercise;

public class Exercise2 {

    //The method that writes the array elements that add up to the given number, with their indices.

    public static void main(String[] args) {
        int[]x = {4,6,5,-10,8,5,20};
        findElements(x,10);
    }
    static void findElements(int[]x, int y){
        for(int i = 0; i < x.length-1; i++) {
            for(int k = i+1; k<x.length; k++) {
                if(x[i]+x[k]==y){
                    System.out.println(x[i]+" + "+x[k]+" = "+y+", found in the index : "+i+" and "+k);
                }
            }
        }
    }
}
