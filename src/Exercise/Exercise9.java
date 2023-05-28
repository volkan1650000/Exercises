package Exercise;

import java.util.Scanner;

public class Exercise9 {

    //The code that prints out all the numbers from the one input by the user, to the one that is a multiple of 10

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        while(x%10!=0){
            System.out.print(x+" ");
            x++;
        }
    }
}
