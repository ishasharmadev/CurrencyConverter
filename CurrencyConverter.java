import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your base currency & derived currency : ");
        System.out.println("1. INR \n 2. USD \n 3. EUR \n 4. GBP");
        int base = sc.nextInt();
        int derived = sc.nextInt();
        
        System.out.println("What is your amount? ");
        double amount = sc.nextDouble();
        double result = 0;
        switch(base){
            case 1 : 
                if(derived == 1){result = amount;}
                else if(derived == 2){result = amount*0.012;}
                else if(derived == 3){result = amount*0.11;}
                else {result = amount*0.0095;}
                break;

            case 2 : 
                if(derived == 1){result = amount*83.36;}
                else if(derived == 2){result = amount;}
                else if(derived == 3){result = amount*0.79;}
                else {result = amount*0.93;}
                break;

            case 3 : 
                if(derived == 1){result = amount*89.72;}
                else if(derived == 2){result = amount*1.08;}
                else if(derived == 3){result = amount;}
                else {result = amount*0.86;}
                break;

            case 4 : 
                if(derived == 1){result = amount*104.88;}
                else if(derived == 2){result = amount*1.26;}
                else if(derived == 3){result = amount*1.17;}
                else {result = amount;}
                break;

        }

        System.out.println("Converted amount "+amount+" from "+base+" to "+derived+" is = "+result);
    }
}