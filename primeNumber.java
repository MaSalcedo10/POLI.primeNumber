import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int number = num.nextInt();
        
        int addition = 0;

        for(int i=1; i<=number; i++){
            
            int assistant = number%i;
           
            if( assistant==0){
                addition = addition+1;
            }

        }

        if(addition<=2){
            System.out.println("Your number is prime");
        }else{
            System.out.println("Your number isn't prime");
        }

    }
}  