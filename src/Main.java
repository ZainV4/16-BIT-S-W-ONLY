import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        final int processors = sc.nextInt();

        if (!(1 <= processors && processors <= 1000))
            return;

        for (int i = 0; i < processors; i++) {

            final long firstNum = sc.nextLong();
            final long secondNum = sc.nextLong();
            final long thirdNum = sc.nextLong();

            if (!isRange(firstNum, secondNum, thirdNum)) {
                System.out.println("error");
                continue;
            }


            if (firstNum * secondNum == thirdNum) {
                System.out.println("POSSIBLE DOUBLE SIGMA");
            } else {
                System.out.println("16 BIT S/W ONLY");
            }

        }
    }

    public static boolean isRange(long firstNum, long secondNum, long thirdNum) {
        return (Math.pow(-2, 31) <= firstNum && Math.pow(-2, 31) <= secondNum && firstNum <= Math.pow(2, 31) &&
                secondNum <= Math.pow(2, 31) && thirdNum <= Math.pow(2, 63) && thirdNum >= Math.pow(-2, 63));

    }
}