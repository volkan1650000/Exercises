package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

    //A simple "guess the number" game

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        int b = random.nextInt(100);
        System.out.println("Guess a number between 0 and 100");

        while(true){
            int a = scan.nextInt();
            if(a==b){
                System.out.println("WINAAAAA");
                break;
            }else if(a<b){
                System.out.println("Bigger plss");
            }else{
                System.out.println("Smaller plss");
            }
        }
    }
}
