package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    //The element of the index the user chooses to remove from the array they create, is removed and then the new array is displayed

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you will enter");
        int counter = scan.nextInt();
        int[]x = new int[counter];

        System.out.println("Start adding");

        for(int i = 0; i<counter; i++){
            x[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(x));

        System.out.println("Enter which index you will remove");
        int[]y = new int[counter-1];
        int a = scan.nextInt();
        int count = 0;

        for(int i = 0; i<counter; i++){
            if(i==a){
                continue;
            }
            y[count]=x[i];
            count++;
        }

        System.out.println(Arrays.toString(y));
    }
}
