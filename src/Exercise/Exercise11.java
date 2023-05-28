package Exercise;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        //Swapping two numbers without creating a new variable:
        int a = 7;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a's new value : " + a);
        System.out.println("b's new value : " + b);

        //Reversing an integer:
        int number = 1234567;
        int numberLength = String.valueOf(number).length();
        String numberToString = String.valueOf(number);

        String reversed = "";
        int last = numberLength - 1;

        for (int i = number; i > 0; i = i / 10) {
            reversed += numberToString.charAt(last);
            last--;
        }
        int reversedNumber = Integer.parseInt(reversed);
        System.out.println("Reversed number : " + reversedNumber);

        //Reversing a string:
        String str = "You can do it!";
        String strReversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed += str.charAt(i);
        }
        System.out.println("Reversed sentence : " + strReversed);

        //Number of digits in an integer:
        int anyNumber = 32121242;
        anyNumber = Math.abs(anyNumber);
        int numberOfDigits = 0;
        //(optional, if you want "0" to count as one digit number, you can add the following :)
        //if(anyNumber==0){numberOfDigits = 1;}
        while(anyNumber>0){
            anyNumber/=10;
            numberOfDigits++;
        }
        System.out.println("Number of digits : "+numberOfDigits);

        //Count even and odd amount in a given integer:
        int x = 222222223;
        int oddAmount = 0;
        int evenAmount = 0;

        int digit = 0;

        for(int i = x; i>0; i/=10){
            digit = i%10;
            if(digit%2==0){
                evenAmount++;
            }else{
                oddAmount++;
            }
        }
        System.out.println("Even amount : "+evenAmount);
        System.out.println("Odd amount : "+oddAmount);
    }
}
