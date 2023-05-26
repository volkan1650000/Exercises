package Exercise;

import java.util.Arrays;

public class Exercise6 {
    //The code will change the symbol of the int elements of an array
    public static void main(String[] args) {

        int[] intArray = {1,2,-3,4,-5,-6};
        int[] intNewArray = new int[intArray.length];
        int counter = 0;
        for(int w : intArray){
            intNewArray[counter]=w*-1;
            counter++;
        }
        System.out.println(Arrays.toString(intNewArray));
    }
}
