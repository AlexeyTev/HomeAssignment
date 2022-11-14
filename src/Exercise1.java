import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA, numB,numC;
        double sol1, sol2;
        System.out.println("Please insert the value of a");
        numA= scanner.nextInt();
        System.out.println("Please insert value of b");
        numB= scanner.nextInt();
        System.out.println("Please insert value of c");
        numC= scanner.nextInt();
        double squareRoot=(numB*numB)-(4*numA*numC);
        if (squareRoot<0){
            System.out.println("There is no solution");
        }else {sol1=(-numB+Math.sqrt(squareRoot))/(2*numA);
            sol2=(-numB-Math.sqrt(squareRoot))/(2*numA);
            if (sol1==sol2)
                System.out.println("Both solutions are:"+sol1);
            else
        System.out.println("X1="+sol1+" X2="+sol2);}

    }
}
