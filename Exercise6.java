import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userNum, digitSum=0, decimalCounter=1,splitNum;
        System.out.println("Insert the number you want to sum his digits");
        userNum= scanner.nextInt();
        if (userNum<0)
            userNum*=(-1);
        splitNum=userNum;
        do {
            splitNum /= 10;
            decimalCounter++;
        }while (splitNum>10);
        for (int i=1;i<=decimalCounter;i++) {
            digitSum = digitSum + (userNum % 10);
            userNum /= 10;
        }
        System.out.println("The digits sum is:"+digitSum);

        }
        }
