import java.util.Scanner;

public class Strong_no_within_range {


    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = in.nextInt();

        System.out.print("Enter the ending range: ");
        int end = in.nextInt();

        System.out.println("Strong Numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
