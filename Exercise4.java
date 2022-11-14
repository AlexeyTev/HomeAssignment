import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int primeCounter = 1;
        int numToCheck = 1;
        int quotient;
        do {
            System.out.println("Enter the amount of prime numbers you want to receive");
            userInput = scanner.nextInt();
        }while (userInput<0);
        do {
            numToCheck++;
            int dividerCounter = 0;
            for (int i = 1; i <= numToCheck; i++) {
                quotient=numToCheck%i;
                if (quotient==0)
                    dividerCounter++;}
            if (dividerCounter==2){
                System.out.print(numToCheck+"; ");
                primeCounter++;}
        }while (primeCounter <= userInput) ;

    }
}