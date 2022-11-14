public class Exercise7 {
    public static void main(String[] args) {
        int digitA=0,digitB=0,digitC=0,workNum;
        System.out.println("0");
        for(int i=1;i<=1000;i++){
            if (i<10) {
                System.out.println(i);
            }
            if (i>10 && i<100) {
                digitA = i / 10;
                digitB = i % 10;
            }
            digitA*=digitA;
            digitB*=digitB;
            if (digitA+digitB==i)
                System.out.println(i);
            if (i>100 && i<1000) {
                workNum=i;
                digitA = workNum% 10;
                workNum/=10;
                digitB=workNum%10;
                workNum/=10;
                digitC=workNum;
            }
            digitA=digitA*digitA*digitA;
            digitB=digitB*digitB*digitB;
            digitC=digitC*digitC*digitC;
            if (digitA+digitB+digitC==i)
                System.out.println(i);
        }

    }
}
