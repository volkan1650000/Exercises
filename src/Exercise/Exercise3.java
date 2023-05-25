package Exercise;

import java.util.Scanner;

public class Exercise3 {

    //We will want the user to enter 5 numbers, and then find the addition of the ones that aren't between 5 and 10.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 5 numbers");

        int[]x = new int[5];
        for(int i = 0; i<5; i++){
            x[i]=scanner.nextInt();
        }

        int sum = 0;
        for(int w : x){
            if(w>5 && w<10){
                continue;
            }
            sum+=w;
        }

        System.out.println(sum);
    }
}
