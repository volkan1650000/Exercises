package Exercise;

import java.util.Arrays;

public class Exercise4 {

    //The code that finds the sums of euros and dollars given in a single string.

    public static void main(String[] args) {
        String str = "$1 $12 €34 €56 $45 €78";
        String[]a = str.split(" ");

        int sumEuro = 0;
        int sumDollar = 0;

        for(String w : a){
            if(w.contains("$")){
                w=w.replace("$","");
                sumDollar += Integer.parseInt(w);
            }else if(w.contains("€")){
                w=w.replace("€","");
                sumEuro += Integer.parseInt(w);
            }
        }
        System.out.println("Dollar sum : "+sumDollar);
        System.out.println("Euro sum : "+sumEuro);
    }
}
