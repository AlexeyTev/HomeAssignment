import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput; int firstNum=0,secondNum=1,fiboNum=0; //הגדרת משתנים והתחלת הסדרה

        System.out.println("Enter the number you want to check");
        userInput = scanner.nextInt();
        while (fiboNum<userInput) { //המשך הסדרה והדפסתה
            fiboNum = firstNum + secondNum;
            firstNum=secondNum;
            secondNum=fiboNum;
        }
        if (fiboNum==userInput)
            System.out.println(userInput+" is PART of the fibonacci sequence");
        else System.out.println(userInput+" is NOT within the fibonacci sequence");
    }
}
