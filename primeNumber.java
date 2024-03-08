import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int number = num.nextInt();
        
        int addition = 0;
//With a loop (for) we look for the residues of the division of the given number and it will help us know if it is equal to zero
        for(int i=1; i<=number; i++){
            
            int assistant = number%i;
//With a (if) we will count the residues to zero and if the residues are 2 it only means that it is a prime number but if it has 
//more than two residues it means that it is not prime.           
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