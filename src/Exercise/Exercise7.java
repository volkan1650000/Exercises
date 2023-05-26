package Exercise;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[]x =  {100,10001,-90,845,8787,898,0,1};
        Arrays.sort(x);
        System.out.println("The max  : "+x[x.length-1]);
        System.out.println("The second max : "+x[x.length-2]);
        System.out.println("The min : "+ x[0]);
    }

}
