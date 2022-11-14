import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum,difference,length;
       System.out.println("Enter the first number");
        firstNum= scanner.nextInt();
       do {
           System.out.println("Enter the length");
           length = scanner.nextInt();
       }while (length<0);
        System.out.println("Enter the difference between each number");
        difference= scanner.nextInt();
        for (int i=1;i<length;i++) {
            System.out.print(firstNum+",");
            firstNum += difference;
        }
        System.out.print(firstNum);



    }
}
